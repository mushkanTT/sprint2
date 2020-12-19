package com.cg.bugtracking.entities;



import java.util.HashSet;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



//Project entity has Mapping with Employee and Bug entity
@Entity
@Table(name = "project_tbl")

public class Project {
	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "proj_id")
	private long projectId;
	@NotEmpty(message = "Please provide a Project Owner")
	@Column(name = "project_owner")
	private String projectOwner;
	@NotEmpty(message = "Please provide a Project Name")
	@Column(name = "project_name")
	private String projectName;
	@NotEmpty(message = "Please provide Project Status")
	@Column(name = "proj_status")
	private String status;

//Mapping with with Employee entity (many to many)
	@ManyToMany(cascade = { CascadeType.PERSIST })
	@JoinTable(name = "emp_proj_tbl", joinColumns = @JoinColumn(name = "proj_id"), inverseJoinColumns = @JoinColumn(name = "emp_id"))
	private Set<Employee> members = new HashSet<>();

//Mapping with Bug entity(one to many)
	@OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
	private Set<Bug> bugList = new HashSet<>();



public Set<Bug> getBugList() {
		return bugList;
	}

	public void setBugList(Set<Bug> bugList) {
		this.bugList = bugList;
	}

	//Members i.e Set of Employees working on the project
	public Set<Employee> getMembers() {
		return members;
	}

	public void setMembers(Set<Employee> members) {
		this.members = members;
	}

//Project Id
	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

//Project Owner
	public String getProjectOwner() {
		return projectOwner;
	}

	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}

//Project Status
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

//Project Name
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
//Constructor's for the Project entity

	public Project() {
		super();
	}



}
