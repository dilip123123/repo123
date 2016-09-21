package com.webtour.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Book_Flight {
@FindBy(name="passFirst0")
WebElement fname;

@FindBy(name="passLast0")
WebElement lname;

@FindBy(name="creditnumber")
WebElement cnumber;


public void Verify_Flight(String fname,String Lname,String cnumber){
	this.fname.sendKeys(fname);
	this.lname.sendKeys(Lname);
	this.cnumber.sendKeys(cnumber);
	
}
}
