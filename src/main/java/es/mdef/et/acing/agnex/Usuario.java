package es.mdef.et.acing.agnex;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
	int id;
	String nombre;
	String telefono;
	
	@OneToOne
	CampoDeManiobras campoDeManiobras;
	
	@OneToOne
	Perfil perfil;
	
	@OneToMany
	List<Correo> correos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Correo> getCorreos() {
		return correos;
	}
	public void setCorreos(List<Correo> correos) {
		this.correos = correos;
	}

}
