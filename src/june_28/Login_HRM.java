package june_28;

import java.io.File;
import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login_HRM {
public WebDriver d;
public File f;

public Workbook wb;
public Sheet sh;
public WritableWorkbook wwb;
public WritableSheet wsh;
public String expval;
public String acval;
@Test
public void Orange_Login(){
	try{
	//reading file
	f=new File("e://loginhr.xls");
	wb=Workbook.getWorkbook(f);
	sh=wb.getSheet(0);
	//writing data into file
	wwb=Workbook.createWorkbook(f,wb);
	wsh=wwb.getSheet(0);
		//read data to login
	int rc=sh.getRows();
	for(int i=1;i<rc;i++){
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		 d =new ChromeDriver();
		d.navigate().to("http://opensource.demo.orangehrm.com");
		d.manage().window().maximize();
		String username=sh.getCell(0,i).getContents();
		String password=sh.getCell(1,i).getContents();
		d.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys(username);
		d.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys(password);
		d.findElement(By.xpath(".//*[@id='btnLogin']")).sendKeys(Keys.ENTER);
		expval="http://opensource.demo.orangehrm.com/index.php/dashboard";
		acval=d.getCurrentUrl();
		if(expval.equals(acval)){
			Label rs=new Label(2,i,"lOGIN IS SUCCESS");
			wsh.addCell(rs);}
		else{
			Label rs=new Label(2,i,"lOGIN IS UNSUCCESS");
			wsh.addCell(rs);}
		d.close();
		}
	wwb.write();
	wwb.close();
	}
	catch(Throwable t){
		System.out.println(t.getMessage());
		t.printStackTrace();
	}

}
}

