
package com.czcompany.crudmongo.api;

import com.czcompany.crudmongo.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonaRepository extends MongoRepository<Persona, Long> {
    
}
