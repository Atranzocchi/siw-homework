package it.uniroma3.siw.homework.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.time.*;
import java.util.List;

import javax.persistence.Column;


@Entity
public class Corso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private LocalDate startDate;
	
	@Column(nullable=false)
	private Long duration;
	
	@ManyToMany
	private List<Allievi> listAllievi;
	
	@OneToMany
	private Docente docente;	
	
	public Corso() {
		
	}
	
	public Corso(String name, LocalDate startDate, Long duration, List<Allievi> listAllievi, Docente docente) {
		this.name = name;
		this.startDate = startDate;
		this.duration = duration;
		this.listAllievi = listAllievi;
		this.docente = docente;
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public LocalDate getStartDate() {
		return this.startDate;
	}
	
	public Long getDuaration() {
		return this.duration;
	}
	
	public List<Allievi> getAllievi(){
		return this.listAllievi;
	}
	
}
