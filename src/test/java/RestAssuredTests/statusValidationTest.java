package RestAssuredTests;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

public class statusValidationTest {
	
	String APIKEY = "125308c10f1e16a1d40e6116df155c34";
	String OAuthToken = "ATTA24e6069dd2df67b3b28ec370b8a08351ee24b3bf95f099f2d9efce71e548ce4a1A3E660E";
	String boardName = "restAssuredBoard";
	@Test
	public void validationData() {
		
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.given().param("key",APIKEY).param("token", OAuthToken).get("https://api.trello.com/1/members/me/boards")
		.then().statusCode(200).body("name",hasItems("restAssuredBoard","Cohort13")).body("id[0]",equalTo("641a562ad3fe2c99cbfac34a"));
		
	}

}
