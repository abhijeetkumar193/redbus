package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homescreen {
	ChromeDriver driver;
	
	@Given("^enter the url for the zoomcar$")
	public void enter_the_url_for_the_zoomcar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("line 1");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/bangalore/");
		driver.manage().window().maximize();
	    
	}

	@When("^click on the search box displaying$")
	public void click_on_the_search_box_displaying() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("line 2");
		driver.findElementByXPath("//*[@class='search']").click();
	    
	}

	@Then("^select the starting point$")
	public void select_the_starting_point() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("line 3");
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@class='items'][2]").click();
	    
	}

	@Then("^click on next button$")
	public void click_on_next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("line 4");
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@class='proceed']").click();
	    
	}

	@Then("^select the date car is needed$")
	public void select_the_date_car_is_needed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("line 5");
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@class='days']//div[4]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@class='proceed']").click();
	    
	}

	@Then("^select date to return car$")
	public void select_date_to_return_car() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("line 6");
		Thread.sleep(5000);
		WebElement ele = driver.findElementByXPath("//*[@class='day low-price'][2]");
		Actions action= new Actions(driver);
		action.moveToElement(ele).click().perform();
		
		System.out.println("line 666");
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@class='proceed' and text()='Done']").click();
		
		System.out.println("line 6666");
	}

	@Then("^Click on done$")
	public void click_on_done() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("line 7");
		Thread.sleep(3000);
		
	    
	}

	@Then("^click on Book car button$")
	public void click_on_Book_car_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("line 8");
		Thread.sleep(3000);
		driver.findElementByXPath("(//*[@class='book-car' and text()='BOOK NOW'])[1]").click();
	}

	@Then("^Enter your (\\d+)$")
	public void enter_your(String mobile) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("line 9");
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@placeholder='Enter your E-mail or Mobile number']").sendKeys(mobile);
		Thread.sleep(1000);
	    driver.findElementByXPath("//*[@class='zc-auth-next-icon']").click();
	}

	@Then("^enter your Abijeet, abhijeetkumar(\\d+)@gmail\\.com, Abijeet@(\\d+)$")
	public void enter_your_Abijeet_abhijeetkumar_gmail_com_Abijeet(String email, String name,String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("line 10");
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@placeholder='Email Address']").sendKeys(email);
		driver.findElementByXPath("//*[@placeholder='Name as on Driving License']").sendKeys(name);
		driver.findElementByXPath("//*[@placeholder='Password (minimum 8 characters)']").sendKeys(password);
	}

	@Then("^Click on signup button$")
	public void click_on_signup_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("line 11");
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@name='signup']").click();
		Thread.sleep(10000);
		driver.close();
	    
	}

}
