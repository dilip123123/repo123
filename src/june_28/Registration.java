package june_28;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;
public class Registration  {
	@Test
	public void regTest() throws WriteException, IOException, BiffException	{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//FileInputStream f=new FileInputStream("registrationinput.xls");
		File f=new File("e://registrationinput.xlsx");
		Workbook wb1=Workbook.getWorkbook(f);
		Sheet ws1=wb1.getSheet(0);
//WritableWorkbook wb2=Workbook.createWorkbook(new File("Result.xls"),wb1);
		WritableWorkbook wb2=Workbook.createWorkbook(f,wb1);
	WritableSheet ws2=wb2.getSheet(0);
		driver.findElement(By.linkText("REGISTER")).click();
		Sleeper.sleepTightInSeconds(3);
		for(int i=1;i<ws1.getRows();i++){
driver.findElement(By.name("firstName")).sendKeys(ws1.getCell(0,i).getContents());
driver.findElement(By.name("lastName")).sendKeys(ws1.getCell(1,i).getContents());
driver.findElement(By.name("phone")).sendKeys(ws1.getCell(2,i).getContents());
driver.findElement(By.name("userName")).sendKeys(ws1.getCell(3,i).getContents());
driver.findElement(By.name("address1")).sendKeys(ws1.getCell(4,i).getContents());
driver.findElement(By.name("city")).sendKeys(ws1.getCell(5,i).getContents());
driver.findElement(By.name("state")).sendKeys(ws1.getCell(6,i).getContents());
driver.findElement(By.name("postalCode")).sendKeys(ws1.getCell(7,i).getContents());
driver.findElement(By.name("country")).sendKeys(ws1.getCell(8,i).getContents());
driver.findElement(By.name("email")).sendKeys(ws1.getCell(9,i).getContents());
driver.findElement(By.name("password")).sendKeys(ws1.getCell(10,i).getContents());
driver.findElement(By.name("confirmPassword")).sendKeys(ws1.getCell(11,i).getContents());
		driver.findElement(By.name("register")).click();
		Sleeper.sleepTightInSeconds(2);	
String str=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
                                     
			if(str.contains(ws1.getCell(9,i).getContents()))
			{
				Label l=new Label(12,i,"register is success");
				ws2.addCell(l);
			}
			else
			{
				Label l=new Label(12,i,"register is unsuccess");
				ws2.addCell(l);
			}
			
			driver.navigate().back();
			Sleeper.sleepTight(2);
		}
		
		wb2.write();
		wb2.close();
		
		
	}

		
	}


