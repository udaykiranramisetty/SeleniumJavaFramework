package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AlertWindowHandle {
	
	public static void main(String[] args) throws Exception {
		handleAlert();
	}
	public static void handleAlert() throws Exception {

		SeliniumTest2 sel = new SeliniumTest2();
		sel.URL = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
		sel.setUp();
		WebElement ClickMe = sel.driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		ClickMe.click();
		Alert alt = sel.driver.switchTo().alert();
		String alttext = alt.getText();
		System.out.println(alttext);
		Assert.assertEquals(alttext, "I am an alert box!"); //softassert
		Thread.sleep(3000);
		alt.accept();
		String mainWindow = sel.driver.getWindowHandle();
		sel.driver.switchTo().window(mainWindow);
		WebElement ClickMe1 = sel.driver.findElement(By.xpath("//div[@id=\'easycont\']/div/div[2]/div[2]/div[2]/button"));
		//((JavascriptExecutor) sel.driver).executeScript("arguments[0].scrollIntoView(true);", ClickMe1);
		Thread.sleep(3000);
		//((JavascriptExecutor) sel.driver).executeScript("arguments[0].click();", ClickMe1);
		ClickMe1.click();
		Alert alt1 = sel.driver.switchTo().alert();
		Thread.sleep(3000);
		String alttext1 = alt1.getText();
		System.out.println(alttext1);
		alt1.dismiss();
		sel.driver.switchTo().window(mainWindow);//switch to default content
		WebElement ClickMe2 = sel.driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]"));
		ClickMe2.click();
		Thread.sleep(5000);
		sel.driver.switchTo().alert();
		//sel.driver.switchTo().defaultContent();
		System.out.println(sel.driver.switchTo().alert().getText());
		sel.driver.switchTo().alert().sendKeys("Uday");
		
		//alt2.sendKeys("uday");
		
		/*
		 * String alttext2 = alt2.getText(); System.out.println(alttext2);
		 * alt2.sendKeys("uday");
		 */
		Thread.sleep(5000);
		/*
		 * WebElement enteredName =
		 * sel.driver.findElement(By.xpath("//p[@id='prompt-demo']"));
		 * System.out.println(enteredName.getText()); Thread.sleep(5000);
		 */
		sel.driver.switchTo().alert().dismiss();


	}

}
