/**
 * 
 */
package com.crm.attachment;

import java.sql.Blob;
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
 * @author Pradheep
 *
 */
@Setter
@Getter
@Entity
@Table(name="attachment")
public class Attachment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;

	@Column(name="attachment_file")
	public Blob attachmentFile;

	@Column(name="file_name")
	public String fileName;

	@Column(name="attached_date")
	public Date attachmentDate;

}
