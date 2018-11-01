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

import com.ecolife.ApirestEcolife.models.Ecolife;
import com.ecolife.ApirestEcolife.repository.EcolifeRepository;



@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="*") //Libera todos os dominios de acessar a API / ou coloca o link "http..."
public class EcolifeResource {
	
	@Autowired
	EcolifeRepository ecolifeRepository;
	
	@GetMapping("/ecolifes")
	public List<Ecolife> listaEcolifes(){
		return ecolifeRepository.findAll();
	}
	
	@GetMapping("/ecolife/{id}")
	public Ecolife listaEcolifeUnico(@PathVariable(value="id")long id){
		return ecolifeRepository.findById(id);
	}
	
	@GetMapping("/ecolife_qrc/{qrcode}")
	public Ecolife listaEcolifeQRCode(@PathVariable(value="qrcode")String qrcode){
		return ecolifeRepository.findByqrCode(qrcode);
	}
		
	@PostMapping("/ecolife")
	public Ecolife salvaEcolife(@RequestBody Ecolife ecolife){
		return ecolifeRepository.save(ecolife);
	}

	@DeleteMapping("/ecolife")
	public void DeletaEcolife(@RequestBody Ecolife ecolife){
		ecolifeRepository.delete(ecolife);
	}
	
	@PutMapping("/ecolife")
	public Ecolife AtualizaEcolife(@RequestBody Ecolife ecolife){
		return ecolifeRepository.save(ecolife);
	}

}
