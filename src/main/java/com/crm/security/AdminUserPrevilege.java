/**
 * 
 */
package com.crm.security;

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
@Entity
@Table(name = "admin_user_previlege")
@Getter
@Setter
public class AdminUserPrevilege {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="admin_user_id")
	public int adminUserId;
	
	@Column(name="previlege_id")
	public int previlegeId;

}
