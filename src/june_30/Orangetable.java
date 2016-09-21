package june_30;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Orangetable {

	public static void main(String[] args) {
		
		//creating logger class
				Logger log=Logger.getLogger("ranggaa");
			System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
			log.info("setting drivepath");
			WebDriver d=new ChromeDriver();
			log.info("chrome brower launch");
			d.navigate().to("http://opensource.demo.orangehrm.com");
			log.info("url opened in brower ");
			d.manage().window().maximize();
			d.findElement(By.id("txtUsername")).sendKeys("Admin");
			d.findElement(By.id("txtPassword")).sendKeys("admin");
			d.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
			Sleeper.sleepTightInSeconds(3);
			d.findElement(By.id("menu_admin_viewAdminModule")).click();
			Sleeper.sleepTightInSeconds(3);
			WebElement table=d.findElement(By.tagName("table"));
			List<WebElement>rows=table.findElements(By.tagName("tr"));
			System.out.println("rows are:::"+rows.size());
			for(int i=1;i<rows.size();i++){
				List<WebElement>col=rows.get(i).findElements(By.tagName("td"));
				if(i==1)
					System.out.println("columns are::"+col.size());
				for(int j=0;j<col.size();j++){
					String celldata=col.get(j).getText();
					System.out.print("  "+celldata);
				}
				System.out.println("   "+"    ");
			}
			
	}

}
