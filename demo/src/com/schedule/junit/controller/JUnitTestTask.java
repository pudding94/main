package com.schedule.junit.controller;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.schedule.junit.service.JunitTestWebService;

@Controller 
public class JUnitTestTask {
	private JunitTestWebService junitTestWebService;
	

	public JunitTestWebService getJunitTestWebService() {
		return junitTestWebService;
	}

	@Resource
	public void setJunitTestWebService(JunitTestWebService junitTestWebService) {
		this.junitTestWebService = junitTestWebService;
	}

	//	@Scheduled(fixedRate=5000)
	@Scheduled(cron="0/5 * *  * * ? ")
	public void doSomething() {
	    // something that should execute periodically
		System.out.println("task");
		String result=this.getJunitTestWebService().execute("w");
		System.out.println("task:="+result);
	}
}
