package com.example.demo.controller;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienController {

	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		return "alien.html";
	}

	@PostMapping(path = "/addAlien", produces = {"application/json"})
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
//		return "alien.html";
	}

	@PutMapping(path = "/updateAlien", produces = {"application/json"})
	public Alien updateAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}

//	@RequestMapping("/getAlien")
//	public String getAlien(@RequestParam(name = "id", required = true) int id, Model model) {
//		Alien alien = repo.findById(id).orElse(new Alien());
//		model.addAttribute("alien", alien);
//		return "showAlien.html";
//	}

	@GetMapping("/aliens")
	public List<Alien> getAliens() {
		return repo.findAll();
	}

	@GetMapping("/alien/{id}")
	public Optional<Alien> getAlien(@PathVariable(name = "id") int id) {
		return repo.findById(id);
	}

	@DeleteMapping("/alien/{id}")
	public String deleteAlien(@PathVariable(name = "id") int id) {
		Alien a = repo.getOne(id);
		repo.delete(a);
		return "Deleted alien id " + id;
	}

}
