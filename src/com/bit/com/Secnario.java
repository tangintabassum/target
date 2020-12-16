package com.bit.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secnario {

	ChromeDriver dr = new ChromeDriver();

	public void OpenBrowser() {
		dr = new ChromeDriver();

	}

	public void gotoAnyWebSite1(String url) {
		dr.get(url);
	}

	public void clickOnAnyElement(By locator) {
		dr.findElement(locator).click();

	}

	public void typeOnAnyElement(By by, String value) {

		dr.findElement(by).sendKeys(value);

	}

	public void PrintTitle() {

		String h = dr.getTitle();
		System.out.println(h);

	}

	public void printTitleUrl() {

		String f = dr.getCurrentUrl();

		System.out.println(f);
	}


	public void closeBrowser() {
		dr.quit();
	}
	

}
