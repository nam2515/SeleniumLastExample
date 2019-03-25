package com.capgemini.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepProject {

	WebDriver driver;
@Given("^that I have gone to Project\\.html page$")
public void that_I_have_gone_to_Project_html_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("C:\\java\\LastSelenium\\WebContent\\Project.html");
}

@When("^I entered the Project Name \"(.*?)\"$")
public void i_entered_the_Project_Name(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("projectname")).sendKeys("Banking System");;
}

@When("^I selected the platform \"(.*?)\"$")
public void i_selected_the_platform(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement option1= driver.findElement(By.id("c1"));
	option1.click();
	if(option1.isSelected())
	{
		System.out.println("Checkbox1 is selected");
	}
}

@When("^I clicked on the registration button$")
public void i_clicked_on_the_registration_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("btnregister")).click();
}

@Then("^It will registered the Employee$")
public void it_will_registered_the_Employee() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement option1 =driver.findElement(By.id("btnregister"));
	if(option1.isSelected())
	{
		System.out.println("Registered");
	}
}
}
