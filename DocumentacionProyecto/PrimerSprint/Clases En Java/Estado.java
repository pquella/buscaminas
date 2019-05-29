package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Estado {
	@Id
	@GeneratedValue
	long id;
	
	@Column
	String nombre;
	
	@Column
	Date fecha;
	
	@Column
	String rutaDelIcono;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getRutaDelIcono() {
		return rutaDelIcono;
	}
	public void setRutaDelIcono(String rutaDelIcono) {
		this.rutaDelIcono = rutaDelIcono;
	}
	
}
