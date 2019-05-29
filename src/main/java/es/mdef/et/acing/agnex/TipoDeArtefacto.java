package es.mdef.et.acing.agnex;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TipoDeArtefacto {
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String nombre;
	
	@Column
	private String rutaDelIcono;
	
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
	public String getRutaDelIcono() {
		return rutaDelIcono;
	}
	public void setRutaDelIcono(String rutaDelIcono) {
		this.rutaDelIcono = rutaDelIcono;
	}
}
