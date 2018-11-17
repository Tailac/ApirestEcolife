package com.ecolife.ApirestEcolife.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecolife.ApirestEcolife.models.Ecocliente;

public interface EcoclienteRepository extends JpaRepository<Ecocliente, Long> {

	Ecocliente findById(long id);
	Ecocliente findByCpfOrEmail(String cpf, String email);
}
