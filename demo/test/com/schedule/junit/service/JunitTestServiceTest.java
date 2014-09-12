package com.schedule.junit.service;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("/cxf-client.xml") 
public class JunitTestServiceTest {
	private JunitTestService junitTestService;
	
	public JunitTestService getJunitTestService() {
		return junitTestService;
	}
	@Resource
	public void setJunitTestService(JunitTestService junitTestService) {
		this.junitTestService = junitTestService;
	}

	@Test
	public void testExecute() {
		 String response = junitTestService.execute("w");
		 System.out.println(response);
	}

}
