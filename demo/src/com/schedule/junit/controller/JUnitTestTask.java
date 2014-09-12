package com.schedule.junit.controller;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.schedule.junit.service.JunitTestService;

@Controller("taskJob") 
public class JUnitTestTask {
	private JunitTestService junitTestService;
	
	public JunitTestService getJunitTestService() {
		return junitTestService;
	}
	@Resource
	public void setJunitTestService(JunitTestService junitTestService) {
		this.junitTestService = junitTestService;
	}

	//	@Scheduled(fixedRate=5000)
	@Scheduled(cron="0/5 * *  * * ? ")
	public void doSomething() {
	    // something that should execute periodically
		System.out.println("task");
		String result=this.getJunitTestService().execute("w");
		System.out.println("task:="+result);
	}
}
