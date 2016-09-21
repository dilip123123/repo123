package june22_parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
public class KeyStrokes {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.google.co.in/");
		d.manage().window().maximize();
//d.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN,"seleniun openings",Keys.UP);
d.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN,"seleniun",Keys.UP,Keys.TAB,Keys.DOWN,"openeings");
		Sleeper.sleepTightInSeconds(3);
		d.findElement(By.name("btnG")).sendKeys(Keys.ENTER);
			}

}
