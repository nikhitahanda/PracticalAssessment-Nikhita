package com.selenium.PracticalAssessment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class WayfairTest {
	
	WebDriver driver; 
	
  @Test
  public void wayfair() {
	  
	  driver.findElement(By.className("DepartmentItem-link")).click();
	  driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/main/div[1]/div/article/div[2]/div/ul/li[2]/a/div/div/img")).click();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	  WebElement Rating = driver.findElement(By.cssSelector("#bd > div.BrowseCore-content > div.Grid.Grid--fullBleed.Grid--useNewBreakpoints.u-flexWrap.BrowseProductGrid > div:nth-child(12) > div > div > div > a > div.ProductCard-details > div.ProductCard-reviews > div > p.pl-ReviewStars-reviews"));
	  System.out.printf(Rating.getText());
	  WebElement Price = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[12]/div/div/div/a/div[2]/div[3]/span"));
	  System.out.printf(Price.getText());
	  
	WebElement Item = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[12]/div/div/div/a"));
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("arguments[0].click()", Item);
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.findElement(By.id("btn-add-to-cart")).click();
	 
	  
  }
  
  @BeforeMethod
    public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","\\Users\\nihanda\\Downloads\\Selenium Driver 2\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.wayfair.com/");
  }

  @AfterClass
  public void afterClass() {
	 driver.quit();
  }

}
