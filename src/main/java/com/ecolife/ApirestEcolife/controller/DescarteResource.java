package com.ecolife.ApirestEcolife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecolife.ApirestEcolife.models.Descarte;
import com.ecolife.ApirestEcolife.repository.DescarteRepository;


@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="*") //Libera todos os dominios de acessar a API / ou coloca o link "http..."

public class DescarteResource {
	
	@Autowired
	DescarteRepository descarteRepository;
	
	@GetMapping("/descartes")
	public List<Descarte> listaDescarte(){
		return descarteRepository.findAll();
	}
	
	@GetMapping("/descarte/{id}")
	public Descarte listaDescarteUnico(@PathVariable(value="id")long id){
		return descarteRepository.findById(id);
	}
	
	@PostMapping("/descarte")
	public Descarte salvaDescarte(@RequestBody Descarte descarte){
		return descarteRepository.save(descarte);
	}

	@DeleteMapping("/descarte")
	public void DeletaDescarte(@RequestBody Descarte descarte){
		descarteRepository.delete(descarte);
	}
	
	@PutMapping("/descarte")
	public Descarte AtualizaDescarte(@RequestBody Descarte descarte){
		return descarteRepository.save(descarte);
	}
}

