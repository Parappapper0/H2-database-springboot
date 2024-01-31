package com.itismeucci.stefanelli.spring_boot_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

        return personaRepository.findAll().toString();
    }

    @PutMapping("/reset")
    public void resetPersone() {

        personaRepository.deleteAll();
        personaRepository.saveAll(Persona.personeInClasse());
    }

    @GetMapping("/{id}")
    public Persona getRequestSingola(@PathVariable("id") long id) {
        return personaRepository.findById(id).get();
    }

    @PostMapping("")
    public Persona postRequest(@RequestBody Persona p) {
        return personaRepository.save(p);
    }

    @DeleteMapping("/{id}")
    public void deleteRequest(@PathVariable("id") long id) {
        personaRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Persona putRequest(@RequestBody Persona p, @PathVariable("id") long id) {
        
        p.setId(id);
        return personaRepository.save(p);

    }
}
