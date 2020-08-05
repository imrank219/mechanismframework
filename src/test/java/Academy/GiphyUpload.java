package Academy;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.GiphyHomePage;
import pageObjects.GiphyLoginPage;
import pageObjects.GiphyUploadPage;
import resources.base;

public class GiphyUpload extends base {
	//Uploading a you tube video and verifying the upload has been completed successfully
	@Test
	public void searchvalidentry() throws IOException, InterruptedException {
	driver = initializeDriver();
	WebDriverWait wait = new WebDriverWait(driver, 60000);
	
	login();
	
	GiphyLoginPage gl = new GiphyLoginPage(driver);
	GiphyHomePage ghp = new GiphyHomePage(driver);
	GiphyUploadPage gup = new GiphyUploadPage(driver);
	
//	Upload Button
	
	ghp.getUpload().click();
	
//  Upload Page
	gup.getUploadBox().click();
	gup.getUploadBox().sendKeys("https://www.youtube.com/watch?v=OIqSMYLxoQo");
	
	wait.until(ExpectedConditions.elementToBeClickable(gup.getUploadButton()));
	
	gup.getUploadButton().click();
	Thread.sleep(10000);
	wait.until(ExpectedConditions.visibilityOf(gup.getSource()));
	
	//Verifying image has been uploaded
	
	
	Assert.assertTrue(gup.getUploadImage().isDisplayed());
	
	

	

	}
}
