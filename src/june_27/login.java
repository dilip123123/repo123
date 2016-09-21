package june_27;
import java.io.File;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
public class login {
	public WebDriver driver;
	public WebDriverBackedSelenium selenium;
	public String str;
@SuppressWarnings("deprecation")
@Test
  public void f() throws Exception{
//Reading the data from excel file	  
File fi=new File("e://Loginwebtourdata.xls");
		  Workbook w=Workbook.getWorkbook(fi);
		  Sheet s=w.getSheet(0);
// Creating Result file in Results columns
	  WritableWorkbook wwb=Workbook.createWorkbook(fi,w);
		WritableSheet sh=wwb.getSheet(0);
for (int i = 1; i < s.getRows(); i++) {
//Enter username, Password and click on signin by taking data from testdata file	
driver.findElement(By.name("userName")).sendKeys(s.getCell(0, i).getContents());
driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
driver.findElement(By.name("login")).click();
	Thread.sleep(1000);
//Validate signout, if available assign Pass to str, else assign Fail to str	
	if(selenium.isElementPresent("link=SIGN-OFF"))
	{
	driver.findElement(By.linkText("SIGN-OFF")).click();
	Thread.sleep(1000);
	driver.get("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	Reporter.log("both user and password are valid",true);
	str="Pass";
	}else{
		str="Fail";
		Reporter.log("both user and password are invalid",true);
			}
// Add the str value to Result file under result column	
	Label result=new Label(2, i, str);
	sh.addCell(result);
}//Add 3 labels in Result file
		  Label rs=new Label(2,0,"Result");
		   sh.addCell(rs);
	// Write and close result file	  
		  wwb.write();
		  wwb.close();
		 }
  @BeforeTest
  public void beforeTest() {
System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		driver=new ChromeDriver();
selenium=new WebDriverBackedSelenium(driver, "http://newtours.demoaut.com");
		driver.get("http://newtours.demoaut.com");
  }
  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }}
