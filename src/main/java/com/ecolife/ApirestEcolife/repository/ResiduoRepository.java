package com.ecolife.ApirestEcolife.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecolife.ApirestEcolife.models.Residuo;

public interface ResiduoRepository extends JpaRepository<Residuo, Long>{
	Residuo findById(long id);
	Residuo findByCodigoBarras(String codigoBarra);
}
