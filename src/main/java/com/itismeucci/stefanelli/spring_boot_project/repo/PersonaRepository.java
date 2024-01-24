package com.itismeucci.stefanelli.spring_boot_project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itismeucci.stefanelli.spring_boot_project.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
