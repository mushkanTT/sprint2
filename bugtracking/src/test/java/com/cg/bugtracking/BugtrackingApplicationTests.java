package com.cg.bugtracking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.bugtracking.entities.Employee;
import com.cg.bugtracking.entities.Project;
import com.cg.bugtracking.exceptions.*;
import com.cg.bugtracking.repository.ProjectRepository;
import com.cg.bugtracking.service.ProjectServiceImpl;

@SpringBootTest
class BugtrackingApplicationTests {
	@Mock
	private ProjectRepository projRepo;

	@InjectMocks
	private ProjectServiceImpl projService;

	
	  
	  }
	 
