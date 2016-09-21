package com.webtour.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
public class Verify_Login {
@FindBy(name="userName")
WebElement username;
@FindBy(name="password")
WebElement password;
@FindBy(name="login")
WebElement loginbtn;
@FindBy(name="passCount")
WebElement passenger;

public void Login(String uid,String pwd){
	username.sendKeys(uid);
	password.sendKeys(pwd);
	loginbtn.click();
	if(passenger.isDisplayed()){
		Reporter.log("usaer login success",true);}
	else{
		Reporter.log("usaer login unsuccess",true);
	}}}
