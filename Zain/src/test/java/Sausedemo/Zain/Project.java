package Sausedemo.Zain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Sausedemo.pageobjects.ProductCatalogue;
import Sausedemo.pageobjects.landingpage;

public class Project {

	
	// Test case 1: Login with valid Credentials
	@Test (priority = 1)
	public void login()
	{
		
	 WebDriver driver = new ChromeDriver();
	 landingpage page = new landingpage(driver); 
	 page.GoTo();
	 page.LoginApplication("standard_user", "secret_sauce");
	}
	
	//Test Case 2: Login with invalid credentials
	@Test (priority = 2)
	public void invalid()
	{
		
		 WebDriver driver = new ChromeDriver();
		 landingpage page = new landingpage(driver); 
		 page.GoTo();
		 page.InvalidCredentials("standard_use", "secret_sauce");
		 
		}
	
	//Test Case 3: Add the product
	 @Test (priority = 3)
	 public void AddProduct()
	 {
	 WebDriver driver = new ChromeDriver();
	 landingpage page = new landingpage(driver); 
	 page.GoTo();
	 page.LoginApplication("standard_user", "secret_sauce");
	 ProductCatalogue product = new ProductCatalogue(driver);
	 product.AddToCart();
	}
	 
	 //Test Case: 4 Remove the Product
	 @Test (priority = 4)
	 public void DeleteProduct()
	 {
		 WebDriver driver = new ChromeDriver();
		 landingpage page = new landingpage(driver); 
		 page.GoTo();
		 page.LoginApplication("standard_user", "secret_sauce");
		 ProductCatalogue product = new ProductCatalogue(driver);
		 product.AddToCart();
		 product.RemoveProduct();
	 }
	 
	 //Test Case 5: Completing the Order
	 @Test (priority = 5)
	 public void CheckOutProduct()
	 {
		 WebDriver driver = new ChromeDriver();
		 landingpage page = new landingpage(driver); 
		 page.GoTo();
		 page.LoginApplication("standard_user", "secret_sauce");
		 ProductCatalogue product = new ProductCatalogue(driver);
		 product.AddToCart();
		 product.CheckOut();
		 
		
	 }
	
}


