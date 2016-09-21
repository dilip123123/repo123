package july_4_Popup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
public class Handling_Popup {
	public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.navigate().to("https://mail.rediff.com");
	d.manage().window().maximize();
	//to click on sign in link
	d.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
	Sleeper.sleepTightInSeconds(3);
	// to click on go button without giving username and password
	d.findElement(By.name("proceed")).click();
	//creating alert class
	Alert a=d.switchTo().alert();
	//to get popup message
	String text=a.getText();
	System.out.println("message is::"+text);
	Sleeper.sleepTightInSeconds(3);
	//to conform the popup
	a.accept();
	d.quit();

	}

}
