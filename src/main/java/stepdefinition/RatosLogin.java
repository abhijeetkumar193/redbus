package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class RatosLogin extends mainUtilities{
	

	@Given("^open the url$")
	public void open_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.ratosapp.com/#/login");
		driver.manage().window().maximize();
	
	    
	}

	@Then("^Enter (.*)  and (.*)$")
	public void enter_abhijeet_kumar_codenatives_com_and_Abhijeet(String email, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 driver.findElementByXPath("//*[@name='email']").sendKeys(email);
	 Thread.sleep(2000);
	 driver.findElementByXPath("//*[@id='password']").sendKeys(password);
	 Thread.sleep(3000);
	 
	}

	@Then("^Click on submit$")
	public jobs click_on_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElementByXPath("//*[@type='submit']").click();
	    Thread.sleep(10000);
	    return new jobs();
	}
	
	

}
