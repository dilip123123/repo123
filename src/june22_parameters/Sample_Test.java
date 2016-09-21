package june22_parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Sample_Test {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		WebDriver d=new ChromeDriver();	
		d.get("http://gmail.com");
		d.manage().window().maximize();
		d.findElement(By.id("Email")).sendKeys("pranga82");
		d.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(3);
		d.findElement(By.id("Passwd")).sendKeys("test12345");
		d.findElement(By.id("signIn")).click();
	}

}
