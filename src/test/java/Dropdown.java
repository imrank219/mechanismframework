import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//TestNG is one of the testing framework we will use

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:/Gecko/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		 driver.manage().window().maximize();
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
	//	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//count the number of checkboxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
//		driver.findElement(By.id("id=\"ctl00_mainContent_ddl_originStation1_CTXTaction\"")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		ctl00_mainContent_ddl_originStation1_CTXT
		
		//*[@id="ctl00_mainContent_ddl_originStation1_CTXT"]
		
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[9]/a")).click();
	
//        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
//		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
//	    s.selectByValue("ATQ");
//		s.deselectByIndex(2);
//		s.selectByVisibleText("Adampur (AIP)");
		
		driver.findElement(By.id("divpaxinfo")).click();
	//	driver.findElement(By.id("hrefIncAdt")).click();
	//	driver.findElement(By.id("btnclosepaxoption")).click();
		driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
			
		}
		
		
		
	    driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(3000);
		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();
		

		}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		driver.findElement(By.id("btnclosepaxoption")).click();
		}
	}
	

	

	



