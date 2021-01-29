package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.landingpage;
import resources.Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)
public class stepdefinition extends Base{
	
	private static Logger log = LogManager.getLogger(Base.class.getName());

    @Given("^User is on landing page \"([^\"]*)\"$")
    public void user_is_on_landing_page_something(String strArg1) throws Throwable {
    	driver = initializedriver();	
	       driver.get(strArg1);
	       log.info("URL opened");
	       driver.manage().window().maximize();
	       log.info("Browser window maximized");
	       landingpage lp = new landingpage(driver);
	       lp.namefield().sendKeys("Rahul Vaid");
		   lp.emailfield().sendKeys("rahulvaid1993@gmail.com");
		   lp.submittbtn().click();  
	       
    }

    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        throw new PendingException();
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
        throw new PendingException();
    }

    @And("^cards are disaplayed$")
    public void cards_are_disaplayed() throws Throwable {
        throw new PendingException();
    }
    
    @Test(dataProvider="foo")
   	public void demo2(String a,String b) {
   		
   		System.out.println(a);
   		System.out.println(b);
   		log.debug("got both from dataprovider annotation");
   		log.debug("Chrome browser displayed");
   		log.info("Chrome browser displayed");
   		log.error("Chrome browser displayed");
   		log.fatal("Chrome browser displayed");
   	}
   	
   	@DataProvider(name ="foo")
   	public Object[][] getdata() {
   		
   		Object[][] data = new Object[2][2];
   		
   		data[0][0]="Rahul Vaid";
   		data[0][1]="rahulvaid1993@gmail.com";
   		
   		data[1][0]="1Rahul Vaid";
   		data[1][1]="1rahulvaid1993@gmail.com";
   		return data;   		
   	}

}