package es.mdef.et.acing.agnex;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Artefacto extends Punto {
	@Column
	private String descripcion;
	
	@Column
	private String comunicacion_UCO;
	
	@Column
	private String comunicacion_Observaciones;
	
	@Column
	private String sennalizacion;
	
	@OneToOne
	private CampoDeManiobras campoDeManiobras;
	
	@OneToOne
	private TipoDeArtefacto tipoDeArtefacto;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getComunicacion_UCO() {
		return comunicacion_UCO;
	}
	public void setComunicacion_UCO(String comunicacion_UCO) {
		this.comunicacion_UCO = comunicacion_UCO;
	}
	public String getComunicacion_Observaciones() {
		return comunicacion_Observaciones;
	}
	public void setComunicacion_Observaciones(String comunicacion_Observaciones) {
		this.comunicacion_Observaciones = comunicacion_Observaciones;
	}
	public String getSennalizacion() {
		return sennalizacion;
	}
	public void setSeñalizacion(String sennalizacion) {
		this.sennalizacion = sennalizacion;
	}
	public CampoDeManiobras getCampoDeManiobras() {
		return campoDeManiobras;
	}
	public void setCampoDeManiobras(CampoDeManiobras campoDeManiobras) {
		this.campoDeManiobras = campoDeManiobras;
	}
	public TipoDeArtefacto getTipoDeArtefacto() {
		return tipoDeArtefacto;
	}
	public void setTipoDeArtefacto(TipoDeArtefacto tipoDeArtefacto) {
		this.tipoDeArtefacto = tipoDeArtefacto;
	}

}
