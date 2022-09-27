package com.myprofile;

import org.openqa.selenium.WebDriver;



public class Pom_Class {
	public static WebDriver driver;

	private My_Profile mp;
	
	
	public Pom_Class(WebDriver driver2) {
		this.driver = driver2;

	}

	public My_Profile getmyprof() {

		if (mp == null) {

			mp = new My_Profile(driver);

		}
		return mp;

	}
	

}
