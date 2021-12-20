package br.com.alura.school.course.matricula;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class MatriculaController {

	@Autowired
	private MatriculaService service;

	@GetMapping(value = "/courses/enroll/report")
	public ResponseEntity<List<Object[]>> listarMatriculados() {
		return ResponseEntity.ok().body(service.FindAllEmailAndQtdMatricula());
	}

	@PostMapping("/courses/{code}/enroll")
	ResponseEntity<MatriculaDTO> newMatricula(@RequestBody MatriculaDTO dto, @PathVariable("code") String code) {
		dto = service.matricularUsuario(dto, code);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().buildAndExpand()
				.toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
}
