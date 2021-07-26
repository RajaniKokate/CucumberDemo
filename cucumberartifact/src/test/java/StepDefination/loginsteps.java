package StepDefination;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

//import io.cucumber.java.en.Given;

public class loginsteps {
	
	WebDriver driver;
	@Given("^I am on Login page$")
	public void loginpage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0017WP744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //i am trying to create a new instance of chrome driver
        driver = new ChromeDriver();
        //WedDriver driver - new ChromeDriver()
        //ChromeDriver driver = new ChromeDriver()
        //i want to be the login page //what should i do
        driver.get("https://opensource-demo.orangehrmlive.com/");
	System.out.println("I am on login page");
	}

}
