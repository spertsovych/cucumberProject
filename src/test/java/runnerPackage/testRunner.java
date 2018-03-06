package runnerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(features={"features"},glue = {"stepDefinition"})
public class testRunner extends AbstractTestNGCucumberTests{

	public static WebDriver driver;
	@BeforeTest
	public void setUp(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	
	
}
