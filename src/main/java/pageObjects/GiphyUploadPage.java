package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiphyUploadPage {

	public WebDriver driver;
	

	By uploadbox = By.xpath("//input[@placeholder='Enter any media or GIF URL']");
	By uploadbutton= By.xpath("//*[contains(@class, 'sc-kgAjT cIeFYm') and text() = 'Upload to GIPHY']");
	By source=By.xpath("//*[contains(@class, '_3aJUErHwTtNG3UV1A-YZKQ _1KuKUOaTOA-MDxUbnxAF0-') and text() = 'Source']");
	By uploadimage=By.xpath("//*[@id='react-target']/div/div[4]/div/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div/a/div/video");
	
			
			////*[@id="content"]/div/div/h2
	
	////*[@id="homepage"]/header/div[1]/div/nav/ul/li[4]/a/span
	////*[@id="homepage"]/header/div[1]/div/nav/ul/li[4]/a/span
	
	public GiphyUploadPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getUploadBox(){
		return driver.findElement(uploadbox);
	}
	
	public WebElement getUploadButton(){
		return driver.findElement(uploadbutton);
	}
	
	public WebElement getSource(){
		return driver.findElement(source);
	}
	
	public WebElement getUploadImage(){
		return driver.findElement(uploadimage);
	}
	
	
}

