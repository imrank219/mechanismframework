import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEnd {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Gecko/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	//	driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTNR")).click();
		//Thread.sleep(3000);
	//	driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[11]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
	if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
			
		}
	else
	{
		Assert.assertTrue(false);
	}
	
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	Thread.sleep(3000);
	
	  driver.findElement(By.id("divpaxinfo")).click();
		
			Thread.sleep(3000);
			for(int i=1;i<5;i++)

			{

		//	driver.findElement(By.id("hrefIncAdt")).click();
			
            driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")).click();

			}
		//	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
			}
	
}
