package RestAssuredTests;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class printingOutHeaders {
	@Test
	public void getMethodTest() {
		// set the base URL
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";

		// create request object
		RequestSpecification httpRequest = RestAssured.given();

		// response object
		Response myResponse = httpRequest.request(Method.GET);
		
		System.out.println(myResponse.getHeader("Content-Type"));
		
		Headers allHeaders = myResponse.getHeaders();
		
		for(Header eachHeader : allHeaders) {
			System.out.println(eachHeader.getName()+ "=========="+ eachHeader.getValue());
		}

	}

}
