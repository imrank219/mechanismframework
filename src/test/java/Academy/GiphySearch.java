package Academy;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.GiphyHomePage;
import pageObjects.GiphyLoginPage;
import resources.base;

public class GiphySearch extends base {
	//Searching for valid data and verifying valid data is returned
	
	@Test
	public void searchvalidentry() throws IOException, InterruptedException {
	driver = initializeDriver();
	
//	login();
	URL();
	
	GiphyLoginPage gl = new GiphyLoginPage(driver);
	GiphyHomePage ghp = new GiphyHomePage(driver);
	
//	Search Bar
	
	ghp.getSearchBar().click();
	ghp.getSearchBar().sendKeys("Yoda");
	Thread.sleep(2000);
	ghp.getSearchButton().click();
	

// Search Results
	
	
	
	Assert.assertTrue(ghp.getSearchResults1().isDisplayed());
	

	

	}
}
