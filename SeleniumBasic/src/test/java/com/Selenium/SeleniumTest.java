package com.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {

	static String browser;
	static WebDriver driver;

	public static void main(String[] args) throws Exception{

		String ProjectLocation = System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver",ProjectLocation+"\\lib\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("http://demoqa.com/automation-practice-form");
		WebElement FirstName = driver.findElement(By.cssSelector("#firstName"));
		FirstName.sendKeys("Uday Kiran");
		WebElement LastName = driver.findElement(By.cssSelector("#lastName"));
		LastName.sendKeys("Ramisetty");
		WebElement EMailId = driver.findElement(By.cssSelector("#userEmail"));
		EMailId.sendKeys("uday_Ram@gmail.com");
		WebElement Gender = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Gender);
		//Gender.click();
		WebElement MobileNum = driver.findElement(By.cssSelector("#userNumber"));
		MobileNum.sendKeys("8885913864");
		WebElement DOB = driver.findElement(By.cssSelector("#dateOfBirthInput"));
		DOB.click();
		//Thread.sleep(2000);
		WebElement monthYearDisplayed = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']"));
		System.out.println(monthYearDisplayed.getText());
		WebElement monthslector = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		monthslector.click();
		//Thread.sleep(2000);
		WebElement actualMonth = driver.findElement(By.xpath("//option[contains(text(),'December')]"));
		actualMonth.click();
		WebElement yearslector = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		yearslector.click();
		WebElement actualYear = driver.findElement(By.xpath("//option[contains(text(),'1992')]"));
		actualYear.click();
		System.out.println(monthYearDisplayed.getText());
		WebElement actualDate = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--008']"));
		actualDate.click();
		WebElement subjects = driver.findElement(By.cssSelector("#subjectsInput"));
		subjects.click();
		subjects.sendKeys("e");
		subjects.sendKeys(Keys.TAB);
		subjects.sendKeys("m");	
		subjects.sendKeys(Keys.TAB);
		WebElement hobbies1 = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']")); 
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", hobbies1);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbies1);
		//hobbies1.click();
		WebElement hobbies2 = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']")); 
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbies2);
		//hobbies2.click();
		WebElement uploadPic = driver.findElement(By.xpath("//input[@class='form-control-file']"));
		//uploadPic.click();
		uploadPic.sendKeys("C:\\Users\\udaykir101\\Documents\\Capture.JPG");
		WebElement currentAddress = driver.findElement(By.cssSelector("#currentAddress"));
		currentAddress.sendKeys("Nagole,Hyderabad,PIN:500068");
		WebElement state = driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
		state.click();
		WebElement actualState = driver.findElement(By.xpath("//div[contains(text(),'Uttar Pradesh')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", actualState);
		WebElement city = driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
		city.click();
		WebElement actualCity = driver.findElement(By.xpath("//div[contains(text(),'Agra')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", actualCity);
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		submitButton.click();
		WebElement RegDetails = driver.findElement(By.xpath("//div[@class='table-responsive']"));
		System.out.println(RegDetails.getText());
		Thread.sleep(3000);
		WebElement closedetails = driver.findElement(By.xpath("//button[@id='closeLargeModal']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", closedetails);
		closedetails.click();
		Thread.sleep(2000);
		driver.quit();
		//((JavascriptExecutor) dri
		//ver).executeScript("arguments[0].click();", Subjects);
		//Thread.sleep(1000);
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value='E';", Subjects);
		
		//select[@class='react-datepicker__year-select']
		//((JavascriptExecutor) driver).executeScript("arguments[0].value='';", DOB);
		//DOB.clear();
		//Thread.sleep(2000);
		//DOB.sendKeys("05 Dec 1992");
	}
}

