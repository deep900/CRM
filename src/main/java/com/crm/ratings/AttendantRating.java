/**
 * 
 */
package com.crm.ratings;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Pradheep
 *
 */
@Setter
@Getter
public class AttendantRating implements Rating {

	private Integer knowledgeRating;
	
	private String knowledgeRemarks;
	
	private Integer overallRating;
	
	private String overallRemarks;
}
