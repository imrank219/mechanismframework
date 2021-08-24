package Academy;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:/Gecko/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		//expected
		
		String[] itemsNeeded= {"Cucumber - 1 Kg", "Brocolli - 1 Kg"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++) {
			String name = products.get(i).getText();
			
			//convert array into array list for easy search
			//check wheter name you extracted is present in arrayList or not
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(name))
				
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
			}
		}

	}

}
