package com.itismeucci.stefanelli.spring_boot_project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itismeucci.stefanelli.spring_boot_project.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
    List<Persona> findByName(String name);
    List<Persona> findBySurname(String surname);
    List<Persona> findByAge(int age);
}
