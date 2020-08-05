package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiphyHomePage {

	public WebDriver driver;
	

	By loginbutton = By.xpath("//*[@id=\"login-button\"]");
	By name =  By.xpath("//span[contains(@class, '_17hY_dW7917mzr2S9Ree') and text() = 'imran219']");
	By searchbar=By.xpath("//*[@id=\"searchbar\"]/div/div/form/input");
	By searchbutton=By.xpath("//*[@class='search-button__SearchIcon-ndudpy-0 lkAkJi']");
	By searchresults1=By.xpath("//*[@id=\"react-target\"]/div/div[5]/div[2]/div[1]/a[1]/div/picture/img");
	By upload=By.xpath("//span[contains(@class, '_3zNy6xutECQ64hsEPFm_UH') and text() = 'Upload']");
	By errormessage=By.xpath("//*[contains(text(),'Oops sorry! @@@ is not a GIPHY Channel.')]");
			
			////*[@id="content"]/div/div/h2
	
	////*[@id="homepage"]/header/div[1]/div/nav/ul/li[4]/a/span
	////*[@id="homepage"]/header/div[1]/div/nav/ul/li[4]/a/span
	
	public GiphyHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(loginbutton);
	}
	
	public WebElement getName()
	{
		return driver.findElement(name);
	}
	
	public WebElement getSearchBar()
	{
		return driver.findElement(searchbar);
	}
	
	public WebElement getSearchButton()
	{
		return driver.findElement(searchbutton);
	}
	
	public WebElement getSearchResults1() {
		return driver.findElement(searchresults1);
	}
	
	public WebElement getUpload() {
		return driver.findElement(upload);
	}
	
	public WebElement getError() {
		return driver.findElement(errormessage);
	}
}
