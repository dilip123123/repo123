package june22_parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;
public class Hrm_USer {
public WebDriver d;
@Test
public void Login(){
	System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	d=new ChromeDriver();
	Actions act=new Actions(d);
	d.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	d.manage().window().maximize();
d.findElement(By.id("txtUsername")).sendKeys(Keys.DOWN,"Ad",Keys.UP,Keys.DOWN,"min",Keys.UP);
d.findElement(By.id("txtPassword")).sendKeys(Keys.DOWN,"ad",Keys.UP,Keys.DOWN,"min",Keys.UP);
	WebElement l=d.findElement(By.id("btnLogin"));
	act.moveToElement(l).click().perform();
	Sleeper.sleepTightInSeconds(3);
	WebElement ad=d.findElement(By.id("menu_admin_viewAdminModule"));
	act.moveToElement(ad).click().build().perform();
	Sleeper.sleepTightInSeconds(3);
	WebElement um=d.findElement(By.id("menu_admin_UserManagement"));
	act.moveToElement(um).click().perform();
	Sleeper.sleepTightInSeconds(3);
	WebElement u=d.findElement(By.id("menu_admin_viewSystemUsers"));
	act.moveToElement(u).click().perform();
	Sleeper.sleepTightInSeconds(3);
	d.findElement(By.id("btnAdd")).sendKeys(Keys.ENTER);
	d.findElement(By.id("systemUser_userType")).sendKeys(Keys.DOWN,"E",Keys.ARROW_DOWN,Keys.ENTER);
	d.findElement(By.id("systemUser_employeeName_empName")).sendKeys(Keys.DOWN,"t",Keys.ARROW_DOWN,Keys.ENTER);
	d.findElement(By.id("systemUser_userName")).sendKeys(Keys.DOWN,"atulsingh",Keys.UP);
	d.findElement(By.id("systemUser_password")).sendKeys(Keys.DOWN,"testing65",Keys.UP);
	d.findElement(By.id("systemUser_confirmPassword")).sendKeys(Keys.DOWN,"testing65",Keys.UP);
	WebElement s=d.findElement(By.id("btnSave"));
	act.moveToElement(s).click().perform();
	WebElement wa=d.findElement(By.xpath(".//*[@id='welcome']"));
	act.moveToElement(wa).click().perform();
	Sleeper.sleepTightInSeconds(3);
	WebElement lo=d.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[3]/a"));
	act.moveToElement(lo).click().perform();
	
	
	}
}
