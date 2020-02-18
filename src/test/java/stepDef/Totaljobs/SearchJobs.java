package stepDef.Totaljobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchJobs {
	
	public RemoteWebDriver driver;
	
	
	@Given("^launch the chrome browser \"([^\"]*)\"$")
	public void launch_the_chrome_browser(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability("chrome", true);
				//capabilities.setBrowserName("chrome");
						
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	
	}

	@Then("^enter the jobtitle \"([^\"]*)\"$")
	public void enter_the_jobtitle(String title) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementByXPath("//button[@class='accept-button-new']").click();
		//driver.findElementByXPath("//*[text()='Register CV']").sendKeys(Keys.PAGE_DOWN);
	    driver.findElementByXPath("//input[@id='keywords']").sendKeys(title);
	}

	@Then("^enter the postcode \"([^\"]*)\"$")
	public void enter_the_postcode(String code) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		driver.findElementByXPath("//input[@id='location']").sendKeys(code);
	    
	}

	@Then("^enter the locationtype \"([^\"]*)\"$")
	public void enter_the_locationtype(String value) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 WebElement Loctype = driver.findElementByXPath("//select[@id='LocationType']");
	 Select dropdown = new Select(Loctype);
	 dropdown.selectByValue(value);
	 
	}

	@Then("^click on the search button$")
	public void click_on_the_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//input[@id='search-button']").click();
		driver.quit();
	    
	}

}
