package es.mdef.et.acing.agnex;

import java.util.Collection;

public interface IObjetoGrafico {
	public Collection<Estado> getEstados();
	public Estado getEstadoActual();
	public boolean newEstado(Estado e);
	public boolean delEstado(Estado e);
}
