package CucumberTest; 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class StepImplementation {
	
	WebDriver driver = null; 
	
	   @Given("^User is on amazon page$") 
	   public void openBrowser() { 
		   System.setProperty("webdriver.chrome.driver","\\Users\\nihanda\\Downloads\\Selenium Driver 2\\Chrome Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
	   } 
		
	   @When("^User searches for appium book to select 10th book$") 
	   public void searchbook() { 
		   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("appium book");
		   driver.findElement(By.id("nav-search-submit-text")).click();
		  		   
	   } 
		
	   @Then("^User prints details to add it to the cart$") 
	   public void loginButton() { 
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   WebElement Book = driver.findElement(By.linkText("How to Cook Everything―Completely Revised Twentieth Anniversary Edition: Simple Recipes for Great Food"));
		   Book.click();
		   WebElement Rating = driver.findElement(By.id("acrCustomerReviewText"));
		   System.out.println("The book rating is:" + Rating.getText());
		   driver.findElement(By.id("add-to-cart-button")).click();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.findElement(By.id("nav-cart-count")).click();
		   WebElement Price = driver.findElement(By.id("sc-subtotal-amount-activecart"));
		   System.out.println("The final book price is:" + Price.getText());

	      driver.close(); 
	   } 
	}
	
