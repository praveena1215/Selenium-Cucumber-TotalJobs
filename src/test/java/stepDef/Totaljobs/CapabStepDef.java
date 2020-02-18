package stepDef.Totaljobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CapabStepDef {

	public RemoteWebDriver driver;

	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("chrome", true);
		// capabilities.setBrowserName("chrome");

		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("disable-infobars");

	}

	@Then("^handle capabiliites \"([^\"]*)\"$")
	public void handle_capabiliites(String url) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	@Then("^click on RegisterCV button$")
	public void click_on_RegisterCV_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//span[text()='Register CV']").click();

	}

}
