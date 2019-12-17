package com.piit.session.Expedia_bootcamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight_tab {

WebDriver driver;

	@FindBy (id="tab-flight-tab-hp")
	WebElement Flights;
	
	@FindBy (xpath="//*[@class='btn btn-clear']")
	WebElement Flyingfrom;
	
	@FindBy (id="flight-destination-hp-flight")
	WebElement Flyingto;
	
	@FindBy (xpath="//*[@class='uitk-icon uitk-icon-calendar field-border-in-high-contrast-mode']")
	WebElement Departingdate;
	
	@FindBy (id="flight-departing-hp-flight")
	WebElement Departingdateselect;
	
	@FindBy (id="flight-returning-hp-flight")
	WebElement Returningdate;
	
	@FindBy (xpath="//*[@class='uitk-icon uitk-icon-calendar field-border-in-high-contrast-mode")
	WebElement Returningdateselect;
	
	@FindBy (xpath="//*[@class='btn-primary btn-action gcw-submit']")
	WebElement Search;

	public Flight_tab (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
public void fly() throws InterruptedException {
	Flights.click();
	Thread.sleep(5000);
	}

public void flyfrom(String frm) throws InterruptedException {
	Flyingfrom.sendKeys(frm);
	Thread.sleep(2000);
	}
public void flyto (String to) {
	Flyingto.clear();
	Flyingto.sendKeys(to);
	}

public void flydate() {
	Departingdate.click();
	}

public void flydateselect() {
	Departingdateselect.click();
	}

public void returndate() {
	Returningdate.click();
	}

public void returndateselect() {
	Returningdateselect.click();
	}
public void searchbutton() {
	Search.click();

}
}
