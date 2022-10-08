package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	

	public static WebDriver driver;
	
	@FindBy(name = "firstname")
	private WebElement firstname;
	
	

	
	@FindBy(name = "lastname")
	private WebElement lastname;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement mobileno;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement newpassword;
	
	@FindBy(xpath = "(//input[@name='sex'])[2]")
	private WebElement gender;
	
	@FindBy(id = "day")
	private WebElement day;
	
	@FindBy(id = "month")
	private WebElement month;
	
	@FindBy(id = "year")
	private WebElement year;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement signup;
	
	public SignUpPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getSignup() {
		return signup;
	}

	

}
