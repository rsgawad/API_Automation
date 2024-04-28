package day_1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetRequiest1 {

	
	@Test
	public void getSingleUser()
	{
		RestAssured.baseURI="https://reqres.in/";
		Response res = given()
				
				.when()
				
				.get("/api/users/2")
				
				.then()
				
				.extract()
				
				.response();
		
		String resopnse =res.asPrettyString();
		System.out.println(resopnse);
				
	}
	
}
