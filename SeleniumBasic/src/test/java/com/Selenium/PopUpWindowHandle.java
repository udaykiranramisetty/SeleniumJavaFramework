package com.Selenium;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class PopUpWindowHandle {
	public static void multiwindows()throws Exception {
		SeliniumTest2 sel = new SeliniumTest2();
		sel.URL = "https://www.seleniumeasy.com/test/window-popup-modal-demo.html";
		sel.setUp();
		Thread.sleep(2000);
		String HomePage = sel.driver.getWindowHandle();
		System.out.println("Home page Title is :  "+  sel.driver.getTitle());
		//System.out.println("Parent Window id id: "+HomePage);
		WebElement twowinButton = sel.driver.findElement(By.xpath("//div [@class='two-windows']/a"));
		twowinButton.click();
		Thread.sleep(2000);
		Set<String> allwindows = sel.driver.getWindowHandles();
		int i = 0;
		for(String allw: allwindows) {
			System.out.println("Window id of "+i+"th window is: " +allw );
			i++;
		}
		ArrayList<String> windows = new ArrayList<String>(allwindows);
		sel.driver.switchTo().window(windows.get(1));
		System.out.println("Switched window is :  "+  sel.driver.getTitle());
		sel.driver.manage().window().maximize();
		WebElement userid = sel.driver.findElement(By.xpath("//table/tbody/tr[2]/td/input[@id='email']"));
		userid.sendKeys("kiran.u576@yahoo.com");
		WebElement pass = sel.driver.findElement(By.xpath("//table/tbody/tr[2]/td/input[@id='pass']"));
		pass.sendKeys("Uk$$2018");
		WebElement login = sel.driver.findElement(By.xpath("//label[@id='loginbutton']"));
		login.click();
		WebElement pagetitle = sel.driver.findElement(By.xpath("//div[@class = 'tr9rh885']/div/div/h2/span"));
		String pgTitle = pagetitle.getText();
		System.out.println(pgTitle);
		if(pgTitle.contains("Selenium Easy")) {
			System.out.println("Login Success");
		}else {
			System.out.println("Element not found");
		}
		
		File scrFile = ((TakesScreenshot)sel.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\udaykir101\\Desktop\\New folder (3)\\tes.jpeg"));
		sel.driver.close();
		sel.driver.switchTo().window(windows.get(2));
		sel.driver.close();
		sel.driver.switchTo().window(HomePage	);
		sel.driver.close();
		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		multiwindows();
	}




}
