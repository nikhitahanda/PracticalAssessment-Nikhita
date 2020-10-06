package com.selenium.PracticalAssessment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class AmazonTest {
	WebDriver driver;
	
  @Test
  public void amazon() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	  driver.findElement(By.id("nav-search-submit-text")).click();
	  driver.findElement(By.className("sb_3AXzcZxp")).click();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.id("x4ch4f2ob1")).click();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  WebElement Rating = driver.findElement(By.className("qa-average-customer-rating-review-text"));
	  System.out.println(Rating.getText());
	  WebElement Price = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/div[2]/div[5]/div/div[2]/div/span[1]"));
	  System.out.println("The price of the iphone is:" + Price.getText());
	  Assert.assertTrue(driver.findElement(By.id("comparison-chart")).isDisplayed());
	  driver.findElement(By.id("a-autoid-29-announce")).click();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","\\Users\\nihanda\\Downloads\\Selenium Driver 2\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  
	 driver.quit();
  }

}
