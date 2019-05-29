package es.mdef.et.acing.agnex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="correos")
public interface CorreoDAO extends JpaRepository<Correo,Integer>{

}
