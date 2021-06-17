package com.reservation.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column (name="id" ,nullable=false,unique=true)
    private Long userid;
     
    @Column(nullable = false, unique = true, length = 45)
    private String email;
     
    @Column(nullable = false, length = 64)
    private String password;
     
    @Column( nullable = false, length = 20)
    private String firstName;
     
    @Column( nullable = false, length = 20)
    private String lastName;
    
    @OneToMany(mappedBy="user",fetch = FetchType.LAZY)
    private List<Ticket> tick;
    
	public void setTick(List<Ticket> tick) {
		this.tick = tick;
	}

	public List<Ticket> getTick() {
		return tick;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long id) {
		this.userid = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	@Override
	public String toString() {
		return "User [id=" + userid + ", email=" + email + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName +"]";
	}
    
}
