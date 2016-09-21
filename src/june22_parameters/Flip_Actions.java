package june22_parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Flip_Actions {
@Test 
public void Mouse(){
	System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.navigate().to("http://flipkart.com");
	d.manage().window().maximize();
	Actions act=new Actions(d);
WebElement m=d.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[2]/a/span[1]"));
	act.moveToElement(m).perform();
WebDriverWait var=new WebDriverWait(d, 20);
var.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[6]/a/span")));
WebElement lb=d.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[6]/a/span"));
act.moveToElement(lb).click().perform();
	
}
}
