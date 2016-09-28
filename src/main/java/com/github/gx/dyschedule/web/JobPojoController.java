package com.github.gx.dyschedule.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jobpojo")
public class JobPojoController {

	@GetMapping
	public String listAllJobs() {
		
		return "jobList";
	}
}
