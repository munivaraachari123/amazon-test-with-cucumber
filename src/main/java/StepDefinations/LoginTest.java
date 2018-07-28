package StepDefinations;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {

	WebDriver driver = null;
	
	@Given("^user to navigate application by url$")
	public void user_on_navigate_application_by_url() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Munivara Achari\\Documents\\SELENIUM\\chromedriver_2.35.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	}

	@When("^title of the application is amazon$")
	public void title_of_the_application_is_amazon() {
	    String title = driver.getTitle();
	    Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", title);
	}
	
	@Then("^user on login page$")
	public void user_on_login_page() {
		Actions action = new Actions(driver);
		WebElement signIn = driver.findElement(By.xpath("//span[contains(text(), \"Hello. Sign in\")]"));
		action.moveToElement(signIn).build().perform();
		driver.findElement(By.xpath("(//span[@class='nav-action-inner' and text() = 'Sign in'])[1]")).click();
		String loginTitle = driver.findElement(By.className("a-spacing-small")).getText();
		Assert.assertEquals("Login", loginTitle);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
	    driver.findElement(By.name("email")).sendKeys("munivaraachari@gmail.com");
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.name("password")).sendKeys("1234aksjdl");
	}

	@Then("^user clicks on login button to login$")
	public void user_clicks_on_login_button_to_login() {
	    driver.findElement(By.id("signInSubmit")).click();
	}

	@Then("^user should not login$")
	public void user_should_not_login() {
	    String name = driver.findElement(By.className("a-list-item")).getText();
	    Assert.assertEquals("Your password is incorrect",  name);
	}

	@Then("^close the browser$")
	public void close_the_browser() {
	   driver.close();
	}
}
