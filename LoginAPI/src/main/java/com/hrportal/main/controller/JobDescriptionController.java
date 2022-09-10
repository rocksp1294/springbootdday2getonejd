package com.hrportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrportal.main.domain.JobDescription;
import com.hrportal.main.service.JobDescriptionServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("jobdescription")
public class JobDescriptionController {

	@Autowired
	private JobDescriptionServiceInterface jobDescriptionServiceInterface;

	@RequestMapping(value = "jdhomepage", method = RequestMethod.GET)
	public List<JobDescription> getallJobDescriptionDetails() {
		return jobDescriptionServiceInterface.getallJobDescriptionDetails();
	}

	@RequestMapping(value = "jdhomepage/{employeeId}", method = RequestMethod.GET)
	public @ResponseBody JobDescription getJobDescriptionByEmployeeId(@PathVariable("employeeId") String employeeId) {
		return jobDescriptionServiceInterface.getJobDescriptionByEmployeeId(employeeId);
	}

}
