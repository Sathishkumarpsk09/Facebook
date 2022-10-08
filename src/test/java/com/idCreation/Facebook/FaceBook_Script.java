package com.idCreation.Facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.XLSReader.XLSReader;
import com.baseclassFB.BaseclassFB;
import com.runner.RunnerFb;

public class FaceBook_Script extends BaseclassFB {
	public static WebDriver driver = null;

	public static void launchBrowser() {
		
		driver = browserLaunch("CHrome");
		
		launchURL("https://www.facebook.com/");
	}

	public static void login() throws IOException {
		WebElement text = driver.findElement(By.tagName("h2"));
		printText(text);
		
		
		WebElement email = driver.findElement(By.id("email"));
		String username = XLSReader.particularData("login", 2, 1);
		input(email, username);
		isEnabled(email);
		
//		email.sendKeys(username);
//		email.sendKeys("james@gamail.com");
//		String att = email.getAttribute(username);
//		System.out.println(att);
		
		
		WebElement password = driver.findElement(By.id("pass"));
		String passkey = XLSReader.particularData("login", 2, 2);
		input(password, passkey);
//		password.sendKeys(passkey);
//		password.sendKeys("12345678");
		
		WebElement login = driver.findElement(By.name("login"));
		clickOnElement(login);
//		login.click();
	}
	
	public static void createAccount() throws InterruptedException, IOException {
		

		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement newaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		clickOnElement(newaccount);
		
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		String name1 = XLSReader.particularData("createNewAccount", 1, 0);
		input(firstname, name1);
//		firstname.sendKeys("James");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		String name2 = XLSReader.particularData("createNewAccount", 1, 1);
		input(lastname, name2);
//		lastname.sendKeys("Huggins");
		
		WebElement mobileno = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		String phoneNumber = XLSReader.particularData("createNewAccount", 1, 2);
		input(mobileno, phoneNumber);
//		mobileno.sendKeys("12345678");
		
		WebElement newpassword = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		String passKey = XLSReader.particularData("createNewAccount", 1, 3);
		input(newpassword, passKey);
//		newpassword.sendKeys("Sallty9698");
		
		WebElement male = driver.findElement(By.xpath("(// input[@name='sex'])[1]"));
		clickOnElement(male);
//		male.click();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByValue("9");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(month);
		s1.selectByIndex(5);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1998");
		WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickOnElement(signup);
//		signup.click();

	}

	public static void TakeScreenshotsoferror() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Sathish Kumar\\eclipse-workspace\\Facebook\\Screenshot\\fb1.png");
		FileUtils.copyFile(source, destination);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		launchBrowser();
		login();
		Thread.sleep(3000);
		TakeScreenshotsoferror();
		createAccount();

	}

}
