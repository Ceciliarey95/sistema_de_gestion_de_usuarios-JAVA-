package com.curso_java.curso.controllers2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curso_java.curso.dao.UsuarioDao;
import com.curso_java.curso.models.Usuario;


@RestController
public class AuthController {

	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping(value="api/login", method=RequestMethod.POST)
	public String login(@RequestBody Usuario usuario){
		if (usuarioDao.verificarCredenciales(usuario)){
			return "OK";
		}
		return "FAIL";
	}
}
