package com.Selenium;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeliniumTest2 {
	WebDriver driver;
	String URL = "https://www.facebook.com/";
	public static void main(String[] args) {
		SeliniumTest2 obj = new SeliniumTest2();
		obj.setUp();
		obj.testArrayList();
	}

	public void setUp() {
		System.setProperty("webdriver.chrome.driver",".\\lib\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void testArrayList() {
		List<WebElement> List = driver.findElements(By.tagName("a"));
		System.out.println("Size of the List is: "+List.size());
		ArrayList<String> linkText = new ArrayList<String>();
		for(WebElement ele: List) {
			linkText.add(ele.getText());;
		}
		
		System.out.println("************************************************");
		System.out.println("Size of Array List is: "+linkText.size());
		int i =1;
		for(String lt: linkText) {
			System.out.println(i+"ArrayList Text: "+lt);
			i++;
		}
		
		
	}
	
}
