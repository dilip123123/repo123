package june22_parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class DragAndDrop_Actions {
	@Test
	public void test() 
	{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		//Enable UserInterface interactions on webdriver browser session
		Actions action=new Actions(driver);
		
		
		//Swith to frame
		driver.switchTo().frame(0);
		
		//Target source object
		WebElement Src=driver.findElement(By.id("draggable"));
		
		
		//Targvet destination object
		WebElement dst=driver.findElement(By.id("droppable"));
		
		//Send Object to destination
		action.clickAndHold(Src).moveToElement(dst).release(Src).perform();
		
		//Assume that Object dropped at right location
		if(dst.getText().matches("Dropped!"))
		{
			System.out.println("object Dropped at right location");
		}
		
		
		//2nd method
		//action.dragAndDrop(Src,dst).perform();
		
		
	}

}
