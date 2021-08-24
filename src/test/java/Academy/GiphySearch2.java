package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.codegen.model.decl.Decl;
import junit.framework.Assert;
import pageObjects.GiphyHomePage;
import pageObjects.GiphyLoginPage;
import resources.base;

public class GiphySearch2 extends base {
	//Searching for valid data and verifying valid data is returned
	private static Logger log = LogManager.getLogger(Decl.class.getName());
	@Test
	public void searchvalidentry() throws IOException, InterruptedException {
//	ExtentTest test = extent.createTest("Demo");	
	driver = initializeDriver();
	
//	login();
	URL();
	

	
	
	
	//GiphyLoginPage gl = new GiphyLoginPage(driver);
	GiphyHomePage ghp = new GiphyHomePage(driver);
	
//	Search Bar
	
	ghp.getTile1().click();
	ghp.getConfirm().click();
	//ghp.getSearchBar().sendKeys("Yoda");
	//Thread.sleep(2000);
	//ghp.getSearchButton().click();
	

// Search Results
	
	
	
//	Assert.assertTrue(ghp.getSearchResults1().isDisplayed());
	
//	if(!ghp.getSearchResults1().isDisplayed()) {
//	  log.error("searchresults not present");
//	}
//	else {
//		log.debug("Search results present");
//	}
	


	

	}
}
