package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mitocode.model.Pelicula;

//paso3: extendeer de jpaRository
/* en donde le indico la clase de quien se ha creado y el tipo de dato
 * de mi primary key de mi tabla osea 
 * de mi clase Pelicula => @Id == este es mi pkey
 * */
public interface iPeliculaDAO extends JpaRepository<Pelicula, Integer> {

}
