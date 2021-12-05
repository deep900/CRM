/**
 * 
 */
package com.crm.incident;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Tracks the history of incident assignation.
 * 
 * @author Pradheep
 *
 */
@Setter
@Getter
@Entity
@Table(name="incident_route")
public class IncidentRoute {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="incident_id")
	private Integer incident;
	
	@Column(name="employee_id")
	private Integer employeeId;
	
	@Column(name="assigned_date")
	private Date assignedDate;
}
