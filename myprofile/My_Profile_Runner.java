package com.myprofile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class My_Profile_Runner extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);

	// public static void main(String[] args) throws InterruptedException {
	@Test(priority = 0)

	public void LoginPage() throws InterruptedException {

		// Launch Browser
		geturl("https://clientx.me/");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Existing Client
		Clickonelement(pom.getmyprof().getexistingclie());

		// Enter Email
		sendkeys(pom.getmyprof().getentermai(), "testpatient@tempr.email");

		// select enterAdmin@123
		Clickonelement(pom.getmyprof().getseleent());

		// Enter Email
		Thread.sleep(2000);
		sendkeys(pom.getmyprof().getentermai1(), "testpatient@tempr.email");

		// Enter pass
		Thread.sleep(3000);
		sendkeys(pom.getmyprof().getenterpass(), "Test@12345");

		// sele login
		Clickonelement(pom.getmyprof().getselelog());

	}

	@Test(priority = 1)

	public void Myprofile() throws InterruptedException {

		// sele my pro

		Thread.sleep(3000);
		Clickonelement(pom.getmyprof().getheadmy());

		// sele my prof
		Clickonelement(pom.getmyprof().getmyprosel());

		// sele fir name
		Thread.sleep(3000);
		clear(pom.getmyprof().getfirnam());

		sendkeys(pom.getmyprof().getfirnam(), "john");

		// sele midle nam
		Thread.sleep(3000);
		clear(pom.getmyprof().getmidnam());

		sendkeys(pom.getmyprof().getmidnam(), "tes");

		// sele midle nam
		Thread.sleep(3000);
		clear(pom.getmyprof().getlasnam());

		sendkeys(pom.getmyprof().getlasnam(), "pat");

		// sele suf
		Thread.sleep(3000);
		clear(pom.getmyprof().getsuf());

		sendkeys(pom.getmyprof().getsuf(), "A");

		// sele ss
		Thread.sleep(3000);
		clear(pom.getmyprof().getseless());

		sendkeys(pom.getmyprof().getseless(), "A");

		// sele phon
		Thread.sleep(3000);
		clear(pom.getmyprof().getselepho());

		sendkeys(pom.getmyprof().getselepho(), "8775785657");

		// sele plac

		Thread.sleep(2000);
		selectone(pom.getmyprof().getselepla(), "Mobile");

		// add Phone
		Thread.sleep(3000);
		Clickonelement(pom.getmyprof().getaddph());

		// sele plac

		selectone(pom.getmyprof().getselepla1(), "Home");

		// sele phon
		Thread.sleep(5000);
		clear(pom.getmyprof().getselepho1());

		sendkeys(pom.getmyprof().getselepho1(), "975765667");

		// Enter Email

		Thread.sleep(3000);
		clear(pom.getmyprof().getenmai());

		sendkeys(pom.getmyprof().getenmai(), "abc@tempr.email");

		selectone(pom.getmyprof().getselemail(), "Home");

		// Sele add mail

		Clickonelement(pom.getmyprof().getadenmai());

		// Enter Email 2

		Thread.sleep(3000);
		clear(pom.getmyprof().getenmai1());

		sendkeys(pom.getmyprof().getenmai1(), "abcd@tempr.email");

		selectone(pom.getmyprof().getselemail1(), "Home");

		// Address

		// Street

		// sele phon
		Thread.sleep(2000);
		clear(pom.getmyprof().getentadd());

		sendkeys(pom.getmyprof().getentadd(), "California");

		// City

		Thread.sleep(2000);
		clear(pom.getmyprof().getcityen());

		sendkeys(pom.getmyprof().getcityen(), "Los Angeles");

		// State

		Thread.sleep(2000);
		clear(pom.getmyprof().getstat());

		sendkeys(pom.getmyprof().getstat(), "Balor");

		// State

		Thread.sleep(2000);
		clear(pom.getmyprof().getzipc());

		sendkeys(pom.getmyprof().getzipc(), "3211");

		// About Patient

		// Date Of Bit
		sendkeys(pom.getmyprof().getdob(), "07/05/1990");

		// sex

		selectone(pom.getmyprof().getsexse(), "Male");

		// Mari Stat

		selectone(pom.getmyprof().getmarst(), "Single");

		// Language Sle

		selectone(pom.getmyprof().getlansel(), "Tamil");

		// select race

		selectone(pom.getmyprof().getselera(), "White");

		// Ethnicity

		selectone(pom.getmyprof().getethsel(), "Hispanic or Latino");

		// sele save

		try {
			Thread.sleep(3000);

			Clickonelement(pom.getmyprof().getselsa());
		} catch (Exception e) {
			System.out.println("Patient Details Under Review ");
		}

		System.out.println(" My Profile Tested Successfully ");
	}

	@Test(priority = 2)

	public void Message() throws InterruptedException {

		// Select Message

		Thread.sleep(3000);

		Clickonelement(pom.getmyprof().getmesssel());

		// ser provi

		sendkeys(pom.getmyprof().getsermes(), "Martin Edward");

		// sele patien

		Clickonelement(pom.getmyprof().getselpro());

		// Send Text

		Clickonelement(pom.getmyprof().getcliat());
		sendkeys(pom.getmyprof().gettypmsg(), "Hello");

		// sen msg
		Thread.sleep(3000);
		Clickonelement(pom.getmyprof().getsenmsg());
		
		System.out.println("Messenger Tested Successfully ");

	}
}
