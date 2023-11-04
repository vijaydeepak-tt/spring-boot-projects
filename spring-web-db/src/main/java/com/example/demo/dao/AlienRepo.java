package com.example.demo.dao;

import com.example.demo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
    List<Alien> findByTech(String tech);

    List<Alien> findByIdGreaterThan(int id);

    @Query("from Alien order by name")
    List<Alien> getAliensSorted();

    @Query("from Alien where tech=?1 order by name")
    List<Alien> findByTechSorted(String tech);
}
