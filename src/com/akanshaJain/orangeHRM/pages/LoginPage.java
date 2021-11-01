package com.akanshaJain.orangeHRM.pages;

import org.openqa.selenium.By;
import com.akanshaJain.orangeHRM.base.PreDefinedActions;

public class LoginPage extends PreDefinedActions{
	
	public boolean isLogoDisplayed() {
		return driver.findElement(By.xpath("//img")).isDisplayed();
	}
	
	public boolean isLoginPanelDisplayed() {
		return driver.findElement(By.xpath("//div[@id='logInPanelHeading']")).isDisplayed();
	}
	
	public void enterCreds(String userName, String password) {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	}
	
	public SlideMenuPage clickOnLoginButton() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		return new SlideMenuPage();
	}
	
	public String getLoginErrorMessage() {
		return driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
	}
}