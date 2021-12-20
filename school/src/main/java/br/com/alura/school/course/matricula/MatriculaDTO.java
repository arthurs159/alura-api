package br.com.alura.school.course.matricula;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MatriculaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private LocalDateTime date;
	
    @Size(max=20)
    @NotBlank
    @JsonProperty
	private String username;
	
    @Size(max=10)
    @NotBlank
    @JsonProperty
	private String code;
	
	public MatriculaDTO() {}

	MatriculaDTO(String username, String code, LocalDateTime date) {
        this.date = date;
		this.username = username;
        this.code = code;
    }
	
	MatriculaDTO(Matricula entity){
		date = entity.getDate();
		username = entity.getUser().getUsername();
		code = entity.getCourse().getCode();
	}
	
	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
