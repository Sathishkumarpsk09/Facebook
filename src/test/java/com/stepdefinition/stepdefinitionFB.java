package com.stepdefinition;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.XLSReader.XLSReader;
import com.baseclassFB.BaseclassFB;
import com.pom.LoginPage;
import com.pom.SignUpPage;
import com.pom.SingleTonDesignPattern;
import com.property.ConfigurationHelper;
import com.runner.RunnerFb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinitionFB extends BaseclassFB {
	public WebDriver driver = RunnerFb.driver;
	
	 
	 SingleTonDesignPattern std = new SingleTonDesignPattern(driver);
	 
	@Given("user launch the facebook website")
	public void user_launch_the_facebook_website() throws IOException {
		
		String url = ConfigurationHelper.getInstance().getUrl();
		launchURL(url);

	}

	@When("user gets text information")
	public void user_gets_text_information() {
		printText(std.getLoginPage().getText());
		
	}

	@When("user Enter UserNAme")
	public void user_Enter_UserNAme() throws IOException {
		WebElement user = std.getLoginPage().getUsername();
		String userName = ConfigurationHelper.getInstance().getUserName();
		input(user, userName);
		isEnabled(user);

	}

	@When("user Enter Password")
	public void user_Enter_Password() throws IOException {
		ConfigurationHelper.getInstance().getPassword();
		input(std.getLoginPage().getPassword(), ConfigurationHelper.getInstance().getPassword());
	}

	@When("user Click Login")
	public void user_Click_Login() {
		
		clickOnElement(std.getLoginPage().getLoginbtn());

		
	}

	@Then("user Returns To Login Page")
	public void user_Returns_To_Login_Page() throws InterruptedException  {
		
		sleep();
		navigateBack();

		clickOnElement(std.getLoginPage().getcreatenewacc());
		sleep();
		
	}

	@When("user Create Account")
	public void user_Create_Account() throws InterruptedException, IOException {
		
		
		
		explicitlyWait(std.getSignUpPage().getFirstname(), "visible");		
		
		
		input(std.getSignUpPage().getFirstname(), ConfigurationHelper.getInstance().getfirstName());

		input(std.getSignUpPage().getLastname(), ConfigurationHelper.getInstance().getlastName());

		input(std.getSignUpPage().getMobileno(), ConfigurationHelper.getInstance().getmobileno());

		input(std.getSignUpPage().getNewpassword(),ConfigurationHelper.getInstance().getnewpass());

		clickOnElement(std.getSignUpPage().getGender());

		
		Select s = new Select(std.getSignUpPage().getDay());
		s.selectByValue("9");
		
		Selectoption(std.getSignUpPage().getDay(), "value", "9");

		
		Selectoption(std.getSignUpPage().getMonth(), "Index", "5");

		
		Selectoption(std.getSignUpPage().getYear(), "text", "1998");

		clickOnElement(std.getSignUpPage().getSignup());

	}

	@When("user TakesScreenshot")
	public void user_TakesScreenshot() throws IOException {
		
		takesScreenShot();
		
	}

}
