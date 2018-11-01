package com.ecolife.ApirestEcolife.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TB_DESCARTE")
public class Descarte implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	@ManyToOne
	private Ecolife ecolife;
	
	@NotNull
	@ManyToOne
	private Ecocliente ecocliente;
	
	@NotNull
	@ManyToOne
	private Residuo residuo;
	
	@NotNull
	private LocalDateTime dataDescarte;

	public long getId_descarte() {
		return id;
	}

	public void setId_descarte(long id) {
		this.id = id;
	}

	public Ecolife getEcolife() {
		return ecolife;
	}

	public void setEcolife(Ecolife ecolife) {
		this.ecolife = ecolife;
	}

	public Ecocliente getEcocliente() {
		return ecocliente;
	}

	public void setEcocliente(Ecocliente ecocliente) {
		this.ecocliente = ecocliente;
	}

	public Residuo getResiduo() {
		return residuo;
	}

	public void setResiduo(Residuo residuo) {
		this.residuo = residuo;
	}

	public LocalDateTime getDataDescarte() {
		return dataDescarte;
	}

	public void setDataDescarte(LocalDateTime dataDescarte) {
		this.dataDescarte = dataDescarte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Descarte other = (Descarte) obj;
		if (id != other.id)
			return false;
		return true;
	}


	

}
