package com.hrportal.main.domain;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class EmployeeDetails {
	private String employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private int projectId;
	private String loginId;
	private String contactNo;
	private LocalDate hiredate;
	private String highestqualification;
	private String gender;
	private LocalDate dateofbirth;
	private int salary;
	private int ctc;
	private String onWorkbench;
	private String technicalskills1;
	private String technicalskills2;
	private String technicalskills3;
	private String designation;
	private String reportsto;

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(String employeeId, String employeeFirstName, String employeeLastName, int projectId,
			String loginId, String contactNo, LocalDate hiredate, String highestqualification, String gender,
			LocalDate dateofbirth, int salary, int ctc, String onWorkbench, String technicalskills1,
			String technicalskills2, String technicalskills3, String designation, String reportsto) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.projectId = projectId;
		this.loginId = loginId;
		this.contactNo = contactNo;
		this.hiredate = hiredate;
		this.highestqualification = highestqualification;
		this.gender = gender;
		this.dateofbirth = dateofbirth;
		this.salary = salary;
		this.ctc = ctc;
		this.onWorkbench = onWorkbench;
		this.technicalskills1 = technicalskills1;
		this.technicalskills2 = technicalskills2;
		this.technicalskills3 = technicalskills3;
		this.designation = designation;
		this.reportsto = reportsto;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	public String getHighestqualification() {
		return highestqualification;
	}

	public void setHighestqualification(String highestqualification) {
		this.highestqualification = highestqualification;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCtc() {
		return ctc;
	}

	public void setCtc(int ctc) {
		this.ctc = ctc;
	}

	public String getOnWorkbench() {
		return onWorkbench;
	}

	public void setOnWorkbench(String onWorkbench) {
		this.onWorkbench = onWorkbench;
	}

	public String getTechnicalskills1() {
		return technicalskills1;
	}

	public void setTechnicalskills1(String technicalskills1) {
		this.technicalskills1 = technicalskills1;
	}

	public String getTechnicalskills2() {
		return technicalskills2;
	}

	public void setTechnicalskills2(String technicalskills2) {
		this.technicalskills2 = technicalskills2;
	}

	public String getTechnicalskills3() {
		return technicalskills3;
	}

	public void setTechnicalskills3(String technicalskills3) {
		this.technicalskills3 = technicalskills3;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getReportsto() {
		return reportsto;
	}

	public void setReportsto(String reportsto) {
		this.reportsto = reportsto;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName
				+ ", employeeLastName=" + employeeLastName + ", projectId=" + projectId + ", loginId=" + loginId
				+ ", contactNo=" + contactNo + ", hiredate=" + hiredate + ", highestqualification="
				+ highestqualification + ", gender=" + gender + ", dateofbirth=" + dateofbirth + ", salary=" + salary
				+ ", ctc=" + ctc + ", onWorkbench=" + onWorkbench + ", technicalskills1=" + technicalskills1
				+ ", technicalskills2=" + technicalskills2 + ", technicalskills3=" + technicalskills3 + ", designation="
				+ designation + ", reportsto=" + reportsto + "]";
	}

}
