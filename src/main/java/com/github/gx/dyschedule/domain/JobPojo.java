package com.github.gx.dyschedule.domain;

public class JobPojo {
	
	private Integer id;
	
	private String jobName;
	
	private String description;
	
	private String jobClass;
	
	private String jobMethod;
	
	private String cron;
	// 0 为 off 1 为on 默认关闭
	private char status = 0;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getJobClass() {
		return jobClass;
	}
	public void setJobClass(String jobClass) {
		this.jobClass = jobClass;
	}
	public String getJobMethod() {
		return jobMethod;
	}
	public void setJobMethod(String jobMethod) {
		this.jobMethod = jobMethod;
	}
	public String getCron() {
		return cron;
	}
	public void setCron(String cron) {
		this.cron = cron;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "JobPojo [id=" + id + ", jobName=" + jobName + ", description=" + description + ", jobClass=" + jobClass
				+ ", jobMethod=" + jobMethod + ", cron=" + cron + ", status=" + status + "]";
	}
}
