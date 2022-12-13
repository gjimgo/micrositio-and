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
@Table(name = "perfiles")
public class Perfil implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "idperfil")
	private int idperfil;
	
	@Column(name = "perfil")
	private String perfil;
	
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

	
	
	public int getIdperfil() {
		return idperfil;
	}

	public void setIdperfil(int idperfil) {
		this.idperfil = idperfil;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
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
