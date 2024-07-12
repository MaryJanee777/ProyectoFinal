package com.gestor_contactos.proyecto_final.model.service;

import java.util.List;

import com.gestor_contactos.proyecto_final.model.entidad.Persona;

public interface IPersonaService {

    public String guardarPersona(Persona persona);
    public List<Persona>cargarPersonas();

    public String eliminarPersona(Long id);
}
