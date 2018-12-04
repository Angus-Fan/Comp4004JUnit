package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class twoHumanOneAI {
	@Test
	public void initDriver() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\angus\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/apacheTestServer/playerSubmission.html");
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(5000);
			driver.findElement(By.id("playerInput")).sendKeys("3");
			driver.findElement(By.id("realPlayerInput")).sendKeys("2");
			driver.findElement(By.id("submitButt")).click();
			assertEquals("3",driver.findElement(By.id("playerInput")).getAttribute("value"));
			assertEquals("2",driver.findElement(By.id("realPlayerInput")).getAttribute("value"));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Thread.sleep(5000);
			String ans = driver.findElement(By.id("hid0")).getAttribute("value");
			String ans2 = driver.findElement(By.id("hid1")).getAttribute("value");

			driver.findElement(By.id("playerInput0")).sendKeys(ans);
			driver.findElement(By.id("playerInput1")).sendKeys(ans2);
			assertEquals(ans,driver.findElement(By.id("playerInput0")).getAttribute("value"));
			assertEquals(ans2,driver.findElement(By.id("playerInput1")).getAttribute("value"));
			Thread.sleep(5000);
			driver.findElement(By.id("submitButt")).click();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	
}
