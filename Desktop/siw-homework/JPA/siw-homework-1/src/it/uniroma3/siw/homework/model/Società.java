package it.uniroma3.siw.homework.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


import javax.persistence.Column;


@Entity
public class Società {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable=false)
	private String ragioneSociale;
	
	@Column(nullable=false)
	private String tel;
	
	@OneToOne
	private Indirizzo indirizzo;
	
	public Società() {
		
	}
	
	public Società(String ragioneSociale, String tel, Indirizzo indirizzo) {
		this.ragioneSociale = ragioneSociale;
		this.tel = tel;
		this.indirizzo = indirizzo;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public long getId() {
		return id;
	}
	
	
}