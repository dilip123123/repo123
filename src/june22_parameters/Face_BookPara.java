package june22_parameters;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;
public class Face_BookPara {
public WebDriver d;
public FileInputStream fi;
public Workbook wb;
public Sheet ws;
@Test
public void login() throws BiffException, IOException{
	System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	d=new ChromeDriver();
	fi=new FileInputStream("D:\\Selenium_Framework\\primus\\ORLogin.xls");
	wb=Workbook.getWorkbook(fi);
	ws=wb.getSheet(0);
	int rc=ws.getRows();
	System.out.println("rows are::"+rc);
	for(int i=1;i<rc;i++){
		String url=ws.getCell(0,i).getContents();
		d.navigate().to(url);
		d.manage().window().maximize();
	//reading username lacator column
	String username_lac=ws.getCell(1,i).getContents();
	//reading username testdata column
	String user_testdata=ws.getCell(2,i).getContents();
	//reading passlacator  column
	String pass_lac=ws.getCell(3,i).getContents();
	//reading pass testdata column
	String pass_testdata=ws.getCell(4,i).getContents();
	//passing testdata into username and passowd text boxes
	d.findElement(By.cssSelector(username_lac)).sendKeys(user_testdata);
	d.findElement(By.cssSelector(pass_lac)).sendKeys(pass_testdata);
	d.findElement(By.cssSelector(pass_lac)).submit();
	d.navigate().back();
	//Sleeper.sleepTightInSeconds(3);
}}}
