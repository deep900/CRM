/**
 * 
 */
package com.crm.organization;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.crm.employee.Department;
import com.crm.employee.Employee;
import com.crm.serialization.SkipSerialization;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Pradheep
 *
 */
@Getter
@Setter
@Entity
@Table(name = "organization")
public class Organization implements ExclusionStrategy{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "org_name")
	private String organizationName;
	
	@Column(name="head_of_organization")
	private int headOfOrganizationId;

	@OneToMany(targetEntity = Department.class, cascade = CascadeType.ALL)
	private List<Department> departmentList;

	@OneToMany(targetEntity = Employee.class, cascade = CascadeType.ALL)
	private List<Employee> employeeList;

	@SkipSerialization
	@Column(name = "mark_for_delete")
	private boolean markedForDelete;
	
	/*@SkipSerialization
	@OneToOne(targetEntity = Employee.class, cascade = CascadeType.ALL)
	private Employee headOfOrganization;*/

	public boolean shouldSkipClass(Class<?> arg0) {		
		return false;
	}

	public boolean shouldSkipField(FieldAttributes arg0) {		
		return arg0.getAnnotation(SkipSerialization.class) != null;
	}
}
