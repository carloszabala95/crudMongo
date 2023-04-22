
package com.czcompany.crudmongo.service;

import com.czcompany.crudmongo.model.Persona;
import java.util.List;
import java.util.Optional;

public interface PersonaService {
    
    List<Persona> getAllPersonas(); // nos da el listado de personas
    Optional<Persona> getPersonaById(Long id);//selecciona personas por id
    Persona savePersona(Persona persona);//Guardar persona en bd
    void deletePersonaById(Long id);//Elimina persona y no retorna nada
    
}
