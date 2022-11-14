package com.curso_java.curso.dao;

import java.util.List;

import com.curso_java.curso.models.Usuario;

public interface UsuarioDao {

	List<Usuario> getUsuarios();

	void eliminarUsuario(Long id);

	void registrar(Usuario usuario);
	
	boolean verificarCredenciales(Usuario usuario);
	
}
