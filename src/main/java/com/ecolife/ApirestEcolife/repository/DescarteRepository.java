package com.ecolife.ApirestEcolife.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecolife.ApirestEcolife.models.Descarte;

public interface DescarteRepository extends JpaRepository<Descarte, Long>{
	
	Descarte findById(long id);
	Descarte findByEcolife(long ecocliente);
	Descarte findByDataDescarte(LocalDateTime dataDescarte);
	Descarte findByEcocliente(long ecocliente);

}
