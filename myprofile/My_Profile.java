package com.myprofile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Profile {

	public WebDriver driver;

	public My_Profile(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;

	}

	@FindBy(xpath = "(//h5[normalize-space()='EXISTING CLIENT'])[1]")
	private WebElement existingclie;

	public WebElement getexistingclie() {
		return existingclie;

	}

	@FindBy(xpath = "(//input[@placeholder='Enter Email'])[1]")
	private WebElement entermai;

	public WebElement getentermai() {
		return entermai;

	}

	@FindBy(xpath = "(//input[@placeholder='Enter email'])[1]")
	private WebElement entermai1;

	public WebElement getentermai1() {
		return entermai1;

	}

	@FindBy(xpath = "(//button[normalize-space()='continue'])[1]")
	private WebElement seleent;

	public WebElement getseleent() {
		return seleent;

	}

	@FindBy(xpath = "(//input[@placeholder='Enter password'])[1]")
	private WebElement enterpass;

	public WebElement getenterpass() {
		return enterpass;

	}

	@FindBy(xpath = "(//button[normalize-space()='Log in'])[1]")
	private WebElement selelog;

	public WebElement getselelog() {
		return selelog;

	}

	@FindBy(xpath = "(//div[@class='sc-duzrYq dQQGfR'])[1]")
	private WebElement headmy;

	public WebElement getheadmy() {
		return headmy;

	}

	@FindBy(xpath = "//div[contains(text(),'My Profile')]")
	private WebElement myprosel;

	public WebElement getmyprosel() {
		return myprosel;

	}

	@FindBy(xpath = "(//input[@placeholder='Enter First Name'])[1]")
	private WebElement firnam;

	public WebElement getfirnam() {
		return firnam;

	}

	@FindBy(xpath = "(//input[@placeholder='Enter Middle Name'])[1]")
	private WebElement midnam;

	public WebElement getmidnam() {
		return midnam;

	}

	@FindBy(xpath = "(//input[@class='sc-cdZahM gfCMHd'])[3]")
	private WebElement lasnam;

	public WebElement getlasnam() {
		return lasnam;

	}

	@FindBy(xpath = "(//input[@class='sc-lGdcD dBeAbY'])[4]")
	private WebElement suf;

	public WebElement getsuf() {
		return suf;

	}

	@FindBy(xpath = "(//input)[5]")
	private WebElement seless;

	public WebElement getseless() {
		return seless;

	}

	@FindBy(xpath = "(//input[@name='phone'])[1]")
	private WebElement selepho;

	public WebElement getselepho() {
		return selepho;

	}

	@FindBy(xpath = "(//select[@class='sc-cdZahM kSHjqc'])[1]")
	private WebElement selepla;

	public WebElement getselepla() {
		return selepla;

	}

	@FindBy(xpath = "(//button[normalize-space()='Add Phone'])[1]")
	private WebElement addph;

	public WebElement getaddph() {
		return addph;

	}

	@FindBy(xpath = "(//input[@name='phone'])[2]")
	private WebElement selepho1;

	public WebElement getselepho1() {
		return selepho;

	}

	@FindBy(xpath = "(//select[@name='type'])[2]")
	private WebElement selepla1;

	public WebElement getselepla1() {
		return selepla1;

	}

	@FindBy(xpath = "(//button[normalize-space()='Add Email'])[1]")
	private WebElement adenmai;

	public WebElement getadenmai() {
		return adenmai;

	}

	@FindBy(xpath = "(//input[@id='email'])[1]")
	private WebElement enmai;

	public WebElement getenmai() {
		return enmai;

	}

	@FindBy(xpath = "(//select[@class='sc-cdZahM cFrEEz'])[1]")
	private WebElement selemail;

	public WebElement getselemail() {
		return selemail;

	}

	@FindBy(xpath = "(//input[@name='email'])[2]")
	private WebElement enmai1;

	public WebElement getenmai1() {
		return enmai1;

	}

	@FindBy(xpath = "(//select[@name='type'])[4]")
	private WebElement selemail1;

	public WebElement getselemail1() {
		return selemail1;

	}

	@FindBy(xpath = "(//input[@class='sc-lGdcD foAhJq'])[1]")
	private WebElement entadd;

	public WebElement getentadd() {
		return entadd;

	}

	@FindBy(xpath = "(//input[@class='sc-lGdcD euZBez'])[1]")
	private WebElement cityen;

	public WebElement getcityen() {
		return cityen;

	}

	@FindBy(xpath = "(//input[@class='sc-lGdcD gPdpdt'])[1]")
	private WebElement stat;

	public WebElement getstat() {
		return stat;

	}

	@FindBy(xpath = "(//input[@class='sc-lGdcD gPdpdt'])[2]")
	private WebElement zipc;

	public WebElement getzipc() {
		return zipc;

	}

	@FindBy(xpath = "(//input[@class='sc-lGdcD cqehxu'])[1]")
	private WebElement dob;

	public WebElement getdob() {
		return dob;

	}

	@FindBy(xpath = "(//select[@class='sc-cdZahM yxDcW'])[1]")
	private WebElement sexse;

	public WebElement getsexse() {
		return sexse;

	}

	@FindBy(xpath = "(//select[@class='sc-cdZahM yxDcW'])[2]")
	private WebElement marst;

	public WebElement getmarst() {
		return marst;

	}

	@FindBy(xpath = "(//select[@class='sc-cdZahM kPbElY'])[1]")
	private WebElement lansel;

	public WebElement getlansel() {
		return lansel;

	}

	@FindBy(xpath = "(//select[@class='sc-cdZahM kPbElY'])[2]")
	private WebElement selera;

	public WebElement getselera() {
		return selera;

	}

	@FindBy(xpath = "(//select[@class='sc-cdZahM kPbElY'])[3]")
	private WebElement ethsel;

	public WebElement getethsel() {
		return ethsel;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement selsa;

	public WebElement getselsa() {
		return selsa;

	}
	
	@FindBy(xpath = "(//img[@class='sc-hKMtZM hrjMPk'])[1]")
	private WebElement messsel;

	public WebElement getmesssel() {
		return messsel;

	}
	
	@FindBy(xpath = "(//input[@placeholder='Search Provider'])[1]")
	private WebElement sermes;

	public WebElement getsermes() {
		return sermes;

	}
	
	@FindBy(xpath = "(//p[@class='sc-gKXOVf jWToNe'])[1]")
	private WebElement selpro;

	public WebElement getselpro() {
		return selpro;

	}
	
	@FindBy(xpath = "(//input[@placeholder='Type your message here…'])[1]")
	private WebElement typmsg;

	public WebElement gettypmsg() {
		return typmsg;

	}
	
	@FindBy(xpath = "(//*[name()='svg'][@class='sc-caiQmJ fZDRAg'])[1]")
	private WebElement cliat;

	public WebElement getcliat() {
		return cliat;

	}
	
	@FindBy(xpath = "(//img[@class='sc-gSpBRe czlWeP'])[1]")
	private WebElement senmsg;

	public WebElement getsenmsg() {
		return senmsg;

	}
}
