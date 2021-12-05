/**
 * 
 */
package com.crm.employee;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.crm.security.AdminUserPrevilege;
import com.crm.security.Previlege;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Pradheep
 *
 */
@Getter
@Setter
@Entity
@Table(name = "admin_user")
@ToString
public class AdminUser extends User {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	@Column(name = "email")
	public String userEmail;

	@Column(name = "first_name")
	public String firstName;

	@Column(name = "last_name")
	public String lastName;

	@Column(name = "is_email_verified")
	public boolean isEmailVerified;

	@Column(name = "salt")
	public byte[] secretKey;

	@Column(name = "password")
	public String password;	

	@Override
	public String getUsername() {
		return this.userEmail;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

}
