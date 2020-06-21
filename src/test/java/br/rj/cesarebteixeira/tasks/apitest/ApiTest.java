package br.rj.cesarebteixeira.tasks.apitest;

import org.junit.Test;

import io.restassured.RestAssured;

public class ApiTest {
	
	@Test
	public void test() {
		
		RestAssured.given()
		.when()
		.get("http://localhost:8001/tasks-backend/todo")
		.then()
		.log().all()
		;
	}

}
