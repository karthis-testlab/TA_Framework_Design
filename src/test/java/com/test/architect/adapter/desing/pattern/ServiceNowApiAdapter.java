package com.test.architect.adapter.desing.pattern;

import static io.restassured.RestAssured.given;
import java.util.Map;

import io.restassured.response.ValidatableResponse;

public class ServiceNowApiAdapter implements ServiceNowApp {
	
	private Map<String, String> headers;
	private String url;
	private String userName;
	private String password;	
	private String basePath;
	
	ServiceNowApiAdapter(String url, String basePath, Map<String, String> headers, String userName, String password) {
		this.url = url;
		this.headers = headers;
		this.userName = userName;
		this.password = password;
		this.basePath = basePath;
	}

	public void creatIncident() {		
	}

	public void verifyIncident(String incidentNumber) {		
		ValidatableResponse response = given()
		   .headers(headers)
		   .auth()
		   .preemptive()
		   .basic(userName, password)
		   .baseUri(url)
		   .basePath(basePath)
		   .pathParam("incident", "incident")
		   .queryParam("sysparm_limit", 1)
		   .queryParam("number", incidentNumber)
		.when()
		   .get("{incident}")
		.then()
		   .assertThat()
		   .statusCode(200);
		System.out.println(response.log().body());
	}

	public void startApp(String url) {
	}

	public void login(String userName, String password) {		
	}

}