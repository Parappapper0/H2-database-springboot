package com.itismeucci.stefanelli.spring_boot_project.model;



import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Persona {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private long id;
    private String name;
    private String surname;
    private int age;

    @Override
    public String toString() {
        return "ID: " + id + ", NAME: " + name + ", SURNAME: " + surname + ", AGE: " + age;
    }
    
    public Persona() {}

    public Persona(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static ArrayList<Persona> personeInClasse() {

        ArrayList<Persona> a = new ArrayList<>();
        a.add(new Persona("Ahmed"		, "Elshafei..."	, 20));
		a.add(new Persona("Alessandro"	, "Vizzini"		, 18));
		a.add(new Persona("Antonio"	, "Molino"		, 18));
		a.add(new Persona("Davide"		, "Grillo"		, 18));
		a.add(new Persona("Ettore"		, "Garofalo"	, 18));
		a.add(new Persona("Federico"	, "Ciaschi"		, 18));
		a.add(new Persona("Giacomo"	, "Guerrieri"	, 18));
		a.add(new Persona("Giada"		, "Batistoni"	, 18));
		a.add(new Persona("J"			, "J"			, 18));
		a.add(new Persona("Leonardo"	, "Stefanelli"	, 18));
		a.add(new Persona("Livio"		, "Yang"		, 18));
		a.add(new Persona("Lorenzo"	, "Lasagni"		, 18));
		a.add(new Persona("Matteo"		, "Mureddu"		, 18));
		a.add(new Persona("Mattia"		, "Tinacci"		, 18));
		a.add(new Persona("Niccolò"	, "Burrini"		, 18));
		a.add(new Persona("Paolo"		, "Brogi"		, 19));
		a.add(new Persona("Samuele"	, "Rosselli"	, 18));
		a.add(new Persona("Vieri"		, "Moscarelli"	, 18));

        return a;
    }
}
