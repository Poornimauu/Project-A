package com.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
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



}
}