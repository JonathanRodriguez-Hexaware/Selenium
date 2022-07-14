package UserRegistration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test1 extends base{
	
	@Test
	
	public void basePageNavigation() throws IOException 
	{
		//
		driver = initializeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.cssSelector("a.login")).click();
		
		//
		driver.findElement(By.id("email_create")).sendKeys("jonathanr5@hexaware.com");
		driver.findElement(By.name("SubmitCreate")).click();
		
		//YOUR PERSONAL INFORMATION
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Jonathan Leonardo");
		driver.findElement(By.id("customer_lastname")).sendKeys("Rodriguez Casillas");
		driver.findElement(By.id("passwd")).sendKeys("aloha170jljl");
		
		WebElement StaticDropdown1 = driver.findElement(By.id("days"));
		Select dropdown1 = new  Select(StaticDropdown1);
		dropdown1.selectByIndex(25);
		
		WebElement StaticDropdown2 = driver.findElement(By.id("months"));
		Select dropdown2 = new  Select(StaticDropdown2);
		dropdown2.selectByIndex(3);
		
		WebElement StaticDropdown3 = driver.findElement(By.id("years"));
		Select dropdown3 = new  Select(StaticDropdown3);
		dropdown3.selectByIndex(25);
		
		//YOUR ADDRESS
		driver.findElement(By.id("company")).sendKeys("Hexaware");
		driver.findElement(By.id("address1")).sendKeys("Valle de bravo 170");
		driver.findElement(By.id("city")).sendKeys("Guadalajara");
		
		WebElement StaticDropdown4 = driver.findElement(By.id("id_state"));
		Select dropdown4 = new  Select(StaticDropdown4);
		dropdown4.selectByIndex(10);
		
		driver.findElement(By.id("postcode")).sendKeys("45645");
		driver.findElement(By.id("other")).sendKeys("NA");
		driver.findElement(By.id("phone_mobile")).sendKeys("3318319819");
		driver.findElement(By.id("submitAccount")).click();
		
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
