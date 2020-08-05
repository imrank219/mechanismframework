package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiphyLoginPage {

	public WebDriver driver;
	

	By email = By.xpath("//*[@name='email']");
	By password =  By.xpath("//*[@name='password']");
	By loginbutton =  By.xpath("//*[contains(text(),'Log in')]");
			
			////*[@id="content"]/div/div/h2
	
	////*[@id="homepage"]/header/div[1]/div/nav/ul/li[4]/a/span
	////*[@id="homepage"]/header/div[1]/div/nav/ul/li[4]/a/span
	
	public GiphyLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLoginButton()
	{
		return driver.findElement(loginbutton);
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
}
