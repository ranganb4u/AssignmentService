package com.assignmentService.models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
// Spring Data JPA creates Data Access Object for the entity 
//by extending the CrudRepository interface provided by Spring.
@Transactional
public interface AssignmentRepository extends CrudRepository<Assignment, Long> {
	
	//methods such as save, delete, deleteAll, findOne, findAll can be used by extending the CrudRepository
	  public Assignment findByAssignmentId(Long assignmentId);
}
