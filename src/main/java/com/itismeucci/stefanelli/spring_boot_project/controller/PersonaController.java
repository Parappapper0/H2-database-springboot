package com.itismeucci.stefanelli.spring_boot_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itismeucci.stefanelli.spring_boot_project.model.Persona;
import com.itismeucci.stefanelli.spring_boot_project.repo.PersonaRepository;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    
    @Autowired
    PersonaRepository personaRepository;

    @GetMapping("")
    public String getRequestPersone() {

        if (personaRepository.count() == 0)
            personaRepository.saveAll(Persona.personeInClasse());

        return personaRepository.findAll().toString();
    }

    @GetMapping("/{id}")
    public String getRequestSingola(@PathVariable("id") long id) {
        return personaRepository.findById(id).toString();
    }

    @PostMapping("")
    public String postRequest(@RequestBody Persona p) {
        return personaRepository.save(p).toString();
    }

    @DeleteMapping("/{id}")
    public void deleteRequest(@PathVariable("id") long id) {
        personaRepository.deleteById(id);
    }
}
