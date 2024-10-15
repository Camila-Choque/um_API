package com.example.um_API.services;

import com.example.um_API.entities.Persona;
import com.example.um_API.repositories.BaseRepository;
import com.example.um_API.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicesImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    /* Esto es lo que hace el autowired
    public PersonaServices( PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

     */
    public PersonaServicesImpl(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }
}
