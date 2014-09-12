package com.schedule.junit.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller("taskJob") 
public class JUnitTestTask {
//	@Scheduled(fixedRate=5000)
	@Scheduled(cron="0/5 * *  * * ? ")
	public void doSomething() {
	    // something that should execute periodically
		System.out.println("task");
	}
}
