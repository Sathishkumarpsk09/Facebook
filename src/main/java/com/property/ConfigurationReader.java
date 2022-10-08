package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
 private Properties p;
 
	public ConfigurationReader() throws IOException {

	File f = new File("C:\\Users\\Sathish Kumar\\eclipse-workspace\\Facebook\\src\\main\\java\\com\\property\\Facebook.properties");
	
	FileInputStream fi = new FileInputStream(f);
	
	 p = new Properties();
	
	p.load(fi);
	
	}
	
	public String getBrowser() {

		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		
		String url = p.getProperty("url");
		return url;
		
	}
	
	public String getUserName() {
		
		String username = p.getProperty("username");
		return username;
	}
	
	public String getPassword() {

		String password = p.getProperty("password");
		return password;
	}
	
	public String getfirstName() {
		
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	
	public String getlastName() {
		
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	
	public String getmobileno() {
		
		String mobilenumber = p.getProperty("mobilenumber");
		return mobilenumber;
	}
	
	public String getnewpass() {
		
		String newpass = p.getProperty("newpassword");
		return newpass;
	}
	
	
}
