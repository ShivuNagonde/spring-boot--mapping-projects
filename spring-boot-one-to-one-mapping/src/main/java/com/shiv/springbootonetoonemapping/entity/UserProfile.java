package com.shiv.springbootonetoonemapping.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_Profiles")
public class UserProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "address")
	private String address;

	@Column(name = "phon_number")
	private String phoneNumber;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private Gender gender;

	@Column(name = "birth_Of_Date")
	private LocalDate birthOfDate;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "userProfile")
	private User user;
	
	public UserProfile() {
		
	}

	public UserProfile(String address, String phoneNumber, Gender gender, LocalDate birthOfDate) {
		super();
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.birthOfDate = birthOfDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
