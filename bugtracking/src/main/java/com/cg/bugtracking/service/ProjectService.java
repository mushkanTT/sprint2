package com.cg.bugtracking.service;

import java.util.List;
import com.cg.bugtracking.entities.Project;


public interface ProjectService {

	public List<Project> getAllProject();

	public Project findProject(long projectId);

	public Project deleteProject(long projectId);

	public Project saveProject(Project project);

	public Project updateProject(long projectId,Project project);
	
	
}
