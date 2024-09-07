package com.page;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.libglobal.BaseClass;

public class loginPojoClass extends BaseClass {
	
	public loginPojoClass() {
         PageFactory.initElements(driver, this); // Initialize PageFactory elements
    }
		
	
	@FindBy(xpath ="(//a[text()='Create an Account'])[1]")
    private WebElement CreateAccount;
	@FindBy(xpath ="(//input[@id='firstname']")
    private WebElement FirstName;
	@FindBy(xpath = "//input[@id='lastname']")
    private WebElement LastName; 
	@FindBy(xpath = "//input[@id='email_address']")
    private WebElement Email; 
	@FindBy(xpath = "//input[@id='password']")
    private WebElement Pass; 
	@FindBy(xpath = "//input[@id='password-confirmation']")
    private WebElement PassConfor; 
	@FindBy(xpath = "//button[@class='action submit primary']")
    private WebElement Confirm; 
	@FindBy(xpath = "//div[text()='Thank you for registering with Main Website Store.']")
    private WebElement CreateSuccessMsg; 
	@FindBy(xpath = "(//button[@class='action switch'])[1]")
    private WebElement DropDown; 
	@FindBy(xpath = "(//li[@class='authorization-link'])[1]")
    private WebElement Signout; 
	@FindBy(xpath = "(//li[@class='authorization-link'])[1]")
    private WebElement SigIn;
	@FindBy(xpath = "(//strong[@id='block-customer-login-heading'])[1]")
    private WebElement MainSignIn;
	@FindBy(xpath = "//input[@id='email']")
    private WebElement SignEmail;
	@FindBy(xpath = "(//input[@id='pass'])[1]")
    private WebElement Pass1;
	@FindBy(xpath = "(//span[text()='Sign In'])[1]")
    private WebElement Submit1;
	
	@FindBy(xpath = "//span[@class='base']")
    private WebElement LoginPageEnter;
	
	


	public WebElement ClickCreateAccount() {
		return CreateAccount;
	}
	
	public WebElement FirstNameEnter() {
		return FirstName;
	}
	public WebElement LastNameEnter() {
		return LastName;
	}
	public WebElement EmailEnter() {
		return Email;
	}
	public WebElement PassEnter() {
		return Pass;
	}
	public WebElement PassEnterAgain() {
		return PassConfor;
	}
	
	public WebElement Submit() {
		return Confirm;
	}
	public WebElement SuccessMessage() {
		return CreateSuccessMsg;
	}
	
	public WebElement SelectDropDown() {
		return DropDown;
	}
	public WebElement SignInBtn() {
		return SigIn;
	}
	public WebElement MainSignInPage() {
		return MainSignIn;
	}
	
	public WebElement SignInEmail() {
		return SignEmail;
	}
	public WebElement SignInPass() {
		return Pass1;
	}
	
	public WebElement SignInSubmit() {
		return Submit1;
		
	}
	public WebElement SuccessfulLogin() {
		return LoginPageEnter;
		
	}
	
	
}
