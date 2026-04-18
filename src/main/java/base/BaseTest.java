package base;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	 @BeforeMethod
	public void setup()
	{
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://tutorialsninja.com/demo/");
		
	}
	// @AfterMethod
	 
	/* public void teardown()
	 {
		// WebDriverWait wait=new WebDriverWait(driver,10);
		 
		 driver.quit();
	 }*/
	 
	 public String emailGen1()
	 {
		 return new Date().toString().replaceAll("\\s","").replaceAll("\\:","")+"gmail.com";
	 }

	public String emailGen() {
		// TODO Auto-generated method stub
		 return new Date().toString().replaceAll("\\s","").replaceAll("\\:","")+"@gmail.com";
	}
}
