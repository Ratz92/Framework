package getRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put_Post_Delete {

	@Test
	public void method() {
		
		RequestSpecification request = given();
		
		request.header("Content-Type", "application/json");
		
		JSONObject json = new JSONObject();
		
		json.put("id", "25");
		json.put("title", "selenium webdriver");
		json.put("author", "Learn Automation");
		
		 
		request.body(json.toJSONString());
		
		Response resp = request.post("URL");
		
		int code = resp.getStatusCode();
		
		Assert.assertEquals(code, 201);
		
		
		
	}
}
