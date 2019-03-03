package com.mitocode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

//paso1
@Entity
public class Pelicula {
	//paso2 declaras las columnas
	@Id // le indico que es mi primary key
	private int idPelicula;
	
	@Column(name="nombre",length=150)//declaro el nombre de la columna con su longitud
	private String nombre;
	
	@Column(name="duracion",length=3)//declaro el nombre de la columna con su longitud
	private int duracion;
	
	@Column(name="urlPortada",length=500)//declaro el nombre de la columna con su longitud
	private String urlPortada;
	
	//para que me muestre en formato fecha
	@JsonSerialize(using=ToStringSerializer.class) // para que el formato de java8 ISODATE
	@Column(name="fechaPublicacion",length=500)//declaro el nombre de la columna con su longitud
	private LocalDate fechaPublicacion;
	
	public int getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getUrlPortada() {
		return urlPortada;
	}
	public void setUrlPortada(String urlPortada) {
		this.urlPortada = urlPortada;
	}
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
		
}
