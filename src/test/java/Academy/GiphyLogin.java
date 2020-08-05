package Academy;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.GiphyHomePage;
import pageObjects.GiphyLoginPage;
import resources.base;

public class GiphyLogin extends base {
	
	@Test
	public void login() throws IOException, InterruptedException {
	driver = initializeDriver();
	
	driver.get("https://giphy.com/");
	WebDriverWait wait = new WebDriverWait(driver, 3000);
	
	//Page Objects
	GiphyLoginPage gl = new GiphyLoginPage(driver);
	GiphyHomePage ghp = new GiphyHomePage(driver);

	
	
	//Home Page
	ghp.getLogin().click();
	
	//Login page
	
	gl.getEmail().clear();
	gl.getEmail().sendKeys("usimran2000@yahoo.com");
	gl.getPassword().clear();
	gl.getPassword().sendKeys("MPtest1234");
	gl.getLoginButton().click();
	
	//Home Page 
		wait.until(ExpectedConditions.elementToBeClickable(ghp.getName()));
	
    
	
	
//	Assert.assertEquals(land.getTitle().getText(), "FEATURED COURSES");
//	Assert.assertTrue(land.getNavBar().isDisplayed());
	

	}
}
