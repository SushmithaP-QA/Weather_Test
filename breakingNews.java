package com.weather.test.examplescene;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class breakingNews {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://weather.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div//button[contains(@class,'styles-hOmZ2zQy__button__1eQR_')]")).click();
    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform(); 
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"loginSignUpForm\"]/div[1]/div[1]/fieldset/input")).sendKeys("ctschallenge17@gmail.com");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"loginSignUpForm\"]/div[1]/div[2]/fieldset/input")).sendKeys("Challenge2018");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"loginSignUpForm\"]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"wx-main\"]/div/main/div/form/div[1]/ul/li[2]/div/div[2]/div/div[2]")).click();
	
	}
}
