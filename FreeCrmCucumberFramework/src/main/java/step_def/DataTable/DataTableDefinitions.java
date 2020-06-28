package step_def.DataTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DataTableDefinitions {
	
	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
	    
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable data) throws Throwable {
	    
		List<List<String>> value =data.raw(); // data.raw returns List<List<String>> values
		driver.findElement(By.name("email")).sendKeys(value.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(value.get(0).get(1));
	}

	@Then("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable {
	    
		WebElement lgnBtn = driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]"));
		lgnBtn.click();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    
		String homepageTitle=driver.getTitle();
		System.out.println(homepageTitle);
		Assert.assertEquals("Cogmento CRM", homepageTitle);
	}

	@Then("^Click on contacts$")
	public void click_on_contacts() throws Throwable {
	   
		WebElement contactsLink = driver.findElement(By.xpath("//a[@href='/contacts']"));
		contactsLink.click();
	}

	@Then("^Add new contacts details$")
	public void add_new_contacts_details(DataTable data) throws Throwable {
	    
		List<List<String>> value =data.raw();
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.name("first_name")).sendKeys(value.get(0).get(0));
		driver.findElement(By.name("last_name")).sendKeys(value.get(0).get(1));
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(value.get(0).get(2));
		WebElement saveBtn=driver.findElement(By.xpath("//button[@class = 'ui linkedin button']"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", saveBtn);
		
		Thread.sleep(3000);
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    
		driver.quit();
	}

}
