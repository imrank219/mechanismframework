import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownBasic {

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
		
		driver.findElement(By.xpath("//a[@value='AIP']")).click();
		
	}

}
