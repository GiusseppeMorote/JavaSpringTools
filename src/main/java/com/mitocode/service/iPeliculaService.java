package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Pelicula;
//paso4: defino los metodos de tu crud
public interface iPeliculaService {
	
	public void registrar(Pelicula pel);
	public void modificar (Pelicula pel);
	public List<Pelicula> listar();
	public Pelicula listarPorId(int id);
	public void eliminar (int id);
}
