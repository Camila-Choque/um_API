package com.example.um_API.services;

import com.example.um_API.entities.Autor;
import com.example.um_API.repositories.AutorRepository;
import com.example.um_API.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AutorServicesImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public AutorServicesImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
