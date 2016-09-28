package com.github.gx.dyschedule.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.gx.dyschedule.mapper.JobPojoMapper;
import com.github.gx.dyschedule.service.JobPojoService;

@Service
public class JobPojoServiceImpl implements JobPojoService{
	
	@Autowired
	private JobPojoMapper jobPojoMapper;
	

}
