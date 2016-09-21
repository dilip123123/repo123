package june_30;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class WebTable {
@Test
	public void test()
	{
	Logger log=Logger.getLogger("ranggaa");
	System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	log.info("setting drivepath");
	WebDriver driver=new ChromeDriver();
driver.get("http://content.icicidirect.com/");
driver.manage().window().maximize();
WebDriverWait wait=new WebDriverWait(driver, 100);
WebElement m=driver.findElement(By.xpath(".//*[@id='liMarket']/a"));
wait.until(ExpectedConditions.elementToBeClickable(m)).click();;
WebElement ms=driver.findElement(By.xpath(".//*[@id='LiMarketStats']/a"));
wait.until(ExpectedConditions.elementToBeClickable(ms)).click();
Sleeper.sleepTightInSeconds(3);
driver.findElement(By.xpath(".//*[@id='hrfDSP']")).click();

WebElement table=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gridSource")));
		//Get number of rows available in table
	List<WebElement> rows=table.findElements(By.tagName("tr"));
		//Iterate number of rows time
	for (WebElement eachrow : rows)
	{
		//Get columns available in each row
		List<WebElement> cols=eachrow.findElements(By.tagName("td"));
			//Iterate for number of columns
		for (WebElement eachcell : cols) 
		{
			if(eachcell.getText().isEmpty())
			{
	driver.findElement(By.xpath(".//*[@id='gridSource']/tfoot/tr/th[3]")).click();
			}
System.out.print("    "+eachcell.getText());
			Reporter.log(eachcell.getText());
			}
			System.out.println(" ");
System.out.println("=============================================================");
}
}
}
