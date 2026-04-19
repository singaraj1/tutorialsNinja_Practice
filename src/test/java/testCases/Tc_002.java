package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class Tc_002 extends BaseTest{
	
	@Test
	public void testwithoutinput() {
		
		
		driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		
		String expectedMsg="First Name must be between 1 and 32 characters!";
		
		
		 //Assert.assertEquals(driver.findElement(By.xpath("//input[@id=\"input-firstname\"]/following-sibling::div")), expectedMsg);
		
		 
		Assert.assertEquals(driver.findElement(By.xpath("//input[@id=\"input-firstname\"]/following-sibling::div")).getText(), expectedMsg);
		 String s=driver.findElement(By.xpath("//input[@id=\"input-firstname\"]/following-sibling::div")).getText();
			
     System.out.println("The mesg  "+s);
     //only one things verify but need to veriy all the fileds in the site man
     
			
	}
	
	
}
