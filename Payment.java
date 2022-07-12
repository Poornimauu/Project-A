package com.project;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Payment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.flipkart.com/");
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));

		btnclose.click();
		WebElement txtsearch = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		txtsearch.sendKeys("shoes");
		WebElement btnsearch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));

		btnsearch.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement btnshort = driver.findElement(By.xpath("//div[text()='Price -- Low to High']"));
		btnshort.click();
		WebElement lnksec = driver.findElement(By.xpath("//a[@title='Running Shoes Running Shoes For Men']"));

		lnksec.click();
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		for (String eachWindowsId : allwindows) {
			if(!parentid .equals(eachWindowsId));
			driver.switchTo().window(eachWindowsId);
		}

		WebElement btncard = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));

		btncard.click();

		WebElement size = driver.findElement(By.xpath("//a[text()='6']"));

		 size .click();
WebElement addtocadd1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));

addtocadd1.click();
driver.close();
driver.switchTo().window(parentid);
Thread.sleep(2000);

WebElement lnk3= driver.findElement(By.xpath("//a[@title='Running shoes Running Shoes For Men']"));

lnk3.click();
Thread.sleep(2000);
Set<String> allwindows2 = driver.getWindowHandles();
System.out.println(allwindows2);
for (String eachWindowsId2 : allwindows2) {
	if(!parentid .equals(eachWindowsId2));
	driver.switchTo().window(eachWindowsId2);
}






	}
}