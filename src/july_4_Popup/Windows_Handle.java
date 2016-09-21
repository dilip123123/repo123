package july_4_Popup;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Windows_Handle {
public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.navigate().to("https://www.facebook.com");
	d.manage().window().maximize();
	String mainwindow=d.getWindowHandle();
	System.out.println("unique id for mainwindow:::"+mainwindow);
	d.findElement(By.xpath(".//*[@id='u_0_i']/p/a[1]")).click();
Set<String>windows=d.getWindowHandles();

for(String eachwindow:windows){
	System.out.println("window id is:::"+windows);
	d.switchTo().window(eachwindow);
	System.out.println("subwindow title is::"+d.getTitle());	
	}
d.findElement(By.xpath(".//*[@id='email']")).sendKeys("testing@gmail.com");
d.findElement(By.xpath(".//*[@id='pass']")).sendKeys("test12345");
d.findElement(By.xpath(".//*[@id='u_0_0']")).sendKeys(Keys.ENTER);
d.switchTo().window(mainwindow);
System.out.println("title is::"+d.getTitle());
d.findElement(By.xpath(".//*[@id='email']")).sendKeys("testing@gmail.com");
d.findElement(By.xpath(".//*[@id='pass']")).sendKeys("test12345");
d.findElement(By.xpath(".//*[@id='u_0_0']")).sendKeys(Keys.ENTER);
String text=d.findElement(By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div/div[2]/a")).getText();
System.out.println("message is::"+text);
	}

}
