package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators_CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\lib\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.demoqa.com/checkbox");
		driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
		//WebElement Result = driver.findElement(By.xpath("//div[@id='result']"));
		//System.out.println(Result.getText());
		
	}

}
