package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Pelicula;
import com.mitocode.service.iPeliculaService;
//paso6: declaro las rutas que accedere para probar mis endpoints
@RestController
@RequestMapping(value="/peliculas")//le indico que aqui podre acceder a mi crud
public class PeliculaController {
	
	//instancio a pelicula service para poder acceder a su metodo registar
	@Autowired
	private iPeliculaService service;
	

	@PostMapping// le inndico que es un tipo post
	public void  registrar(@RequestBody Pelicula pel) {
		service.registrar(pel);
	}
	
	@PutMapping// le inndico que es un tipo post
	public void  modificar(@RequestBody Pelicula pel) {
		service.modificar(pel);
	}
	
	@GetMapping // le inndico que es un tipo get
	public List<Pelicula>listar(){
		return service.listar();
	}
	
	@GetMapping(value = "/{id}") // le inndico que es un tipo get con un parametro
	public Pelicula listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@DeleteMapping(value="/id") // para eliminar
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
	
}
