
package com.assignmentService.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

import com.assignmentService.models.Assignment;
import com.assignmentService.models.AssignmentRepository;


@RestController
@RequestMapping("/assignment")
public class AssignmentController {
	
	@Autowired
	AssignmentRepository assignmentRepository;

// POST /create  --> Create a new assignment and save it in the database.
	 
	@RequestMapping("/create")
	public Assignment create(Assignment assignment) {
		assignment = assignmentRepository.save(assignment);
	    return assignment;
	}
	
// GET /read  --> Read an assignment using assignment id from the database.
	 
	@RequestMapping("/read")
	public Assignment read(@RequestParam Long assignmentId) {
		Assignment assignment = assignmentRepository.findOne(assignmentId);
		
	    return assignment;
	}
	
// GET /list  --> Read list of assignments from the database and returns the list
	 
	@RequestMapping(value="/list")
	public Iterable<Assignment> getAssignment(){
		return assignmentRepository.findAll();	
	}
		
// PATCH /update  --> Update an assignment record and save it in the database.
	 
	@RequestMapping("/update")
	public Assignment update(@RequestParam Long assignmentId, @RequestParam String assignmentName, @RequestParam String assignmentDes) {
		Assignment assignment = assignmentRepository.findOne(assignmentId);
		assignment.setAssignmentName(assignmentName);
		assignment.setAssignmentDes(assignmentDes);
		assignment = assignmentRepository.save(assignment);
	    return assignment;
	}
	
// DELETE /delete  --> Delete an assignment from the database.
	 
	@RequestMapping("/delete")
	public String delete(@RequestParam Long assignmentId) {
		assignmentRepository.delete(assignmentId);
	    return "assignment #"+assignmentId+" deleted successfully";
	}
}
