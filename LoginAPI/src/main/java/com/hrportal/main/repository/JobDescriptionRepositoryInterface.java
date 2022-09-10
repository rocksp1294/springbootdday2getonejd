package com.hrportal.main.repository;

import java.util.List;

import com.hrportal.main.domain.JobDescription;

public interface JobDescriptionRepositoryInterface {
 public List<JobDescription> getallJobDescriptionDetails();
 public JobDescription getJobDescriptionByEmployeeId(String employeeId);
}
