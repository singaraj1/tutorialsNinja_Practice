package testCases;

import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class RegistraionPage extends BaseTest {
	
	@Test
	public void registraionwithmandatoryField()
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
		
		
		
		
		
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
		String confirmMsgSite=driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
		
		String expectedMsg="Your Account Has Been Created!";
	//	Assert.assertEquals(expectedMsg, confirmMsgSite);
		
		Assert.assertEquals(confirmMsgSite, expectedMsg);
		
		
		
		String contentTextPage=driver.findElement(By.id("content")).getText();
		
		Assert.assertTrue(contentTextPage.contains("Congratulations! Your new account has been successfully created!"));
		
		driver.findElement(By.linkText("Continue")).click();
		
	Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		//Assert.ass
	}
	

}
