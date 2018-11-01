package com.ecolife.ApirestEcolife.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecolife.ApirestEcolife.models.Ecolife;

public interface EcolifeRepository extends JpaRepository<Ecolife, Long>{

	Ecolife findById(long id);
	Ecolife findByqrCode(String qrcode);
}
