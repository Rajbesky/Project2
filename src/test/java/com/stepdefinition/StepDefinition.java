package com.stepdefinition;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;

import com.libglobal.BaseClass;
import com.page.loginPojoClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;


public class StepDefinition extends BaseClass{
  	loginPojoClass f = new loginPojoClass();
	
	
	@Given("the user is on the Create account page")
	public void the_user_is_on_the_create_account_page() {
		
		launchBrowser();
		loadUrl("https://magento.softwaretestingboard.com/");
		maximizeWindow();
		
	}

	@When("the user fills and submit sign up form with valid details")
	public void the_user_fills_and_submit_sign_up_form_with_valid_details() throws InterruptedException{

		
//		Thread.sleep(5000);
//		WebElement ssd = driver.findElement(By.xpath("(//a[text()='Create an Account'])[1]"));
//		
//           ssd.click();
		btnClick(f.ClickCreateAccount());	
     
     type(f.FirstNameEnter(), "NewTest");
     type(f.LastNameEnter(), "White");
     type(f.EmailEnter(), "Vaado@gmail.com");
     type(f.PassEnter(), "Google@123456");
     type(f.PassEnterAgain(), "Google@123456");
     btnClick(f.Submit());	
		
	}

	
	@Then("the user should see a success message confirming account creation")
	public void the_user_should_see_a_success_message_confirming_account_creation() 
	
	{
	    
		 WebElement CreatePageSuccessmsg = driver.findElement(By.xpath("//div[text()='Thank you for registering with Main Website Store.']"));	 
		 String s = CreatePageSuccessmsg.getText();
		 System.out.println(s);
		 if (s.equals("Thank you for registering with Main Website Store.")) {
		 System.out.println("Validation successful: 'Thank you' message is displayed.");
		 btnClick(f.SelectDropDown());
		 btnClick(f.SignInBtn());

		 } else {
		 System.out.println("Validation failed: 'Thank you' message is not displayed.");
		 }

		
	}


	@Then("the user clicks and redirected to the sign-in page")
	public void the_user_clicks_and_redirected_to_the_sign_in_page() {
		FluentWait  wait = new  FluentWait (driver);
		 WebElement SignIn = driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]"));


		 boolean MainPage = wait.until(ExpectedConditions.elementToBeClickable(SignIn)) != null;


		 if (MainPage) {
		 SignIn.click();
		 System.out.println("Element is clickable");
		 } else {
		 System.out.println("The element is not clickable.");
		 }
		

	}

	@When("the user fills in the sign-in form with the created account details")
	public void the_user_fills_in_the_sign_in_form_with_the_created_account_details(io.cucumber.datatable.DataTable dataTable) {
	  
		WebElement MainSiginPage = driver.findElement(By.xpath("(//strong[@id='block-customer-login-heading'])[1]"));	 
		 String M = MainSiginPage.getText();
		 if (M.equalsIgnoreCase("Registered Customers")) {
		 System.out.println("Validation successful: user is in sign in page");
		 } else {
		 System.out.println("Validation failed: 'user is not in sign in page");
		 }
		 
	}

	@When("the user submits the sign-in form")
	public void the_user_submits_the_sign_in_form() {
		
		type(f.SignInEmail(),"Vaado@gmail.com" );
		type(f.SignInPass(),"Google@123456");
	  
		
	}

	@Then("the user should be successfully signed in")
	public void the_user_should_be_successfully_signed_in() {

		 btnClick(f.SignInSubmit());
		 
		 System.out.println("Able to create account and sign in successfully");	 
	 
		
	}

	@Then("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
	 
		WebElement loggedIn = driver.findElement(By.xpath("//span[@class='base']"));
	   String Okay= loggedIn.getText();
	   if(Okay.equals("My Account")){
		   System.out.println("User is in the home page");
		   
	   }
	   else {
		   
		   System.out.println("User is not in the home page");
	   }
		 QuitBrowser();

	}

	
}
