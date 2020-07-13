package com.Locators;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators_TextBox {
	static WebDriver driver;
	static ChromeOptions options;
	public static void main(String[] args) {
		//to handle the pop up due to PwC Admin restrictions
		options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		//to start driver in maximized state
		options.addArguments("--start-maximized");
		//location where our drive.exe is available on local machine
		System.setProperty("webdriver.chrome.driver", ".\\lib\\ChromeDriver\\chromedriver.exe");
		//opens the driver
		driver = new ChromeDriver(options);
		//to enter the url into driver and load it
		driver.get("http://www.demoqa.com/text-box");
		// implicit wait till 10 seconds before throwing no such element found
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//locators for finding web elements are id, Name, linktext, cssselector, partial link text and Xpath
		WebElement UserName = driver.findElement(By.id("userName"));
		UserName.sendKeys("UdayKiran");
		WebElement UserEmail = driver.findElement(By.id("userEmail"));
		UserEmail.sendKeys("uday@gmail.com");
		WebElement UserCurrentAddress = driver.findElement(By.cssSelector("#currentAddress"));
		UserCurrentAddress.sendKeys("Ulsoor, Bangalore");
		WebElement UserPermanentAddress = driver.findElement(By.cssSelector("#permanentAddress"));
		UserPermanentAddress.sendKeys("Nagole, Hyderabad");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement SubmitForm = driver.findElement(By.id("submit"));
		//to scroll till submit button is visible on web page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", SubmitForm);
		SubmitForm.click();
		WebElement EnteredData = driver.findElement(By.cssSelector("#output"));
		System.out.println(EnteredData.getText());
		driver.quit();	
	}

}
