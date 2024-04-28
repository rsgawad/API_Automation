package day_1;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetRequiest {
	
	
	@Test
	public void getAllUseres()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
			
				Response res =	given()
					
					.when()
					
					.get("/api/users?page=1")
					
					.then()
					
					.extract()
					
					
					.response();
				
				System.out.println(res);
				
				String response = res.asPrettyString();
				System.out.println(response);
					
					
					
	}

}
