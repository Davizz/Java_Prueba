package com.ludo.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
	@Id
	@Column(name = "authority")
	private String authority;

	@ManyToOne
	@JoinColumn(name = "name")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role() {
	
	}

	public Role(String authority) {	
		this.authority = authority;		
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
