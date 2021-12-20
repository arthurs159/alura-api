package br.com.alura.school.course.matricula;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.alura.school.course.Course;
import br.com.alura.school.user.User;

public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

	Optional<Matricula> findByUserAndCourse(User user, Course course);
	
	@Query(value = "SELECT user.email AS email, count(matricula.course_id) AS quantidade_matriculas " +
			"FROM MATRICULA matricula " +
			"INNER JOIN USER user " +
			"ON matricula.user_id = user.id " +
			"GROUP BY matricula.user_id",
			nativeQuery = true)
	List<Object[]> FindAllEmailAndQtdMatricula();
	
}
