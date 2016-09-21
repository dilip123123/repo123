package june_28;
import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
public static void main(String[] args) throws InvalidFormatException, IOException {
	File f=new File("e://login.xlsx");
	System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet sh=wb.getSheetAt(0);
		int rc=sh.getLastRowNum();
	int i=1;
	while(i<rc){
		d.navigate().to("https://www.facebook.com/");
		d.manage().window().maximize();
		String uid=sh.getRow(i).getCell(0).getStringCellValue();
		String pwd=sh.getRow(i).getCell(1).getStringCellValue();
		d.findElement(By.cssSelector("#email")).sendKeys(uid);
		d.findElement(By.cssSelector("#pass")).sendKeys(pwd);
		d.findElement(By.cssSelector("#u_0_m")).sendKeys(Keys.ENTER);
		
		d.navigate().back();
		i++;
	}
wb.close();
	}

}
