package it.uniroma3.siw.homework.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.*;
import java.util.List;

import javax.persistence.Column;


@Entity
public class Docente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String lastName;
	
	@Column(nullable=false)
	private LocalDate birthDate;
	
	@Column(nullable=false)
	private String birthPlace;
	
	@Column(nullable=false)
	private String pIva;
	
	@OneToMany
	private List<Corso> listCorsi;
	
	public Docente() {
		
	}
	
	public Docente(String name, String lastName, LocalDate birthDate, String birthPlace, String PIva, List<Corso> listCorsi) {
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.pIva = PIva;
		this.listCorsi = listCorsi;
	}
	
	
	public Long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public LocalDate getBirthDate() {
		return this.birthDate;
	}
	
	public String getBirthPlace() {
		return this.birthPlace;
	}
	
	public String getPIva() {
		return this.pIva;
	}
	
	public List<Corso> getCorsi(){
		return this.listCorsi;
	}
	
	
}
