package com.bit.com;

import org.openqa.selenium.By;

public class Shared {
	
	
	public static void main(String[] args) {
		
		
		
		Secnario d = new Secnario();
		
		d.OpenBrowser();
		d.gotoAnyWebSite1("https://www.target.com/");
		d.typeOnAnyElement(By.id("search"), " kids shoes");
		d.clickOnAnyElement(By.xpath("//*[@id=\"headerMain\"]/div/form/button[2]"));
		//d.closeBrowser();//

		
	}

}


