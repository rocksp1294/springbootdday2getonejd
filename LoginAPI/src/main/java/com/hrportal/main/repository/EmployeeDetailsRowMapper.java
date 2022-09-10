package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.domain.EmployeeDetails;

public class EmployeeDetailsRowMapper implements RowMapper<EmployeeDetails> {

	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		String employeeId = rs.getString("employee_id");
		String employeeFirstName = rs.getString("employee_first_name");
		String employeeLastName = rs.getString("employee_last_name");
		int projectId = rs.getInt("project_id");
		String loginId = rs.getString("login_id");
		String contactNo = rs.getString("contact_no");
		LocalDate hiredate = rs.getDate("hiredate").toLocalDate();
		String highestqualification = rs.getString("highest_qualification");
		String gender = rs.getString("gender");
		LocalDate dateofbirth = rs.getDate("date_of_birth").toLocalDate();
		int salary = rs.getInt("salary");
		int ctc = rs.getInt("ctc");
		String onWorkbench = rs.getString("on_workbench");
		String technicalskills1 = rs.getString("technical_skills_1");
		String technicalskills2 = rs.getString("technical_skills_2");
		String technicalskills3 = rs.getString("technical_skills_3");
		String designation = rs.getString("designation");
		String reportsto = rs.getString("reports_to");

		EmployeeDetails employeeDetails = new EmployeeDetails(employeeId, employeeFirstName, employeeLastName,
				projectId, loginId, contactNo, hiredate, highestqualification, gender, dateofbirth, salary, ctc,
				onWorkbench, technicalskills1, technicalskills2, technicalskills3, designation, reportsto);
		return employeeDetails;
	}

}