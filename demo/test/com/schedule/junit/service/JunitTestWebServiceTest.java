package com.schedule.junit.service;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("/cxf-client.xml") 
public class JunitTestWebServiceTest {
	private JunitTestWebService junitTestWebService;
	
	public JunitTestWebService getJunitTestService() {
		return junitTestWebService;
	}
	@Resource
	public void setJunitTestService(JunitTestWebService junitTestWebService) {
		this.junitTestWebService = junitTestWebService;
	}

	@Test
	public void testExecute() {
		 String response = junitTestWebService.execute("w");
		 System.out.println(response);
	}

}
