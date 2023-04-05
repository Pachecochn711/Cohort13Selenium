package RestAssuredTests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getBoards {

	String APIKEY = "125308c10f1e16a1d40e6116df155c34";
	String OAuthToken = "ATTA24e6069dd2df67b3b28ec370b8a08351ee24b3bf95f099f2d9efce71e548ce4a1A3E660E";

	@Test
	public void getBoard() {
		// set the base URL
		RestAssured.baseURI = "https://api.trello.com/1/members/me/boards";
		// create request object
		RequestSpecification httpRequest = RestAssured.given();

		Response myResponse = httpRequest.get(RestAssured.baseURI + "?key=" + APIKEY + "&token=" + OAuthToken);

		System.out.println(myResponse.prettyPrint());
		
		Assert.assertEquals(200, myResponse.getStatusCode()); 
       // 200 is the expected value
		
	}

}
