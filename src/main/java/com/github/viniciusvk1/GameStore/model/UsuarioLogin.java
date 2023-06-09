package com.github.viniciusvk1.GameStore.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioLogin {
	
	private Long id;
	private String nome;
	private String usuario;
	private String senha;
	private String foto;
	private String tipoUsuario;
    private LocalDate dataNascimento;
	private String token;

}