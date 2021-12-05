/**
 * 
 */
package com.crm.approvals;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "approval")
@ToString
public class Approval {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "request_date")
	private Date requestDate;

	@Column(name = "request_emp_id")
	private Integer requestEmpId;

	@Column(name = "request_approver_id")
	private Integer requestApproverId;
	
	@Column(name="request_admin_id")
	private Integer requestAdminId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="status")
	private String status;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="updated_date")
	private Date updatedDate;	
	
	@Column(name="referenced_object")
	private String referencedObject;

}
