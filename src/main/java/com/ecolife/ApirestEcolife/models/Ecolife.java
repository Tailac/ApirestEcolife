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
@Table(name="TB_ECOLIFE")
public class Ecolife implements Serializable {
	
	private static final long serialVerionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String descricao;
	
	private String endereco;
	
	@NotNull
	private String qrCode;
	
	private String codigoSeguranca;
	
	@NotNull
	private String status;
	
	private String coleta;
	
	private String imgQRCode;

	
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getCodigoSeguranca() {
		return codigoSeguranca;
	}
	public void setCodigoSeguranca(String codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getColeta() {
		return coleta;
	}
	public void setColeta(String coleta) {
		this.coleta = coleta;
	}
	public static long getSerialverionuid() {
		return serialVerionUID;
	}
	
	public String getImgQRCode() {
		return imgQRCode;
	}
	public void setImgQRCode(String imgQRCode) {
		this.imgQRCode = imgQRCode;
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
		Ecolife other = (Ecolife) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	

}
