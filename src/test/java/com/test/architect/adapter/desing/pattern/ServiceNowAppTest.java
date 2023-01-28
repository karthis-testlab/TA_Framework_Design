package com.test.architect.adapter.desing.pattern;

import java.util.HashMap;
import java.util.Map;

public class ServiceNowAppTest {
	
	public static void main(String[] args) {
		
		String url = "https://dev89195.service-now.com/";
		String path = "api/now/table/";
		
		String userName = "admin";
		String password = "+XVujQj=G2p9";
		
		Map<String, String> headers = new HashMap<String, String>();		
		headers.put("Content-Type", "application/json");
		headers.put("Accept", "application/json");
		headers.put("X-UserToken", "ad42ed6b1b64211080c140c6cc4bcbf8bd28a0df48312e5575744c0233f857dd176fab02");
		
		ServiceNowUiApdapter ui = new ServiceNowUiApdapter();
		ServiceNowApiAdapter api = new ServiceNowApiAdapter(url, path, headers, userName, password);
		
		ui.startApp(url);
		ui.creatIncident();
		api.verifyIncident("INC0010008");
		
	}

}