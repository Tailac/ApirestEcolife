package com.ecolife.ApirestEcolife.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ecolife.ApirestEcolife.resources.Criptografia;

@Entity
@Table(name="TB_ECOCLIENTE")
public class Ecocliente implements Serializable {
	
	private static final long serialVerionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	private String email;
	private String senha;
	private String pontuacao;
	private String status;
	

	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(String pontuacao) {
		this.pontuacao = pontuacao;
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
		Ecocliente other = (Ecocliente) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
	

	
	
}
