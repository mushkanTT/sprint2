package com.cg.bugtracking.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.bugtracking.entities.Project;
import com.cg.bugtracking.payload.BaseResponse;
import com.cg.bugtracking.service.ProjectService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@GetMapping("/{id}")
	@ApiOperation(value = "Search a project with an ID",response = Project.class)
	public ResponseEntity<?> fetchProductDetails(@PathVariable("id") long id) {
	
		Project	project = projectService.findProject(id);	
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setStatusCode(1);
		baseResponse.setResponse(project);	
		return new ResponseEntity<>(baseResponse, HttpStatus.OK);		
		
	}

}
