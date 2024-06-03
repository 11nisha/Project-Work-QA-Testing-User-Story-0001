package testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Title {
	WebDriver driver;
	@Given("^Hit the application url$")
	public void hit_the_application_url() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\OneDrive\\Desktop\\Drivers\\New\\chromedriver.exe");

		// Creating WebDriver reference
		WebDriver driver = new ChromeDriver();

		// Launching 'test-nf' application
		driver.get("https://test-nf.com/english.html");

		// Maximizing Application
		driver.manage().window().maximize();
	}

	@Then("^user navigate on homepage$")
	public void user_navigate_on_homepage() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		//System.out.println("Title of the page is " + title);
		String ExpectedTitle = "english";
		Assert.assertEquals(ExpectedTitle, title);
	}

}
