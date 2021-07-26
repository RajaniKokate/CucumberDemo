package StepDefination;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

//import io.cucumber.java.en.Given;

public class loginsteps {
	
	WebDriver driver;
	@Given("^I am on Login Page$")
	public void SignUppage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0017WP744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //i am trying to create a new instance of chrome driver
        driver = new ChromeDriver();
        
        driver.get("http://elearningm1.upskills.in/");
        driver.manage().window().maximize();
	System.out.println("I am on login page");
	}

	
	@And("^I completed registration$")
	public void clicksignuplink() {
		driver.findElement(By.linkText("Sign up!")).click();
		String text=driver.findElement(By.xpath("//*[@class='active']")).getText();
		driver.findElement(By.id("registration_firstname")).sendKeys("Rajani");
		driver.findElement(By.id("registration_lastname")).sendKeys("Kokate");
		driver.findElement(By.id("registration_email")).sendKeys("rajanikokate1996S@gmail.com");
		driver.findElement(By.id("username")).sendKeys("RajaniKokate");
		driver.findElement(By.id("pass1")).sendKeys("abc1234");
		driver.findElement(By.id("pass2")).sendKeys("abc1234");
		driver.findElement(By.id("registration_submit")).click();
				
	}
	
	@And("^I completed login$")
	public void login() {
		driver.findElement(By.id("login")).sendKeys("RajaniKokate");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.id("form-login_submitAuth")).click();

		
	}
	
	@And("^I click on profile button")
	public void profile() {
		driver.findElement(By.xpath("//*[@class='dropdown-toggle']")).click();
	}
	
	@And("^I click on inbox")
	public void inboxclick() {
		driver.findElement(By.linkText("Inbox")).click();
		
	}
	
	@And("^I click on compose$")
	public void compose() {
		driver.findElement(By.linkText("Compose")).click();
	}
	
	@And("^I Enter compose information$")
	public void Composemsg() {
		driver.findElement(By.xpath(".//*[@class='select2-search__field']")).sendKeys("navee",Keys.ENTER);
		driver.findElement(By.xpath(".//*[@class='select2-search__field']")).click();
		driver.findElement(By.id("compose_message_title")).sendKeys("For testing purpose");
		//driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p")).sendKeys("Hi I am Rajani Kokate");
		
		
	}
	
	
	
	

}












