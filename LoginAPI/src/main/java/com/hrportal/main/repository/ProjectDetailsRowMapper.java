package com.hrportal.main.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.domain.ProjectDetails;

public class ProjectDetailsRowMapper implements RowMapper<ProjectDetails> {

	@Override
	public ProjectDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		String projectid = rs.getString("project_id");
		String projectname = rs.getString("project_name");
		int empcount = rs.getInt("emp_count");
		LocalDate projectstartdate = rs.getDate("project_start_date").toLocalDate();
		LocalDate projectenddate = rs.getDate("project_end_date").toLocalDate();
		String status = rs.getString("status");
		int overallbudget = rs.getInt("overall_budget");

		ProjectDetails projectDetails = new ProjectDetails(projectid, projectname, empcount, projectstartdate,
				projectenddate, status, overallbudget);
		return projectDetails;
	}

}
