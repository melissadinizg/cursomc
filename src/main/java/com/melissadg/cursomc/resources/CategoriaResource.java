package com.melissadg.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	/**
	 * Apenas para consultar usar GET
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST ok!";	
	}
}
