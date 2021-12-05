/**
 * 
 */
package com.crm.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Pradheep
 *
 */
@Setter
@Getter
@Entity
@Table(name = "customer")
public final class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer customerId;

	@Column(name = "first_name")
	public String firstName;

	@Column(name = "last_name")
	public String lastName;

	@Column(name = "email")
	public String email;

	@Column(name = "contact_number")
	public String contactNumber;

	@Column(name = "country_code")
	public String countryCode;
}
