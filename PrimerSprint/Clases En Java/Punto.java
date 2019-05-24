package com.example.demo;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Punto extends ObjetoGrafico {
	@Column
	String datum;
	@Column
	char usoUTM;
	@Column
	long coordX;
	@Column
	long coordY;
	
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public char getUsoUTM() {
		return usoUTM;
	}
	public void setUsoUTM(char usoUTM) {
		this.usoUTM = usoUTM;
	}
	public long getCoordX() {
		return coordX;
	}
	public void setCoordX(long coordX) {
		this.coordX = coordX;
	}
	public long getCoordY() {
		return coordY;
	}
	public void setCoordY(long coordY) {
		this.coordY = coordY;
	}

	
}
