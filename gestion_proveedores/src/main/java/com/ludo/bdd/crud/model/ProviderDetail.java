package com.ludo.bdd.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "provider_detail")
public class ProviderDetail {

	// town y person_contact.

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "personContact")
	private String personContact;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Provider provider; 	
	
	public Provider getProvider() {
		return provider;
	}
	
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	

	public ProviderDetail() {
	}

	public ProviderDetail(long id, String city, String personContact) {
		this.id = id;
		this.city = city;
		this.personContact = personContact;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPersonContact() {
		return personContact;
	}

	public void setPersonContact(String personContact) {
		this.personContact = personContact;
	}

	@Override
	public String toString() {
		return "ProviderDetail [getId()=" + getId() + ", getCity()=" + getCity() + ", getPersonContact()="
				+ getPersonContact() + "]";
	}


}
