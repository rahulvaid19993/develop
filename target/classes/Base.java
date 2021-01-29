package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {	
	private static Logger log = LogManager.getLogger(Base.class.getName());	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializedriver() throws IOException {	
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir"+"\\src\\main\\java\\resources\\data.properties"));
		prop.load(fis);
	
	
	
	String BrowserName = prop.getProperty("browser");
	
	if (BrowserName.equals("chrome")) {
		log.debug("Chrome browser displayed");
		log.info("Chrome browser displayed");
		log.error("Chrome browser displayed");
		log.fatal("Chrome browser displayed");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	else  {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\geckodriver.exe");
		driver = new FirefoxDriver();		
	}
	
	return driver;
	
}

}
