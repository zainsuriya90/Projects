package Sausedemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalogue {
	
	WebDriver driver;
	
	public ProductCatalogue(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//page factory
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	 WebElement addtocart;
	
	@FindBy(css=".shopping_cart_link")
	 WebElement cart;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	WebElement remove;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement check;
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement postalcode;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement conti;
	
	@FindBy(xpath="//button[@id='finish']")
	WebElement finish;
	
	@FindBy(css=".complete-header")
	WebElement confirmation;
	
	public void AddToCart()
	{
		addtocart.click();
		cart.click();
	}
	public void RemoveProduct()
	{
		remove.click();
	}
	
	public void CheckOut()
	{
		check.click();
		firstname.sendKeys("zain");
		lastname.sendKeys("Suria");
		postalcode.sendKeys("001");
		conti.click();
		
		Actions action = new Actions(driver);
		for  (int i = 0 ; i<=4; i++)
		{
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		finish.click();
	 String message = confirmation.getText();
	 System.out.println("confirmation message is" + message);
		
		
	}
	
}
