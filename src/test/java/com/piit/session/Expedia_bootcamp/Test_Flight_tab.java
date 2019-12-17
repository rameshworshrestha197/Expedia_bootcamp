package com.piit.session.Expedia_bootcamp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Test_Flight_tab {
  WebDriver driver;
	@Test
  public void t() throws InterruptedException {
  Flight_tab ui=new Flight_tab(driver);
  
	ui.fly();
	ui.flydate();
	ui.flydateselect();
	ui.flyfrom("IAD");
	Thread.sleep(4000);
	ui.flyto("Kathmandu");
	ui.returndate();
	ui.returndateselect();
	
	
	}
  @BeforeClass
  public void beforeClass() throws InterruptedException {
  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\Automation_Amazon_code\\driver\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.navigate().to("https://www.expedia.com");
  Thread.sleep(5000);
  driver.manage().window().maximize();
  Thread.sleep(5000);
  }

  @AfterClass
  public void afterClass() {
	//driver.close();  
  }

}
