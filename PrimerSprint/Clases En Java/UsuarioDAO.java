package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="usuarios")
public interface UsuarioDAO extends JpaRepository<Usuario,Integer>{

}
