package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.domain.JobDescription;

public interface JobDescriptionServiceInterface {
	public List<JobDescription> getallJobDescriptionDetails();

	public JobDescription getJobDescriptionByEmployeeId(String employeeId);
}
