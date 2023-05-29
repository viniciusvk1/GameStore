package com.github.viniciusvk1.GameStore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.viniciusvk1.GameStore.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findByUsuario(String usuario);
}