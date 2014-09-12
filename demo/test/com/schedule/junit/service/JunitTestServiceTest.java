package com.schedule.junit.service;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;


//@ContextConfiguration("cxf-client.xml")
public class JunitTestServiceTest {
//	@Resource
//	private JunitTestService junitTestService;
	@Test
	public void testExecute() {
//		fail("Not yet implemented");
//	        String response = junitTestService.execute("sb");
//	        System.out.println(response);
		 ApplicationContext context = new ClassPathXmlApplicationContext("cxf-client.xml");
		 JunitTestService junitTestService = (JunitTestService) context.getBean("junitTestService");
//		 System.out.println(junitTestService);
		 String response = junitTestService.execute("w");
	        System.out.println(response);
	}

}
