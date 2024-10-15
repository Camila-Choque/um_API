package com.example.um_API;

import com.example.um_API.repositories.PersonaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  um_APIApplication {
	private static final Logger logger = LoggerFactory.getLogger(um_APIApplication.class);

	@Autowired
	private PersonaRepository personaRepository;
	public static void main(String[] args) {
		SpringApplication.run(um_APIApplication.class, args);

		System.out.println("funcionando el proyecto");
	}







}
