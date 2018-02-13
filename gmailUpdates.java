package com.weather.test.examplescene;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailUpdates {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("ctschallenge17@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("2018@Challenge");
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"gbqfq\"]")).sendKeys("The Weather Channel");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"gbqfb\"]/span")).click();
	    
	}

}
