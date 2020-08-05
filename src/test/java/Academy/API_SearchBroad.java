package Academy;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.hamcrest.core.Is;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class API_SearchBroad {
	
	@Test
	public void API_Validate_GIFSearch() throws IOException {
		
		//Testing Giphy Search API using a broad search term in this case Baby Yoda and validating the result contains the correct search information
		
	
		RestAssured.baseURI="https://api.giphy.com";
		given().log().all().queryParam("api_key", "MzN5CVQX3DLh2t8On38KlM93uGMdQLIC").queryParam("q","babyyoda")
		.when().get("v1/gifs/search").then().log().all().assertThat().statusCode(200).body("data.id[0]", Is.is("j0eRJzyW7XjMpu1Pqd"));
	
		
		
	}
	
}


