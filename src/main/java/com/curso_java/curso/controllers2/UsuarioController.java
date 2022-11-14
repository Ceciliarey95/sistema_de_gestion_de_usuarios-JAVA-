package com.curso_java.curso.controllers2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curso_java.curso.dao.UsuarioDao;
import com.curso_java.curso.models.Usuario;


@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;

	@RequestMapping(value="api/usuarios/{id}")
	public Usuario getUsuario(@PathVariable Long id){
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Cecilia");
		usuario.setApellido("Rey");
		usuario.setEmail("ceciliarey95.cr@gmail.com");
		usuario.setTelefono("123456789");
		
		return usuario;
	}
	
	@RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuarios(){
		return usuarioDao.getUsuarios();
		
		
	}
	

	@RequestMapping(value="api/usuarios", method=RequestMethod.POST)
	public void registrarUsuarios(@RequestBody Usuario usuario){
		usuarioDao.registrar(usuario);
	}
	
		
	@RequestMapping(value="usuario1")
	public Usuario editarUsuario(){
		Usuario usuario = new Usuario();
		usuario.setNombre("Cecilia");
		usuario.setApellido("Rey");
		usuario.setEmail("ceciliarey95.cr@gmail.com");
		usuario.setTelefono("123456789");
		
		return usuario;
	}
		
	@RequestMapping(value="api/usuarios/{id}", method=RequestMethod.DELETE)
	public void eliminarUsuario(@PathVariable Long id){
		usuarioDao.eliminarUsuario(id);
	}
	
	@RequestMapping(value="usuario3")
	public Usuario buscarUsuario(){
		Usuario usuario = new Usuario();
		usuario.setNombre("Cecilia");
		usuario.setApellido("Rey");
		usuario.setEmail("ceciliarey95.cr@gmail.com");
		usuario.setTelefono("123456789");
		
		return usuario;
	}
}
