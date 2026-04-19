package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class Tc_003 extends BaseTest{
	
	
	@Test
	public void verifysubscribeOption()
	{
		BaseTest bs=new BaseTest();
		driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();
		//driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		driver.findElement(By.linkText("Register")).click();
		
		
		driver.findElement(By.id("input-firstname")).sendKeys("Raj");
		driver.findElement(By.id("input-lastname")).sendKeys("S");
		//driver.findElement(By.id("input-email")).sendKeys("demotestT@gmail.com");
		driver.findElement(By.id("input-email")).sendKeys(bs.emailGen());
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Hello@123");
		driver.findElement(By.xpath("//input[@name=\"confirm\"]")).sendKeys("Hello@123");
		
		driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.findElement(By.linkText("Continue")).click();
		
		driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter")).click();
		
		Assert.assertTrue(driver.findElement(By.linkText("Newsletter")).isDisplayed());
		
		String expectedMsg="Newsletter Subscription";
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id=\"content\"]/h1")).getText(), expectedMsg);
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@type=\"radio\"][@value=\"0\"]")).isDisplayed());
		
	}

}
