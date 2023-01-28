package com.test.architect.adapter.desing.pattern;

public interface ServiceNowApp {
	
	void startApp(String url);
	
	void login(String userName, String password);
	
	void creatIncident();
	
	void verifyIncident(String incidentNumber);

}