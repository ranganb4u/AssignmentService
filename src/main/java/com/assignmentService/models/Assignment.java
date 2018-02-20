/**
 * 
 */
package com.assignmentService.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// this creates table and maps the variables to columns in the database
@Entity
@Table(name = "ASSIGNMENT")
public class Assignment implements Serializable{



	
	@Id //primary key in the table
	@Column
	Long assignmentId;
	@Column
	String assignmentName;
	@Column
	String assignmentDes;
	@Column
	String starterCode;
	

	public Long getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(Long assignmentId) {
		this.assignmentId = assignmentId;
	}
	public String getAssignmentName() {
		return assignmentName;
	}
	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}
	public String getAssignmentDes() {
		return assignmentDes;
	}
	public void setAssignmentDes(String assignmentDes) {
		this.assignmentDes = assignmentDes;
	}
	public String getStarterCode() {
		return starterCode;
	}
	public void setStarterCode(String starterCode) {
		this.starterCode = starterCode;
	}
	

	
	
}
