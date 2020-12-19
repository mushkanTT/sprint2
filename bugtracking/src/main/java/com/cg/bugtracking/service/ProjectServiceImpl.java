package com.cg.bugtracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bugtracking.entities.Project;

import com.cg.bugtracking.exceptions.ResourceNotFoundException;

import com.cg.bugtracking.repository.ProjectRepository;
import static com.cg.bugtracking.util.AppConstants.PROJECT_NOT_FOUND_CONST;
import static com.cg.bugtracking.util.AppConstants.OPERATION_FAILED_CONST;
@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public Project findProject(long projectId) {
		
		Optional<Project> project = projectRepository.findById(projectId);

	    if (!project.isPresent())
	      throw new ResourceNotFoundException(PROJECT_NOT_FOUND_CONST+ projectId);	
	      
		
		return project.get();
	}

	@Override
	public List<Project> getAllProject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project deleteProject(long projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project saveProject(Project project) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project updateProject(long projectId, Project project) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
