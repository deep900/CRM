/**
 * 
 */
package com.crm.incident;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.crm.attachment.Attachment;
import com.crm.customer.Customer;
import com.crm.ratings.IncidentRating;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Pradheep
 *
 */
@Getter
@Setter
@Entity
@Table(name = "incident")
public class Incident {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;

	@Column(name = "short_description")
	public String shortDescription;

	@Column(name = "description")
	public String description;

	@Column(name = "raised_date")
	public Date raisedOn;

	@Column(name = "completion_date")
	public Date completionDate;

	@Column(name = "remarks")
	public String remarks;

	@OneToMany(targetEntity = Attachment.class, cascade = CascadeType.ALL)
	public Set<Attachment> attachments;

	@OneToOne(targetEntity=IncidentRating.class,cascade=CascadeType.ALL)
	public IncidentRating incidentRating;

	@Column(name = "incident_type")
	public String type;

	@Column(name = "incident_status")
	public String status;

	@OneToMany(targetEntity = IncidentHistory.class, cascade = CascadeType.ALL)
	public Set<IncidentHistory> incidentHistory;

	@OneToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
	public Customer customerObj;
}
