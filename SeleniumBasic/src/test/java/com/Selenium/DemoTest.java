package com.Selenium;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest {
	static WebDriver driver;
	//public static void main(String[] args) {
	//	DemoTest Obj =new DemoTest();
	//	Obj.browserSetUp();
	//	Obj.dropdownTest();
	////	Obj.closeBrowser();
	//}
	@BeforeTest
	public void browserSetUp() {
		System.setProperty("webdriver.chrome.driver",".\\lib\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void dropdownTest() {
		List<WebElement> DropDownItems = driver.findElements(By.xpath("//option[contains(text(),'day')]"));
		System.out.println("Number of Items in Dropdown are: "+DropDownItems.size());
		//directly printing from WebElement 
		for(WebElement le:DropDownItems ) {
			System.out.println(le.getText());
		}
		//Creating new List and adding all items in web element to new list
		ArrayList<String> MyList = new ArrayList<String>();
		for(WebElement ele:DropDownItems) {
			MyList.add(ele.getText());
		}
		System.out.println("Number of items in MyList are: "+MyList.size());
		//prints items inside new list
		 for(String myItems: MyList) {
			 System.out.println(myItems);
			 } 
		 List<String> expectedList = new ArrayList<String>();
		 expectedList.add("Sunday");
		 expectedList.add("Monday");
		 expectedList.add("Tuesday");
		 expectedList.add("Wednesday");
		 expectedList.add("Thursday");
		 expectedList.add("Friday");
		 expectedList.add("Saturday");
		 System.out.println();
		 for(String expvalues:expectedList ) {
			 System.out.println(expvalues);
		 }
		 if(MyList.equals(expectedList)) {
			 System.out.println("PASS  "+"Actual Values: "+MyList+"  Expected Values:  "+expectedList);
			 Assert.assertTrue(true);
		 }else {
			 System.out.println("FAIL  "+"Actual Values: "+MyList+"  Expected Values:  "+expectedList);
			 expectedList.removeAll(MyList);
			 System.out.println("Miss Match values are: "+expectedList);
			 Assert.assertTrue(false);
		 }
		 WebElement dayDropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		 dayDropDown.click();
		 WebElement selectedDay = driver.findElement(By.xpath("//select[@id='select-demo']/option[4]"));
		 selectedDay.click();
		 String SelectedDayfromDropdown = selectedDay.getText();
		 System.out.println(SelectedDayfromDropdown);
		 WebElement selectedDayValue = driver.findElement(By.xpath("//p[@class='selected-value']"));
		 String DisplayedDay = selectedDayValue.getText();
		 System.out.println(DisplayedDay);
		 if(DisplayedDay.contains(SelectedDayfromDropdown)) {
			 System.out.println("PASS");
		 }else
			 System.out.println("FAIL");
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}

}
