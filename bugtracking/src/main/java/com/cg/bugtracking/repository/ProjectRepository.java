package com.cg.bugtracking.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bugtracking.entities.Project;

public interface ProjectRepository extends JpaRepository<Project,Long> {

	
}
