package test_cases;

import org.testng.annotations.Test;

import pom.login_page;

public class login_test extends base_test {
	
	
	
  
	@Test(priority = 1)
	public static void userlogin() throws InterruptedException {
		
		driver.get("https://www.saucedemo.com/");
		
		login_page newlogin = new login_page(driver);
		newlogin.logintheuser("standard_user", "secret_sauce");
		}
	
	@Test(priority = 2)
	public void failuser() throws InterruptedException {
	
		driver.get("https://www.saucedemo.com/");
		login_page faillogin = new login_page(driver);
		faillogin.logintheuser("test", "secret_sauce");
		
	}
	
}
