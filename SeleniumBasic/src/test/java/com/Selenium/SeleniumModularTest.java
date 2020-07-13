package com.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumModularTest {
	static String browser;
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		setBrowser();
		setBrowserConfig();
		runTests();
		closeBrowser();
	}
	
	public static void setBrowser(){
		browser = "Chrome";
	}
	public static void setBrowserConfig(){
		//String ProjectLocation = System.getProperty("user.dir");	
		if(browser.contains("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);
			//options.addArguments("--no sandbox");
			options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", ".\\lib\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		}		
	}
	
	public static void runTests() throws Exception {
		driver.get("http://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		
		WebElement FirstName = driver.findElement(By.id("firstName"));
		WebElement LastName= driver.findElement(By.xpath("//input[@id=\'lastName\']"));
		WebElement Email = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		WebElement Gender = driver.findElement(By.xpath("//label[@for='gender-radio-1' and @class='custom-control-label']"));
		WebElement Mobile = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		WebElement DateofBirthField = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		try {
			if(FirstName.isDisplayed()) {
				FirstName.sendKeys("uday");
				
				System.out.println("FirstName Entered");
			}else {
				System.out.println("Element not found");
			}
		}catch (Exception e) {
			System.out.println("No element found, check Locator");
		}
		try {
			if(LastName.isDisplayed()) {
				LastName.sendKeys("kiran");
				System.out.println("LastName Entered");
			}else {
				System.out.println("Element not found");
			}

		}catch (Exception e) {
			System.out.println("No element found, check Locator");
		}
		try {
			if(Email.isDisplayed()) {
				Email.sendKeys("uday@gmail.com");
				System.out.println("Mail id Entered");
			}else {
				System.out.println("Element not found");
			}
		}catch (Exception e) {
			System.out.println("No element found, check Locator");
		}
		try {
			if(Gender.isDisplayed()) {
				Gender.click();
				System.out.println("Gender selected");
			}else {
				System.out.println("Element not found");
			}
		}catch (Exception e) {
			System.out.println("No element found, check Locator");
		}
		try {
			if(Mobile.isDisplayed()) {
				Mobile.sendKeys("8885913865");
				System.out.println("Moblie Number Entered");
			}else {
				System.out.println("Element not found");
			}
		}catch (Exception e) {
			System.out.println("No element found, check Locator");
		}
		try {
			
			if(DateofBirthField.isDisplayed()) {
				DateofBirthField.click();
				Thread.sleep(3000);
				
				WebElement SelectMonthSelector = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
				WebElement SelectMonth = driver.findElement(By.xpath("//option[@value='11']"));
				WebElement SelectYearSelector = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
				WebElement SelectYear = driver.findElement(By.xpath("//option[@value='1992']"));
				WebElement SelectDate = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--008 react-datepicker__day--selected']"));
				SelectMonthSelector.click();
				Thread.sleep(2000);
				SelectMonth.click();
				Thread.sleep(2000);
				SelectYearSelector.click();
				Thread.sleep(2000);
				SelectYear.click();
				Thread.sleep(2000);
				SelectDate.click();
				Thread.sleep(2000);
				System.out.println("Moblie Number Entered");
			}else {
				System.out.println("Element not found");
			}
		}catch (Exception e) {
			System.out.println("No element found, check Locator");
		}
		Thread.sleep(2000);
		System.out.println("Test Passed");
		
	}
	public static void closeBrowser() {
		driver.quit();
	}
}
