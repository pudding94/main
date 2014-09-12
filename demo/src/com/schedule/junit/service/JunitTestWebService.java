package com.schedule.junit.service;

import javax.jws.WebService;

@WebService
public interface JunitTestWebService {
	public String execute(String script);
}
