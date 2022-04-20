package it.uniroma3.siw.homework.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.time.*;
import java.util.List;

import javax.persistence.Column;


@Entity
public class Allievi {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable=false)
	private String firstName;
	
	@Column(nullable=false)
	private String lastName;

	@Column(nullable=false)
	private LocalDate birthDate;
	
	@Column(nullable=false)
	private String birthPlace;
	
	@Column(nullable=false)
	private String studentId;
	
	@Column
	private String email;
	
	@ManyToMany
	private List<Corso> listCorsi;
	
	@OneToOne
	private Società società;
	
	public Allievi() {
		
	}
	
	public Allievi(String firstName, String lastName, LocalDate birthDate, String birthPlace, String studentId, String email, List<Corso> listCorsi, Società società) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.studentId = studentId;
		this.email = email;
		this.listCorsi = listCorsi;
		this.società = società;
	}
	
	
	
	public long getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Corso> getListCorsi() {
		return listCorsi;
	}

	public void setListCorsi(List<Corso> listCorsi) {
		this.listCorsi = listCorsi;
	}

	public Società getSocietà() {
		return società;
	}

	public void setSocietà(Società società) {
		this.società = società;
	}

	
	
	
	
	
}
