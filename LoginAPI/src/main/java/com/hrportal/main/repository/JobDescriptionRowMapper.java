
package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.domain.EmployeeDetails;
import com.hrportal.main.domain.JobDescription;
import com.hrportal.main.domain.ProjectDetails;

public class JobDescriptionRowMapper implements RowMapper<JobDescription> {

	@Override
	public JobDescription mapRow(ResultSet rs, int rowNum) throws SQLException {

//		String jobId = rs.getString("job_id");
//		String projectId = rs.getString(ProjectDetails);
//		String technicalSkills1 = rs.getString("technical_skills_1");
//		String technicalSkills2 = rs.getString("technical_skills_2");
//		String technicalSkills3 = rs.getString("technical_skills_3");
//		String RequiredCandidates = rs.getString("required_candidates");
//		int remainingBudget = rs.getInt("remaining_budget");
//		String status = rs.getString("status");
//		String employeeId = rs.getString("employee_id");
//
//		JobDescription jobDescription = new JobDescription(jobId, projectId, technicalSkills1, technicalSkills2,
//				technicalSkills3, RequiredCandidates, remainingBudget, status, employeeId);

		ProjectDetails projectDetails = new ProjectDetails();
		
		projectDetails.setProjectId(rs.getString("project_id"));
		projectDetails.setProjectName(rs.getString("project_name"));
		projectDetails.setEmpCount(rs.getInt("emp_count"));
		projectDetails.setProjectStartDate(rs.getDate("project_start_date").toLocalDate());
		projectDetails.setProjectEndDate(rs.getDate("project_end_date").toLocalDate());
		projectDetails.setStatus(rs.getString("status"));
		projectDetails.setOverallBudget(rs.getInt("overall_budget"));

		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setEmployeeId(rs.getString("employee_id"));
		employeeDetails.setEmployeeFirstName(rs.getString("employee_first_name"));
		employeeDetails.setEmployeeLastName(rs.getString("employee_last_name"));
		employeeDetails.setProjectId(rs.getInt("project_id"));
		employeeDetails.setLoginId(rs.getString("login_id"));
		employeeDetails.setContactNo(rs.getString("contact_no"));
		employeeDetails.setHiredate(rs.getDate("hiredate").toLocalDate());
		employeeDetails.setHighestqualification(rs.getString("highest_qualification"));
		employeeDetails.setGender(rs.getString("gender"));
		employeeDetails.setDateofbirth(rs.getDate("date_of_birth").toLocalDate());
		employeeDetails.setSalary(rs.getInt("salary"));
		employeeDetails.setCtc(rs.getInt("ctc"));
		employeeDetails.setOnWorkbench(rs.getString("on_workbench"));
		employeeDetails.setTechnicalskills1(rs.getString("technical_skills_1"));
		employeeDetails.setTechnicalskills2(rs.getString("technical_skills_2"));
		employeeDetails.setTechnicalskills3(rs.getString("technical_skills_3"));
		employeeDetails.setDesignation(rs.getString("designation"));
		employeeDetails.setReportsto(rs.getString("reports_to"));

		JobDescription jobDescription = new JobDescription();
		jobDescription.setJobId(rs.getString("job_id"));
		jobDescription.setProjectDetails(projectDetails);
		jobDescription.setTechnicalSkills1(rs.getString("technical_skills_1"));
		jobDescription.setTechnicalSkills2(rs.getString("technical_skills_2"));
		jobDescription.setTechnicalSkills3(rs.getString("technical_skills_3"));
		jobDescription.setRequiredCandidates(rs.getString("required_candidates"));
		jobDescription.setRemainingBudget(rs.getInt("remaining_budget"));
		jobDescription.setStatus(rs.getString("status"));
		jobDescription.setEmployeeDetails(employeeDetails);

		return jobDescription;
	}

}
