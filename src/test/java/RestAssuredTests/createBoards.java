package RestAssuredTests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createBoards {

	String APIKEY = "125308c10f1e16a1d40e6116df155c34";
	String OAuthToken = "ATTA24e6069dd2df67b3b28ec370b8a08351ee24b3bf95f099f2d9efce71e548ce4a1A3E660E";
    String boardName = "restAssuredBoard";
	
	@Test
	public void createBoard() {

		// set the base URL
		RestAssured.baseURI = "https://api.trello.com/1/boards";
		// create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Content-Type","application/json");

		Response myResponse = httpRequest.post(RestAssured.baseURI+"/?name="+boardName+"&key="+APIKEY+"&token="+OAuthToken);
		
		int statusCode = myResponse.getStatusCode();
		
		System.out.println(myResponse.prettyPrint());
		
		Assert.assertEquals(200, myResponse.getStatusCode()); 	
		
		System.out.println("The testpassed and board created with status Code"+ statusCode);
	}

}
