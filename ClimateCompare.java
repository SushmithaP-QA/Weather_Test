package com.weather.test.examplescene;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClimateCompare {
	
	@Test
	public void testComparator() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://weather.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[1]/div/div[1]/div/div[1]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[1]/div/div[1]/div/div[1]/div/input"))
				.sendKeys("San Francisco CA");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"APP\"]/div/div[6]/div[1]/div/div[1]/div/div[2]/div[2]/div/ul/li[1]/a"))
				.click();
		String temparature = driver.findElement(By
				.xpath("//*[@id=\"APP\"]/div/div[7]/div[2]/div[2]/div[2]/div[1]/div/section/div[2]/div[1]/div[2]/span"))
				.getText();
		String feelslike = driver.findElement(By.xpath(
				"//*[@id=\"APP\"]/div/div[7]/div[2]/div[2]/div[2]/div[1]/div/section/div[2]/div[1]/div[4]/span[2]"))
				.getText();
		String dewpoint = driver.findElement(By.xpath(
				"//*[@id=\"APP\"]/div/div[7]/div[2]/div[2]/div[2]/div[1]/div/section/div[3]/table/tbody/tr[3]/td/span"))
				.getText();
		String weather = driver
				.findElement(By.xpath(
						"//*[@id=\"APP\"]/div/div[7]/div[2]/div[2]/div[2]/div[1]/div/section/div[2]/div[1]/div[3]"))
				.getText();
		String humidity = driver.findElement(By.xpath(
				"//*[@id=\"APP\"]/div/div[7]/div[2]/div[2]/div[2]/div[1]/div/section/div[3]/table/tbody/tr[2]/td/span/span"))
				.getText();

		when().get("http://api.wunderground.com/api/99a8db9a0f3c2e31/forecast/geolookup/conditions/q/CA/San_Francisco.json")
				.then().body("current_observation.weather", equalTo(weather))
				.body("current_observation.relative_humidity", equalTo(humidity))
				.body("current_observation.temp_f", equalTo(temparature.substring(0,temparature.length()-2)))
				.body("current_observation.feelslike_f", equalTo(feelslike.substring(0,feelslike.length()-2)))
				.body("current_observation.dewpoint_f", equalTo(dewpoint.substring(0,dewpoint.length()-2)));   
	}
}