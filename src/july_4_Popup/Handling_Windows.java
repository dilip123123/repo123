package july_4_Popup;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class Handling_Windows {
@Test
public void Handling(){
	WebDriver d=new FirefoxDriver();
	d.get("http://project.qedgetech.com/xcart/");
	d.manage().window().maximize();
	String mainwindow=d.getWindowHandle();
	System.out.println("mainwindow id::"+mainwindow);
	d.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div[3]/div[2]/a")).click();
	Set<String>windows=d.getWindowHandles();
	System.out.println("window id is::"+windows);
	for(String eachwindow: windows){
	d.switchTo().window(eachwindow);
	Sleeper.sleepTightInSeconds(3);
	}
	d.findElement(By.xpath(".//*[@id='webform-component-name']/label")).sendKeys("subbarao3456");
	d.findElement(By.xpath(".//*[@id='webform-component-email']/label")).sendKeys("subbarao@gmail.com");
    d.findElement(By.xpath(".//*[@id='webform-component-reason']/label")).sendKeys(Keys.DOWN,"i",Keys.ARROW_DOWN,Keys.ENTER);
	Sleeper.sleepTightInSeconds(3);
	d.findElement(By.xpath(".//*[@id='edit-submitted-message']")).sendKeys("please get me two cups to ginger tea");
	d.findElement(By.xpath(".//*[@id='edit-submit']")).click();
	d.switchTo().window(mainwindow);
	d.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div[3]/div[2]/a")).click();
		
	
}
}