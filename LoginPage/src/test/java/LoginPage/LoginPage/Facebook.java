package LoginPage.LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook {
	@Test
	public void fssbk()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeswari V\\Desktop\\Selenium\\Rahulshetty\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("rveduk27@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
				password.sendKeys("Rajive@27");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement loginbutton=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		loginbutton.click();
		String actualUrl="https://www.facebook.com/";
		String expectedUrl=driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.close();
	}

}
