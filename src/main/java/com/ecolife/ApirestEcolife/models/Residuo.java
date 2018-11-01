package com.ecolife.ApirestEcolife.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TB_RESIDUO")
public class Residuo implements Serializable {
	
	private static final long serialVerionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String descricao;
	
	@NotNull
	private String tipoResiduo;
	
	@NotNull
	private String valorPontuacao;
	
	private String informações;
	
	private String fabricante;
	
	@NotNull
	private String codigoBarras;
	
	@NotNull
	private String status;
	
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipoResiduo() {
		return tipoResiduo;
	}
	public void setTipoResiduo(String tipoResiduo) {
		this.tipoResiduo = tipoResiduo;
	}
	public String getValorPontuacao() {
		return valorPontuacao;
	}
	public void setValorPontuacao(String valorPontuacao) {
		this.valorPontuacao = valorPontuacao;
	}
	public String getInformações() {
		return informações;
	}
	public void setInformações(String informações) {
		this.informações = informações;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialverionuid() {
		return serialVerionUID;
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
		Residuo other = (Residuo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
	

}
