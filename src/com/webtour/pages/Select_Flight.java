package com.webtour.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Select_Flight {
@FindBy(name="reserveFlights")
WebElement btn;

@FindBy(name="passFirst0")
WebElement fname;
public void Select_Flight(){
	btn.click();
	if(fname.isDisplayed()){
		Reporter.log("fname is found",true);}
	else{
		Reporter.log("fname is not found",true);
	}
}

}
