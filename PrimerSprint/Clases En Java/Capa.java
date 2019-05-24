package com.example.demo;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Capa {
	@Id
	@GeneratedValue
	long id;
	
	@Column
	String nombre;
	
	@Column
	Boolean visible;
	
	@Column
	int orden;
	
	@OneToMany
	Collection<IObjetoGrafico> listaOG;
	
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
	
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	public Boolean getVisible() {
		return visible;
	}
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	public Collection<IObjetoGrafico> getListaOG() {
		return listaOG;
	}
	public void setListaOG(Collection<IObjetoGrafico> listaOG) {
		this.listaOG = listaOG;
	}
	
	
}
