package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.login_page;

public class login_test {
	
  
	@Test
	public static void userlogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		login_page newlogin = new login_page(driver);
		newlogin.logintheuser("standard_user", "secret_sauce");
		}
	
	
	
}
