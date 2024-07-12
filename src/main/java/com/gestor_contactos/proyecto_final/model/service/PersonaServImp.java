package com.gestor_contactos.proyecto_final.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor_contactos.proyecto_final.model.dao.IPersonaDAO;
import com.gestor_contactos.proyecto_final.model.entidad.Persona;

@Service
public class PersonaServImp implements IPersonaService {
    
    @Autowired
    private IPersonaDAO personaDAO;

    @Override
    public String guardarPersona(Persona persona) {
        personaDAO.save(persona);
        return "El contacto se guardo Correctamente";
    }

    @Override
    public List<Persona> cargarPersonas() {
       return (List<Persona>)personaDAO.findAll();
    }

    @Override
    public String eliminarPersona(Long id) {
        personaDAO.deleteById(id);
        return "Contacto eliminado correctamente";
    }
    
}
