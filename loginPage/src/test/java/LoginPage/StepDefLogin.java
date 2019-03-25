package LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.LoginPageFactory;


public class StepDefLogin {
		
		private WebDriver driver;
	
		private LoginPageFactory lpf;
		@Given("^User is on hotel booking application page$")
		public void user_is_on_hotel_booking_application_page() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "D:\\BDD\\chromedriver_win32\\ChromeDriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			lpf= new LoginPageFactory(driver);
			driver.get("file:///D:/BDD/login.html");
		}
		
		@Then("^check the title of the page$")
		public void check_the_title_of_the_page() throws Throwable {
			String title=driver.getTitle();
			if(title.contentEquals("")) System.out.println("****** Title Matched");
			else System.out.println("****** Title NOT Matched");
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			driver.close();
		}
		
		@When("^user enters all valid data$")
		public void user_enters_all_valid_data() throws Throwable {
		   lpf.setPfname("capgemini"); Thread.sleep(1000);
		   lpf.setPfpwd("capg1234"); Thread.sleep(1000);
		   lpf.setPfbutton();
		}
		
		@Then("^navigate to welcome page$")
		public void navigate_to_welcome_page() throws Throwable {
			driver.navigate().to("file:///D:/BDD/hotelbooking.html");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(500);
			driver.close();
		}
		
		@When("^user leaves UserName blank$")
		public void user_leaves_UserName_blank() throws Throwable {
		    lpf.setPfname(""); Thread.sleep(1000);
		    lpf.setPfpwd("capg1234"); Thread.sleep(1000);
		}
		
		@When("^clicks the button$")
		public void clicks_the_button() throws Throwable {
		    lpf.setPfbutton();
		}
		
		@Then("^display ualert msg$")
		public void display_ualert_msg() throws Throwable {
			String alertMessage = driver.findElement(By.id("userErrMsg")).getText();
			Thread.sleep(1000);
			
		    System.out.println("******" + alertMessage);
		    driver.close();
		}
		
		@When("^user leaves password blank and clicks the button$")
		public void user_leaves_password_blank_and_clicks_the_button() throws Throwable {
		    lpf.setPfname("capgemini"); Thread.sleep(1000);
			lpf.setPfpwd(""); Thread.sleep(1000);
			lpf.setPfbutton();
			
}
		@Then("^display palert msg$")
		public void display_palert_msg() throws Throwable {
			String alertMessage1 = driver.findElement(By.id("pwdErrMsg")).getText();
			Thread.sleep(1000);
		    System.out.println("******" + alertMessage1);
		    driver.close();
		}
		@When("^user enters credentials$")
		public void user_enters_credentials() throws Throwable {
			lpf.setPfname("capgemin"); Thread.sleep(1000);
			   lpf.setPfpwd("capg123"); Thread.sleep(1000);
			   lpf.setPfbutton();
		}

		@Then("^display alert msg$")
		public void display_alert_msg() throws Throwable {
			String alertMessage = driver.switchTo().alert().getText();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
		    System.out.println("******" + alertMessage);
		    driver.close();
		}
}
