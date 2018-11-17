package com.ecolife.ApirestEcolife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import com.ecolife.ApirestEcolife.models.Residuo;
import com.ecolife.ApirestEcolife.repository.ResiduoRepository;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="*") //Libera todos os dominios de acessar a API / ou coloca o link "http..."

public class ResiduoResource {
	
	@Autowired
	ResiduoRepository residuoRepository;
	
	@GetMapping("/residuos")
	public List<Residuo> listaResiduos(){
		return residuoRepository.findAll();
	}
	
	@GetMapping("/residuos/{id}")
	public Residuo listaResiduoUnico(@PathVariable(value="id")long id){
		return residuoRepository.findById(id);
	}
	
	@GetMapping("/residuos_cb/{codigoBarra}")
	public Residuo listaResiduoCodBarra(@PathVariable(value="codigoBarra")String codigoBarra){
		return residuoRepository.findByCodigoBarras(codigoBarra);
	}
		
	@PostMapping("/residuo")
	public ResponseEntity<Residuo> salvaResiduo(@RequestBody Residuo residuo){
		boolean ret = consultaResiduoExistente(residuo);
		if(ret == false){
			Residuo novoEcoResiduo = residuoRepository.save(residuo);
		return ResponseEntity.ok(novoEcoResiduo);
		}else{
			return ResponseEntity.badRequest().build();
		}
		
	}

	@DeleteMapping("/residuo")
	public void DeletaResiduo(@RequestBody Residuo residuo){
		residuoRepository.delete(residuo);
	}
	
	@PutMapping("/residuo")
	public Residuo AtualizaResiduo(@RequestBody Residuo residuo){
		return residuoRepository.save(residuo);
	}
	
	
	public boolean consultaResiduoExistente(Residuo residuo){
		
		Residuo eco =  residuoRepository.findByCodigoBarras(residuo.getCodigoBarras());
		if(eco == null){
			return false;
		}else{
			return true;
		}
			
	}
	
}
