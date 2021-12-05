/**
 * 
 */
package com.crm.security;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Pradheep
 *
 */
@Setter
@Getter
public class JwtUser {

	private Integer userId;

	private String userType;

	public enum JwtUserType {
		ADMIN_USER, EMPLOYEE
	}
}
