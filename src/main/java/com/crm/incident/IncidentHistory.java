/**
 * 
 */
package com.crm.incident;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.crm.employee.Employee;

import lombok.Getter;
import lombok.Setter;

/**
 * @author deep90
 *
 */
@Getter
@Setter
@Entity
@Table(name = "incident_history")
public class IncidentHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "incident_id")
	private int incidentId;

	@Column(name = "change_done")
	private String changeDone;

	@OneToOne(targetEntity = Employee.class, cascade = CascadeType.ALL)
	private Employee employeeId;
}
