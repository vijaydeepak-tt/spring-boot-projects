package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // to make a class as Singleton
public class Alien {
    private int id;
    private String name;
    private String tech;

    @Autowired // search by type
    @Qualifier("lap") // search by name
    // we can use any one of the above @
    private Laptop laptop;

    public Alien() {
        System.out.println("Alien init");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void show() {
        System.out.println("Show alien");
        // By default, it will throw compilation error, duw to Autowire or Qualifier
        laptop.compile();
    }
}
