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

import lombok.Getter;
import lombok.Setter;

/**
 * @author Pradheep
 *
 */
@Getter
@Setter
@Entity
@Table(name="department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;	
	
	@Column(name="dept_name")
	public String name;	
	
	@OneToOne(targetEntity=Employee.class,cascade=CascadeType.ALL)
	public Employee departmentLead;
}
