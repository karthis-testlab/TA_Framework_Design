package com.test.architect.adapter.desing.pattern;

import java.util.HashMap;
import java.util.Map;

import com.test.architect.utils.HandleProperties;

public class ServiceNowAppTest {
	
	public static void main(String[] args) {
		
		String url = HandleProperties.readProperties("./ServiceNowConfig.properties", "servicenow.base.uri");
		String path = "api/now/table/";
		
		String userName = HandleProperties.readProperties("./ServiceNowConfig.properties", "servicenow.username");
		String password = HandleProperties.readProperties("./ServiceNowConfig.properties", "servicenow.password");
		
		Map<String, String> headers = new HashMap<String, String>();		
		headers.put("Content-Type", "application/json");
		headers.put("Accept", "application/json");
		headers.put("X-UserToken", HandleProperties.readProperties("./ServiceNowConfig.properties", "servicenow.x.usertoken"));
		
		ServiceNowUiApdapter ui = new ServiceNowUiApdapter();
		ServiceNowApiAdapter api = new ServiceNowApiAdapter(url, path, headers, userName, password);
		
		ui.startApp(url);
		ui.login(userName, password);
		ui.creatIncident();
		api.verifyIncident("INC0010008");
		
	}

}