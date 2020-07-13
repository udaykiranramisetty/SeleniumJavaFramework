package com.testNG;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class App {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\lib\\ChromeDriver\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		
			
		
	

}
}	
