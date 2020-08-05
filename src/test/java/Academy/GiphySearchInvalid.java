package Academy;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.GiphyHomePage;
import pageObjects.GiphyLoginPage;
import resources.base;

public class GiphySearchInvalid extends base {
	//Searching for invalid data and verifying the error message is generated
	@Test
	public void searchinvalidentry() throws IOException, InterruptedException {
	driver = initializeDriver();
	
//	login();
	URL();
	
	GiphyLoginPage gl = new GiphyLoginPage(driver);
	GiphyHomePage ghp = new GiphyHomePage(driver);
	
//	Search Bar
	
	ghp.getSearchBar().click();
	ghp.getSearchBar().sendKeys("@@@");
	Thread.sleep(2000);
	ghp.getSearchButton().click();
	

// Search Results
	Assert.assertTrue(ghp.getError().isDisplayed());
	

	

	}
}
