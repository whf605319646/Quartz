package com.github.gx.dyschedule.mapper;

import java.util.List;

import com.github.gx.dyschedule.domain.JobPojo;

public interface JobPojoMapper {
	

	List<JobPojo> findJobsByArgs(String status);
	
}
