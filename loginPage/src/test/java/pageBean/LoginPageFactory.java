package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;


public class LoginPageFactory {
WebDriver driver;
	
	//step 1 : identify elements
	@FindBy(name="userName")
	@CacheLookup
	WebElement pfname;

	//using how class
	@FindBy(xpath=".//*[@id='mainCnt']/div/div[1]/form/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement pfbutton;

	@FindBy(name="userPwd")
	@CacheLookup
	WebElement pfpwd;
	
	
	//step 2 : Setters
	public void setPfname(String sname) {
		pfname.sendKeys(sname);
	}

	public void setPfbutton() {
		pfbutton.click();
	}

	public void setPfpwd(String spwd) {
		pfpwd.sendKeys(spwd);
	}

	//getters
	public WebElement getPfname() {
		return pfname;
	}

	public WebElement getPfbutton() {
		return pfbutton;
	}

	public WebElement getPfpwd() {
		return pfpwd;
	}

	
	//initiating Elements
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}


