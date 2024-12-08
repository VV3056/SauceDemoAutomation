package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {

	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(name ="password")
	WebElement passwrd;
	
	@FindBy(xpath="//input[@id=\"login-button\"]")
	WebElement logbtn;
	
	
	public login_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

	public void logintheuser(String usern,String pwd) throws InterruptedException {
		username.sendKeys(usern);
		Thread.sleep(2000);
		passwrd.sendKeys(pwd);
		Thread.sleep(2000);
		logbtn.click();
	}

	
}
