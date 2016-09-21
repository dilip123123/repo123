package july_2;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Autoit_Scripts {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://opensource.demo.orangehrm.com");
		d.manage().window().maximize();
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		d.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
		Sleeper.sleepTightInSeconds(3);
		d.findElement(By.id("menu_pim_viewPimModule")).click();
		d.findElement(By.id("btnAdd")).click();
		Sleeper.sleepTightInSeconds(3);
		d.findElement(By.id("firstName")).sendKeys("admin234");
		d.findElement(By.id("lastName")).sendKeys("admin6567");
		d.findElement(By.id("photofile")).click();
java.lang.Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\enameadd.exe");
		d.findElement(By.id("btnSave")).click();
			}

}
