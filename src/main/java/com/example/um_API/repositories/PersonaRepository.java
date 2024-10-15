package com.example.um_API.repositories;

import com.example.um_API.entities.Persona;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}