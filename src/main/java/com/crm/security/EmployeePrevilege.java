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
@Getter
@Setter
@Entity
@Table(name = "emp_previlege")
public class EmployeePrevilege {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	public EmployeePrevilege(int employeeId,int previlegeId) {
		this.empId = employeeId;
		this.previlegeId = previlegeId;
	}

	@Column(name = "emp_id")
	public int empId;

	@Column(name = "previlege_id")
	public int previlegeId;
}
