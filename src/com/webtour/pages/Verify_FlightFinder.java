package com.webtour.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Verify_FlightFinder {
@FindBy(name="tripType")
WebElement oneway;
@FindBy(name="passCount")
WebElement  passenger;

@FindBy(name="fromPort")
WebElement  depart;

@FindBy(name="fromMonth")
WebElement  dmonth;

@FindBy(name="fromDay")
WebElement  dday;

@FindBy(name="toPort")
WebElement  arrive;

@FindBy(name="toMonth")
WebElement  amonth;

@FindBy(name="toDay")
WebElement  aday;

@FindBy(name="findFlights")
WebElement  continuebtn;

@FindBy(name="reserveFlights")
WebElement  btnreserve;
public void Find_Flight(String pass,String depart,String dmonth,String dday,
		String arrive,String amonth,String aday){
	oneway.click();
	passenger.sendKeys(pass);
	this.depart.sendKeys(depart);
	this.dmonth.sendKeys(dmonth);
	this.dday.sendKeys(dday);
	this.arrive.sendKeys(arrive);
	this.amonth.sendKeys(amonth);
	this.aday.sendKeys(aday);
	this.continuebtn.click();
	
	if(btnreserve.isEnabled()){
		Reporter.log("flight details selected");}
	else{
		Reporter.log("flight details not selected");
	}
	
	
}


}
