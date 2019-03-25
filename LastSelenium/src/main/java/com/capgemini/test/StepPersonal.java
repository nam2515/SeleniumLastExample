package com.capgemini.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepPersonal {

	WebDriver driver;
@Given("^that I have gone to Employee_Registration_form\\.jsp page$")
public void that_I_have_gone_to_Employee_Registration_form_jsp_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("C:\\java\\LastSelenium\\WebContent\\index.html");
}

@When("^I entered employee Num \"(.*?)\"$")
public void i_entered_employee_Num(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("empno")).sendKeys("50");
}

@When("^I entered employee Name \"(.*?)\"$")
public void i_entered_employee_Name(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.id("name")).sendKeys("Naman");
}

@When("^I selected the state \"(.*?)\"$")
public void i_selected_the_state(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("state")).sendKeys("Maharastra");
   
}

@When("^I selected the City \"(.*?)\"$")
public void i_selected_the_City(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.id("city")).sendKeys("Pune");
}

@When("^I click on the next link$")
public void i_click_on_the_next_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("btnsubmit")).click();
}

@Then("^It will redirect to the Project\\.html file and title is \"(.*?)\"$")
public void it_will_redirect_to_the_Project_html_file_and_title_is(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.navigate();
}

}
