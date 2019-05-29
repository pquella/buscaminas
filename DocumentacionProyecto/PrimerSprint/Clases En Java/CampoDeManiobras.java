package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CampoDeManiobras {
	@Id
	@GeneratedValue
	long id;
	
	@Column
	String nombre;
	
	@Column
	String huso;
	
	@Column
	long coordXCentroVisor;
	
	@Column
	long coordYCentroVisor;
	
	@Column
	int zoomInicial;
	
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
	public String getHuso() {
		return huso;
	}
	public void setHuso(String huso) {
		this.huso = huso;
	}
	public long getCoordXCentroVisor() {
		return coordXCentroVisor;
	}
	public void setCoordXCentroVisor(long coordXCentroVisor) {
		this.coordXCentroVisor = coordXCentroVisor;
	}
	public long getCoordYCentroVisor() {
		return coordYCentroVisor;
	}
	public void setCoordYCentroVisor(long coordYCentroVisor) {
		this.coordYCentroVisor = coordYCentroVisor;
	}
	public int getZoomInicial() {
		return zoomInicial;
	}
	public void setZoomInicial(int zoomInicial) {
		this.zoomInicial = zoomInicial;
	}

}
