package com.webtour.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Main_TestCases {
public WebDriver d;
@BeforeClass
public void Launch(){
	System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
	d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.navigate().to("http://newtours.demoaut.com/");
	d.manage().window().maximize();
}
@Test(groups="webapp",priority=0)
public void TC1_Login(){
	//accessing login class methods
	Verify_Login l=PageFactory.initElements(d, Verify_Login.class );
	l.Login("admin", "mercury");
}
@Test(dependsOnMethods="TC1_Login",priority=1)
public void TC2_FlightFinder(){

	Verify_FlightFinder us=PageFactory.initElements(d, Verify_FlightFinder.class);
	us.Find_Flight("1", "London", "July", "6", "Paris", "July", "10");
}

@Test(dependsOnMethods="TC2_FlightFinder",priority=2)
public void TC3_SelectFlight(){

	Select_Flight s=PageFactory.initElements(d, Select_Flight.class);
	s.Select_Flight();
}

@Test(dependsOnMethods="TC3_SelectFlight",priority=3)
public void TC4_BookFlight(){

	Book_Flight b=PageFactory.initElements(d, Book_Flight.class);
	b.Verify_Flight("subbarao", "laxmi", "3214578");
}
@AfterClass()
public void Logout(){
	d.findElement(By.linkText("SIGN-OFF")).click();
	d.quit();
}
}
