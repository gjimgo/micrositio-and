package com.and.micrositio.api.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "modulos")
public class Modulo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "idmodulo")
	private int idmodulo;
	
	@Column(name = "modulo")
	private String modulo;
	
	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
	
	@PrePersist
	public void prePersist() {
		created = new Date();
	}
	
	@Column(name = "update_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;
	
	
	
	public int getIdmodulo() {
		return idmodulo;
	}
	
	public void setIdmodulo(int idmodulo) {
		this.idmodulo = idmodulo;
	}
	
	public String getModulo() {
		return modulo;
	}
	
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	
	public Date getCreated() {
		return created;
	}
	
	public void setCreated(Date created) {
		this.created = created;
	}
	
	public Date getUpdated() {
		return updated;
	}
	
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
}
