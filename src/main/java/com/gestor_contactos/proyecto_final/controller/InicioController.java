package com.gestor_contactos.proyecto_final.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gestor_contactos.proyecto_final.model.entidad.Persona;
import com.gestor_contactos.proyecto_final.model.service.IPersonaService;

@Controller
public class InicioController {

    @Autowired
    private IPersonaService personaService;

    @RequestMapping("/")
    public String inicio(Model model){
        Persona persona = new Persona();
        model.addAttribute("persona", persona);
        //listar las personas
        model.addAttribute("listaPersonas", personaService.cargarPersonas());
        return "inicio";
    }

    @RequestMapping(value = "/formulario", method = RequestMethod.POST)
    public String guardar(Persona persona){
        personaService.guardarPersona(persona);
        return "redirect:/";
    }

   @RequestMapping({"/eliminar/{id}"})
   public String eliminar(@PathVariable("id") Long id) {
      this.personaService.eliminarPersona(id);
      return "redirect:/";
   }
}
