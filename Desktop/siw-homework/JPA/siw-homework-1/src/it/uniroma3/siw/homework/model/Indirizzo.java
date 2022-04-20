package it.uniroma3.siw.homework.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Column;


@Entity
public class Indirizzo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable=false)
	private String via;
	
	@Column(nullable=false)
	private Long numCivico;
	
	@Column(nullable=false)
	private String comune;

	@Column(nullable=false)
	private Long cap;
	
	@Column(nullable=false)
	private String provincia;
	
	public Indirizzo() {
		
	}
	
	public Indirizzo(String via, Long numCivico, String comune, Long cap, String provincia) {
		this.via = via;
		this.numCivico = numCivico;
		this.comune = comune;
		this.cap = cap;
		this.provincia = provincia;
	}
	
	public Long getId() {
		return this.id;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public Long getNumCivico() {
		return numCivico;
	}

	public void setNumCivico(Long numCivico) {
		this.numCivico = numCivico;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public Long getCap() {
		return cap;
	}

	public void setCap(Long cap) {
		this.cap = cap;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
		
	
}