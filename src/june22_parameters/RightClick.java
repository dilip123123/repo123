package june22_parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
	@Test
	public void Gmail_Rightclick(){
	System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://google.com");
	driver.manage().window().maximize();
	//Enable UserInterface interactions on webdriver browser session
	Actions action=new Actions(driver);
	WebElement g=driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a"));
	action.moveToElement(g).contextClick().perform();

}
}