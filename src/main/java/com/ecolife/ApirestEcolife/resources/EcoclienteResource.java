package com.ecolife.ApirestEcolife.resources;

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

import com.ecolife.ApirestEcolife.models.Ecocliente;
import com.ecolife.ApirestEcolife.repository.EcoclienteRepository;


@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="*") //Libera todos os dominios de acessar a API / ou coloca o link "http..."

public class EcoclienteResource {
	
	@Autowired
	EcoclienteRepository ecoclienteRepository;
	
	@GetMapping("/ecoclientes")
	public List<Ecocliente> listaEcoclientes(){
		return ecoclienteRepository.findAll();
	}
	
	@GetMapping("/ecocliente/{id}")
	public Ecocliente listaEcoclienteUnico(@PathVariable(value="id")long id){
		return ecoclienteRepository.findById(id);
	}

	@PostMapping("/ecocliente")
	public Ecocliente salvaEcocliente(@RequestBody Ecocliente ecocliente){
		return ecoclienteRepository.save(ecocliente);
	}

	@DeleteMapping("/ecocliente")
	public void DeletaEcocliente(@RequestBody Ecocliente ecocliente){
		ecoclienteRepository.delete(ecocliente);
	}
	
	@PutMapping("/ecocliente")
	public Ecocliente AtualizaEcocliente(@RequestBody Ecocliente ecocliente){
		return ecoclienteRepository.save(ecocliente);
	}

}

