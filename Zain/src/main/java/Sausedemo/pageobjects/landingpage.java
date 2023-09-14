package Sausedemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage {
	
	WebDriver driver;
	
	public landingpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//page factory
	@FindBy(id ="user-name")
	WebElement useremail;
	
	@FindBy(id ="password")
	WebElement userpassword;
	
	@FindBy(id ="login-button")
	WebElement Submit;
	
	@FindBy(css="h3[data-test='error']")
	WebElement error;
	
	public void LoginApplication(String username, String password)
	{
		useremail.sendKeys(username);
		userpassword.sendKeys(password);
		Submit.click();
	
		
	}
	public void InvalidCredentials(String username, String password)
	{
		useremail.sendKeys(username);
		userpassword.sendKeys(password);
		Submit.click();
		String message = error.getText();
		System.out.println("invalid credentials" + message);
		
	}
	
	
	public void GoTo()
	{
		driver.get("https://www.saucedemo.com/");
	}
}
