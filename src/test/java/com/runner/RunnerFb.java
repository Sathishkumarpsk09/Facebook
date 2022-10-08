package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclassFB.BaseclassFB;
import com.property.ConfigurationHelper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions( features = "src\\test\\java\\com\\feature\\Facebook.feature",
				  glue = "com.stepdefinition",
				  monochrome = true,
				  plugin = { "pretty",
							 "html:Report/htmlReport1.html",
							 "json:Report/JsonReport1.json",
							 "junit:Report/XmlReport1.xml"
							 })
public class RunnerFb {
	
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws IOException {
		
		String browser = ConfigurationHelper.getInstance().getBrowser();
		driver = BaseclassFB.browserLaunch(browser);
	
	}
	@AfterClass
	public static void tearDown() {
		driver.close();

	}

}
