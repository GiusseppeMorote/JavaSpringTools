package com.mitocode.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.iPeliculaDAO;
import com.mitocode.model.Pelicula;

//paso5: llamo a mis metodos definidos
//declaro a mi interfaz para poder acceder a
	//los metodos del jpa
/* y los guardo con save
 * que proviene de JpaRepository
 * 
 * */

@Service
public class PeliculaServiceImpl implements iPeliculaService {

	@Autowired
	private iPeliculaDAO dao;
	
	@Override
	public void registrar(Pelicula pel) {
		dao.save(pel);
	}

	@Override
	public void modificar(Pelicula pel) {
		dao.save(pel);
	}
	
	@Override
	public List<Pelicula> listar() {
		return dao.findAll();
	}

	@Override
	public Pelicula listarPorId(int id) {
		Optional<Pelicula> op = dao.findById(id);
		return op.isPresent() ? op.get() : new Pelicula();
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);
		
	}	

}
