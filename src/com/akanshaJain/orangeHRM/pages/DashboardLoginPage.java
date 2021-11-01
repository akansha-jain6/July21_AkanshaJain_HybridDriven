package com.akanshaJain.orangeHRM.pages;

import java.util.List;
import org.openqa.selenium.By;
import com.akanshaJain.orangeHRM.base.PreDefinedActions;

public class DashboardLoginPage extends PreDefinedActions {
	
	public String getPageHeaderTitle() {
		return driver.getTitle();
	}
	
	public String getPageTitle() {
		return driver.findElement(By.xpath("//li[@class='page-title']")).getText();
	}
	
	public int getTotalWidgets() {
		return driver.findElements(By.xpath("//div[@class='widget-header']")).size();
	}
	
	public List<String> getAllWidgetText() {
		return getTextOfAllElements("//div[@class='widget-header']/span[2]");
	}
	
	public String getWidgetTextBasedOnIndex(int index) {
		List<String> widgetsList = getAllWidgetText();
		return widgetsList.get(index);
	}
}