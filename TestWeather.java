package com.weather.test.examplescene;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWeather {
	@Test
	public void test1() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://weather.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[1]/div/div[1]/button/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/ul/li[3]/a")).click();
		String  Max = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[1]/td[4]/div/span[1]")).getText();
		String  Min = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[1]/td[4]/div/span[3]")).getText();
		System.out.println("Max Temp is :"+Max);
		System.out.println("Min Temp is :"+Min);
		int MaxTemp = Integer.valueOf(Max.substring(0,2));
		int MinTemp = Integer.valueOf(Min.substring(0,2));
		int TempDiff = MaxTemp-MinTemp; 
		System.out.println("Temperature difference is: " +TempDiff);
		Assert.assertTrue(TempDiff<20);
        System.out.println("Test Case Passed");
        Assert.assertTrue(TempDiff>20);
        System.out.println("Test Case Passed");
	}
	@Test
	public void test2() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://weather.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[1]/div/div[1]/button/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/ul/li[3]/a")).click();
		String  Max = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[2]/td[4]/div/span[1]")).getText();
		String  Min = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[2]/td[4]/div/span[3]")).getText();
		System.out.println("Max Temp is :"+Max);
		System.out.println("Min Temp is :"+Min);
		int MaxTemp = Integer.valueOf(Max.substring(0,2));
		int MinTemp = Integer.valueOf(Min.substring(0,2));
		int TempDiff = MaxTemp-MinTemp; 
		System.out.println("Temperature difference is: " +TempDiff);
		Assert.assertTrue(TempDiff<20);
        System.out.println("Test Case Passed");
        Assert.assertTrue(TempDiff>20);
        System.out.println("Test Case Passed");
	}
	@Test
	public void test3() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://weather.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[1]/div/div[1]/button/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/ul/li[3]/a")).click();
		String  Max = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[3]/td[4]/div/span[1]")).getText();
		String  Min = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[3]/td[4]/div/span[3]")).getText();
		System.out.println("Max Temp is :"+Max);
		System.out.println("Min Temp is :"+Min);
		int MaxTemp = Integer.valueOf(Max.substring(0,2));
		int MinTemp = Integer.valueOf(Min.substring(0,2));
		int TempDiff = MaxTemp-MinTemp; 
		System.out.println("Temperature difference is: " +TempDiff);
		Assert.assertTrue(TempDiff<20);
        System.out.println("Test Case Passed");
        Assert.assertTrue(TempDiff>20);
        System.out.println("Test Case Passed");
	}
	@Test
	public void test4() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://weather.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[1]/div/div[1]/button/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/ul/li[3]/a")).click();
		String  Max = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[4]/td[4]/div/span[1]")).getText();
		String  Min = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[4]/td[4]/div/span[3]")).getText();
		System.out.println("Max Temp is :"+Max);
		System.out.println("Min Temp is :"+Min);
		int MaxTemp = Integer.valueOf(Max.substring(0,2));
		int MinTemp = Integer.valueOf(Min.substring(0,2));
		int TempDiff = MaxTemp-MinTemp; 
		System.out.println("Temperature difference is: " +TempDiff);
		Assert.assertTrue(TempDiff<20);
        System.out.println("Test Case Passed");
        Assert.assertTrue(TempDiff>20);
        System.out.println("Test Case Passed");
	}
	@Test
	public void test5() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://weather.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[1]/div/div[1]/button/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/ul/li[3]/a")).click();
		String  Max = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[5]/td[4]/div/span[1]")).getText();
		String  Min = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[5]/td[4]/div/span[3]")).getText();
		System.out.println("Max Temp is :"+Max);
		System.out.println("Min Temp is :"+Min);
		int MaxTemp = Integer.valueOf(Max.substring(0,2));
		int MinTemp = Integer.valueOf(Min.substring(0,2));
		int TempDiff = MaxTemp-MinTemp; 
		System.out.println("Temperature difference is: " +TempDiff);
		Assert.assertTrue(TempDiff<20);
        System.out.println("Test Case Passed");
        Assert.assertTrue(TempDiff>20);
        System.out.println("Test Case Passed");
	}
	@Test
	public void test6() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://weather.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[1]/div/div[1]/button/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/ul/li[3]/a")).click();
		String  Max = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[6]/td[4]/div/span[1]")).getText();
		String  Min = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[6]/td[4]/div/span[3]")).getText();
		System.out.println("Max Temp is :"+Max);
		System.out.println("Min Temp is :"+Min);
		int MaxTemp = Integer.valueOf(Max.substring(0,2));
		int MinTemp = Integer.valueOf(Min.substring(0,2));
		int TempDiff = MaxTemp-MinTemp; 
		System.out.println("Temperature difference is: " +TempDiff);
		Assert.assertTrue(TempDiff<20);
        System.out.println("Test Case Passed");
        Assert.assertTrue(TempDiff>20);
        System.out.println("Test Case Passed");
	}
	@Test
	public void test7() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://weather.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[1]/div/div[1]/button/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/ul/li[3]/a")).click();
		String  Max = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[7]/td[4]/div/span[1]")).getText();
		String  Min = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[7]/td[4]/div/span[3]")).getText();
		System.out.println("Max Temp is :"+Max);
		System.out.println("Min Temp is :"+Min);
		int MaxTemp = Integer.valueOf(Max.substring(0,2));
		int MinTemp = Integer.valueOf(Min.substring(0,2));
		int TempDiff = MaxTemp-MinTemp; 
		System.out.println("Temperature difference is: " +TempDiff);
		Assert.assertTrue(TempDiff<20);
        System.out.println("Test Case Passed");
        Assert.assertTrue(TempDiff>20);
        System.out.println("Test Case Passed");
	}
	@Test
	public void test8() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://weather.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[1]/div/div[1]/button/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/ul/li[3]/a")).click();
		String  Max = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[8]/td[4]/div/span[1]")).getText();
		String  Min = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[8]/td[4]/div/span[3]")).getText();
		System.out.println("Max Temp is :"+Max);
		System.out.println("Min Temp is :"+Min);
		int MaxTemp = Integer.valueOf(Max.substring(0,2));
		int MinTemp = Integer.valueOf(Min.substring(0,2));
		int TempDiff = MaxTemp-MinTemp; 
		System.out.println("Temperature difference is: " +TempDiff);
		Assert.assertTrue(TempDiff<20);
        System.out.println("Test Case Passed");
        Assert.assertTrue(TempDiff>20);
        System.out.println("Test Case Passed");
	}
	@Test
	public void test9() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://weather.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[1]/div/div[1]/button/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/ul/li[3]/a")).click();
		String  Max = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[9]/td[4]/div/span[1]")).getText();
		String  Min = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[9]/td[4]/div/span[3]")).getText();
		System.out.println("Max Temp is :"+Max);
		System.out.println("Min Temp is :"+Min);
		int MaxTemp = Integer.valueOf(Max.substring(0,2));
		int MinTemp = Integer.valueOf(Min.substring(0,2));
		int TempDiff = MaxTemp-MinTemp; 
		System.out.println("Temperature difference is: " +TempDiff);
		Assert.assertTrue(TempDiff<20);
        System.out.println("Test Case Passed");
        Assert.assertTrue(TempDiff>20);
        System.out.println("Test Case Passed");
	}
	@Test
	public void test10() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://weather.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[1]/div/div[1]/button/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/ul/li[3]/a")).click();
		String  Max = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[10]/td[4]/div/span[1]")).getText();
		String  Min = driver.findElement(By.xpath("//*[@id=\"twc-scrollabe\"]/table/tbody/tr[10]/td[4]/div/span[3]")).getText();
		System.out.println("Max Temp is :"+Max);
		System.out.println("Min Temp is :"+Min);
		int MaxTemp = Integer.valueOf(Max.substring(0,2));
		int MinTemp = Integer.valueOf(Min.substring(0,2));
		int TempDiff = MaxTemp-MinTemp; 
		System.out.println("Temperature difference is: " +TempDiff);
		Assert.assertTrue(TempDiff<20);
        System.out.println("Test Case Passed");
        Assert.assertTrue(TempDiff>20);
        System.out.println("Test Case Passed");
	}
}

