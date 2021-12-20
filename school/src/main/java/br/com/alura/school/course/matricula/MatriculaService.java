package br.com.alura.school.course.matricula;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import br.com.alura.school.course.Course;
import br.com.alura.school.course.CourseRepository;
import br.com.alura.school.user.User;
import br.com.alura.school.user.UserRepository;

@Service
public class MatriculaService {

	
	@Autowired
	private MatriculaRepository repository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CourseRepository courseRepository;
	
	@Transactional
	public MatriculaDTO matricularUsuario(MatriculaDTO dto, String code) {

		Matricula matricula = new Matricula();
		matricula.setDate(dto.getDate());
		User user = userRepository.findByUsername(dto.getUsername()).orElseThrow();
		matricula.setUser(user);
		Course course = courseRepository.findByCode(code).orElseThrow();
		matricula.setCourse(course);
		
		Optional<Matricula> existeMatricula = repository.findByUserAndCourse(user, course);

		if (existeMatricula.isPresent()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuário já possui matrícula nesse curso");
		}

		matricula = repository.save(matricula);
		return new MatriculaDTO(matricula);
	}
	
	@Transactional(readOnly = true)
	public List<Object[]> FindAllEmailAndQtdMatricula() {
		List<Object[]> quantidadeMatricula = repository.FindAllEmailAndQtdMatricula();

		if (quantidadeMatricula.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "Nenhum usuário matriculado");
		}

		return quantidadeMatricula;
	}
	
}
