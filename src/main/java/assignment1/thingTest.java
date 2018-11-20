package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class thingTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\angus\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080");
		driver.manage().window().maximize();
	}
	
}
