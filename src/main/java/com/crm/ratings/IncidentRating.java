/**
 * 
 */
package com.crm.ratings;

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
@Table(name="incident_rating")
public class IncidentRating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="incident_id")
	private Integer incidentId;
	
	@Column(name="what_went_well")
	private String whatWentWell;
	
	@Column(name="rating_number")
	private int ratingNumber;
	
	@Column(name="what_can_be_improved")
	private String whatCanBeImproved;
	
	@Column(name="remarks")
	private String remarks;
}
