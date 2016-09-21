package june22_parameters;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
public class Actions_ScrollDownpage 
{
	@Test
	public void test() 
	{
			System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		//Enable UserInterface interactions on webdriver browser session
		Actions action=new Actions(driver);
		//Using Escape key close welcome Banner
		action.sendKeys(Keys.ESCAPE).perform();
		//Get Control on page to perform keyboard actions
		action.sendKeys(Keys.TAB).perform();
		Sleeper.sleepTightInSeconds(5);
			//ScrollDown page
		WebElement l=driver.findElement(By.xpath(".//*[@id='container']/div/div/div[1]/div[1]/div/a[6]"));
		action.moveToElement(l).contextClick().perform();
		}
}
