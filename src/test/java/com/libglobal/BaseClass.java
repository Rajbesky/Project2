package com.libglobal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.cucumber.java.Before;

public class BaseClass {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/besky/Downloads");
		
		 driver = new ChromeDriver();	
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public static void btnClick(WebElement e) {
		e.click();
	}
	public static void type(WebElement element, String name ) {
		element.sendKeys(name);
		
	}
	public static void QuitBrowser() {
		
		driver.close();
	}

	
	public static WebDriver getDriver() {
        return driver;
    }

}
