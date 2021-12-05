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
@Table(name = "previlege")
@Setter
@Getter
public class Previlege {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;

	@Column(name = "previlege_name")
	public String previlegeName;
}
