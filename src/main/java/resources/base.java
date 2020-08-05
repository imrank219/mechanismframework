package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.GiphyHomePage;
import pageObjects.GiphyLoginPage;



public class base {
	public WebDriver driver;
//	public CustomVerification customVerification = new CustomVerification();
	public WebDriver initializeDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Imran Khan\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			//execute in Chrome
		//	System.setProperty("webdriver.chrome.driver","C:/Gecko/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","C:/Users/Imran Khan/.jenkins/E2EProject/Drivers/chromedriver.exe");
			 driver = (WebDriver) new ChromeDriver();
			 driver.manage().window().maximize();
			
			
		}
		else if (browserName.equals("firefox")) {
			
			//execute in firefox driver
			System.setProperty("webdriver.gecko.driver","C:/Gecko/geckodriver.exe");
			 driver = (WebDriver) new FirefoxDriver();
		}
		else if (browserName=="IE") {
			//execute in IE driver
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public void login() throws IOException, InterruptedException {
	//	driver = initializeDriver();
		
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
		
	    
		
}
	    public void URL() {
	    	driver.get("https://giphy.com/");
	    }
	
}
	
	
	 
	
	