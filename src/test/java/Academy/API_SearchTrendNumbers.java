package Academy;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;
import org.hamcrest.core.Is;

public class API_SearchTrendNumbers {
	
	@Test
	public void API_Validate_TrendCount() throws IOException {
		
		//Testing Giphy Search API searching for trending gifs and validating only 5 results are pulled
		RestAssured.baseURI="https://api.giphy.com";
		given().log().all().queryParam("api_key", "MzN5CVQX3DLh2t8On38KlM93uGMdQLIC").queryParam("limit", "5")
		.when().get("/v1/gifs/trending").then().log().all().assertThat().statusCode(200).assertThat().body("pagination.count", Is.is(5));
		
	//	Assert.assertEquals(verifyJSON, verifyJSON);
	
		
		
	}
	
}


