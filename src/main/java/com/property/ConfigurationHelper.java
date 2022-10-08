package com.property;

import java.io.IOException;

import com.pom.LoginPage;

public class ConfigurationHelper {
	
	public static ConfigurationReader getInstance() throws IOException {
		
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
		
	}
	
	public ConfigurationHelper() {
	
	}

	

}
