package com.akanshaJain.orangeHRM.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreDefinedActions {
	protected static WebDriver driver;
	
	public static void start(String url) {
		System.setProperty("webdriver.chrome.driver", ".//resources//chromedriver");
		System.out.println("STEP - Open Chrome Browser");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("STEP - Enter url");
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void start() {
		System.setProperty("webdriver.chrome.driver", ".//resources//chromedriver");
		System.out.println("STEP - Open Chrome Browser");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("STEP - Enter url");
		driver.get("https://automationaj06-trials72.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	protected List<String> getTextOfAllElements(String locator) {
		List<WebElement> widgetListElements = driver.findElements(By.xpath(locator));
		List<String> widgetList = new ArrayList<String>();
		for(WebElement widgetElement : widgetListElements) {
			widgetList.add(widgetElement.getText());
		}
		return widgetList;
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
}