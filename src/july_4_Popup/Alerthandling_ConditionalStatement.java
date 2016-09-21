package july_4_Popup;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
public class Alerthandling_ConditionalStatement {
	public WebDriver driver;
	@Test
	public void test()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.air.irctc.co.in/IndianRailways/");
		driver.manage().window().maximize();
			
		//Click Search buttong WithoutEnter any data
		driver.findElement(By.xpath(".//*[@id='showdometic']/div[6]")).click();
//When alert present it accept condition, when alert was not present go to else condition
		if(isalertpresent())
		{
			Sleeper.sleepTightInSeconds(3);
			System.out.println("message::"+driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			}
		else
		{
			System.out.println("As user Expected alert is not present");
		}
			}
	
	//Method to verify alert presented or not presented
	public boolean isalertpresent()
	{
		try {
			driver.switchTo().alert();  //return true when alert was their
			return true;
		} catch (NoAlertPresentException e)
		{
			return false;   //Return false when alert was not present
		}
	}
	

}
