/**
 * 
 */
package com.crm.employee;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Pradheep
 *
 */
@Setter
@Getter
@Entity
@Table(name = "employee")
@ToString
public class Employee extends User {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;

	@NotEmpty(message = "Email field cannot be empty")
	@Column(name = "email")
	public String email;

	@NotEmpty(message = "Contact number field cannot be empty")
	@Column(name = "contact_number")
	public String contactNumber;

	@NotEmpty(message = "Country code field cannot be empty")
	@Column(name = "country_code")
	public String countryCode;

	@OneToOne(targetEntity = Department.class, cascade = CascadeType.ALL)
	public Department department;

	@NotEmpty(message = "First name cannot be empty")
	@Column(name = "first_name")
	public String firstName;

	@NotEmpty(message = "Last name cannot be empty")
	@Column(name = "last_name")
	public String lastName;

	@NotEmpty(message = "Designation cannot be empty")
	@Column(name = "designation")
	public String designation;

	@Column(name = "is_email_verified")
	public boolean isEmailVerified;

	@Column(name = "salt")
	public byte[] secretKey;

	@JsonIgnore
	@Column(name = "password")
	public String password;
	
	@Column(name="is_credentials_expired")
	public boolean isCredentialExpired = false;

	@Override
	public String getUsername() {
		return this.email;
	}

	@Override
	public String getPassword() {
		return this.password;
	}
}
