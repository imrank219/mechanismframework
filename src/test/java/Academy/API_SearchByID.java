package Academy;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;
import org.hamcrest.core.Is;

public class API_SearchByID {
	
	@Test
	public void API_Validate_ID() throws IOException {
		
		//Testing Giphy Search API using a specific search criteria in this case ID a and validating the result pulled contains the ID

		RestAssured.baseURI="https://api.giphy.com";
		given().log().all().queryParam("api_key", "MzN5CVQX3DLh2t8On38KlM93uGMdQLIC")
		.when().get("v1/gifs/KziKCpvrGngHbYjaUF").then().log().all().assertThat().statusCode(200).assertThat().body("data.id", Is.is("KziKCpvrGngHbYjaUF"));
		
	//	Assert.assertEquals(verifyJSON, verifyJSON);
	
		
		
	}
	
}


