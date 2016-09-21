package july_2;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class CrossBrowser 
{
	public WebDriver d;
  @Test
  @Parameters("browsername")
  public void login(String brname) throws IOException 
  {
	  switch (brname) 
	  
	  {
	case "firefox":
		d=new FirefoxDriver();
		break;
		
	case "ie":
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		d=new InternetExplorerDriver();
		break;
		
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		d=new ChromeDriver();
		break;

	case "opera":
		System.setProperty("webdriver.opera.driver", "D:\\operadriver.exe");
		d=new OperaDriver();
		break;
	default:
		System.out.println("no browser is matching");
		break;
	  }
	  	  
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
