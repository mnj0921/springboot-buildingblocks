package com.stackrest.example.springbootdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity(name="user")
@Entity
//@Table(name="user", schema="usermanagement")
@Table(name="user")
public class User {
	
	@Id //make this as primery key
	@GeneratedValue
	private Long Id;
	
	@Column(name="user_name", length=50,nullable=false,unique=true)
	private String userName;
	@Column(name="first_name",length=50,nullable=false)
	private String firstName;
	@Column(name="last_name",length=50,nullable=false)
	private String lastName;
	@Column(name="email_address", length=50,nullable=false)
	private String email;
	@Column(name="role", length=50,nullable=false)
	private String role;
	@Column(name="ssn", length=50,nullable=false,unique=true)
	private String ssn;
	
	//No arg Constructor
	public User() {
	}
	//Fields Constructor
	public User(Long id, String userName, String firstName, String lastName, String email, String role, String ssn) {
		super();
		Id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
		this.ssn = ssn;
	}
	

	//getter and setters
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", role=" + role + ", ssn=" + ssn + "]";
	}
	
	

}
