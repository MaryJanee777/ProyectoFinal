package com.gestor_contactos.proyecto_final.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.gestor_contactos.proyecto_final.model.entidad.Persona;

public interface IPersonaDAO extends CrudRepository <Persona,Long> {
    
}
