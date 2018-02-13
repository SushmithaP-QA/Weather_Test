package com.weather.test.examplescene;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loginGm {
public static void main(String[] args) throws InterruptedException
{
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
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\":6k\"]/span")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\":7w\"]/div[1]/table/tbody/tr[1]/td/div/table[1]/tbody/tr[2]/td/a/span/img")).click();
    driver.findElement(By.xpath("//div//button[contains(@class,'styles-hOmZ2zQy__button__1eQR_')]")).click();
    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform(); 
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"loginSignUpForm\"]/div[1]/div[1]/fieldset/input")).sendKeys("ctschallenge17@gmail.com");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"loginSignUpForm\"]/div[1]/div[2]/fieldset/input")).sendKeys("Challenge2018");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"loginSignUpForm\"]/button")).click();
}
}
