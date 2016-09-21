package june22_parameters;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Hrm {
public WebDriver d;
public Properties p;
public FileInputStream i;
@BeforeMethod
public void launch() throws IOException{
	System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	d=new ChromeDriver();
	p=new Properties();
	i=new FileInputStream("Orangehrm.properties");
	p.load(i);
	d.navigate().to(p.getProperty("url"));
	d.manage().window().maximize();
d.findElement(By.cssSelector(p.getProperty("uid"))).sendKeys(p.getProperty("user"));
d.findElement(By.cssSelector(p.getProperty("pwd"))).sendKeys(p.getProperty("pass"));
	d.findElement(By.cssSelector(p.getProperty("loginbutton"))).click();
}
@Test
public void user_Creation(){
	d.findElement(By.cssSelector(p.getProperty("adm"))).click();
Sleeper.sleepTightInSeconds(3);
d.findElement(By.cssSelector(p.getProperty("btn"))).click();
d.findElement(By.cssSelector(p.getProperty("ename"))).sendKeys(p.getProperty("emname"));
d.findElement(By.cssSelector(p.getProperty("user1"))).sendKeys(p.getProperty("username"));
	d.findElement(By.cssSelector(p.getProperty("pass1"))).sendKeys(p.getProperty("password"));
	d.findElement(By.cssSelector(p.getProperty("cpwd"))).sendKeys(p.getProperty("cpassword"));
	d.findElement(By.cssSelector(p.getProperty("savebtn"))).click();
}
@AfterMethod
public void Logout(){
	d.close();
}
}
