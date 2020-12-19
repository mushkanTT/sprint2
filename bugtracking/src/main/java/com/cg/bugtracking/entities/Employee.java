package com.cg.bugtracking.entities;


import java.util.HashSet;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "employee_tbl")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private long empId;

	@Column(name = "emp_name")
	private String empName;

	@Column(name = "email_id")
	private String email;

	@Column(name = "emp_contact")
	private String empContact;

	@Column(name = "emp_status")
	private String empStatus;

	@ManyToMany(mappedBy = "members")
	private Set<Project> p = new HashSet<>();

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private Set<Bug> bugListE = new HashSet<>();

	

	public Set<Bug> getBugListE() {
		return bugListE;
	}

	public void setBugListE(Set<Bug> bugListE) {
		this.bugListE = bugListE;
	}

	public Set<Project> getP() {
		return p;
	}

	public void setP(Set<Project> p) {
		this.p = p;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpContact() {
		return empContact;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public Employee() {

	}

	public Employee(long empId, String empName, String email, String empContact, String empStatus) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.empContact = empContact;
		this.empStatus = empStatus;
	}

}
