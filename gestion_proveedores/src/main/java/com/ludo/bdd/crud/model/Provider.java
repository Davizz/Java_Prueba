package com.ludo.bdd.crud.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="provider")
public class Provider {

	// id, name, email, phone_number
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	@Size(max = 40, min = 3, message = "Nombre invalido")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_number")
	private int phone_number;
	
	@OneToOne(cascade = CascadeType.ALL, 
			mappedBy = "provider", 
			fetch = FetchType.LAZY)
	private ProviderDetail providerDetail; 
	
	public ProviderDetail getProviderDetail() {
		return providerDetail;
	}

	public void setProviderDetail(ProviderDetail providerDetail) {
		this.providerDetail = providerDetail;
	}
	
	
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "provider_product", joinColumns = {
			@JoinColumn(name = "provider_id")
	}, inverseJoinColumns = {
			@JoinColumn(name = "product_id")
	})
	private List<Product> products = new ArrayList<>(); 
	

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	

	public Provider() {		
	}

	public Provider(long id, String name, String email, int phone_number) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Provider [getId()=" + getId() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ ", getPhone_number()=" + getPhone_number() + "]";
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}


	
	
	
	

}
