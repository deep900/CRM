/**
 * 
 */
package com.crm.employee;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Pradheep
 *
 */
@ToString
@Setter
@Getter
public class User implements UserDetails {

	// To be overriden by the sub class.
	public String userName = "";	
	
	@JsonIgnore
	public String password;

	public List<GrantedAuthority> grantedAuthorities;	

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.grantedAuthorities;		
	}

	public String getPassword() {		
		return password;
	}

	public String getUsername() {		
		return userName;
	}

	public boolean isAccountNonExpired() {		
		return true;
	}

	public boolean isAccountNonLocked() {		
		return true;
	}

	public boolean isCredentialsNonExpired() {		
		return true;
	}

	public boolean isEnabled() {		
		return true;
	}	
}
