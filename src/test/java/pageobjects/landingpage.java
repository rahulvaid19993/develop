package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class landingpage {
	
	 public WebDriver driver;
	 
	 public landingpage(WebDriver driver) {
		 
		 this.driver=driver;
		 
	 }
	
	By namefield = By.cssSelector("#name");
	By emailfield = By.cssSelector("#email");
	By submittbtn = By.cssSelector("#form-submit");
	
	public WebElement namefield() {
			return driver.findElement(namefield);
	}
	public WebElement emailfield() {
		return driver.findElement(emailfield);
	}
	public WebElement submittbtn() {
		return driver.findElement(submittbtn);
	}
	
	
	

}

