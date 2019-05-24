package com.example.demo;

import java.util.Collection;
import java.util.Iterator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
public abstract class ObjetoGrafico implements IObjetoGrafico {
	@Id
	@GeneratedValue
	long idOG;
	
	@OneToMany
	Collection<Estado> historicoDeEstados;
	
	public long getIdOG() {
		return idOG;
	}

	public void setIdOG(long idOG) {
		this.idOG = idOG;
	}

	public Collection<Estado> getHistoricoDeEstados() {
		return historicoDeEstados;
	}
	
	public void setHistoricoDeEstados(Collection<Estado> historicoDeEstados) {
		this.historicoDeEstados = historicoDeEstados;
	}

	@Override
	public Collection<Estado> getEstados() {
		return historicoDeEstados;
	}

	@Override
	public boolean newEstado(Estado e) {
		return getHistoricoDeEstados().add(e);
	}

	@Override
	public boolean delEstado(Estado e) {
		return this.getHistoricoDeEstados().remove(e);
	}

	@Override
	public Estado getEstadoActual() {
		Estado e = null;
		Iterator<Estado> i = this.getHistoricoDeEstados().iterator();
		while (i.hasNext()) {
			e = i.next();
		};
		return e;
	}

}
