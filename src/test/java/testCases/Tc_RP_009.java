package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class Tc_RP_009 extends BaseTest {

	@Test
	public void verifyExistingUser ()
	
	{
		
		
		
			BaseTest bs=new BaseTest();
			driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();
			//driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
			driver.findElement(By.linkText("Register")).click();
			
			
			driver.findElement(By.id("input-firstname")).sendKeys("Raj");
			driver.findElement(By.id("input-lastname")).sendKeys("S");
			driver.findElement(By.id("input-email")).sendKeys("demotestT@gmail.com");
			//driver.findElement(By.id("input-email")).sendKeys(bs.emailGen());
			driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Hello@123");
			driver.findElement(By.xpath("//input[@name=\"confirm\"]")).sendKeys("Hello@123");
			
			driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
			
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			
			
			
			String ExpectedMsg="Warning: E-Mail Address is already registered!";
			
			
			
			Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]")).getText(), ExpectedMsg);
			
			
			
				
			


}
}
