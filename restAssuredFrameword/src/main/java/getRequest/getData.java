package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class getData {

	@Test
	public void testResponse() {
		// TODO Auto-generated method stub

		int code =get("https://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=31ac77cb9f4eb058261fa25c6ffd9a33").getStatusCode();
//		 Response resp = get("https://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=31ac77cb9f4eb058261fa25c6ffd9a33");
//		 int code = resp.getStatusCode();
		 
		 System.out.println("Status code is " +code);
		 
		 Assert.assertEquals(code, 200);
		
	}
	
	@Test
	public void testBody() {
		// TODO Auto-generated method stub

		String data = get("https://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=31ac77cb9f4eb058261fa25c6ffd9a33").asString();
//		 Response resp = get("https://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=31ac77cb9f4eb058261fa25c6ffd9a33");
//		 String data = resp.asString();
		 long time=get("https://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=31ac77cb9f4eb058261fa25c6ffd9a33").getTime();
		 System.out.println("Status code is " +time);
		 
		 System.out.println("Data is " +data);
		 
		 //System.out.println("Response of the request is  " +resp.getTime());
		 
		 
		 }

}
