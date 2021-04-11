package stepdefinition;



import cucumber.api.java.en.Then;

public class jobs extends mainUtilities{
	
	@Then("^Click on jobs in menu bar$")
	public void click_on_jobs_in_menu_bar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("(//*[text()='Recruiter Dashboard'])[1]").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@id='candidateupload']").sendKeys("hello world");
		Thread.sleep(10000);
		}
	

	@Then("^click on create job button$")
	public void click_on_create_job_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElementByXPath("//*[text()='Create Job']").click();
	    Thread.sleep(5000);
	}



}
