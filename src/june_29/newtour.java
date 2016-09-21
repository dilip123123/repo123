package june_29;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class newtour {
	public static WebDriver d;
	@Test
public void  Register() throws IOException{
		File file = new File("webregister.xlsx");
		FileInputStream ifile = new FileInputStream(file); 
	XSSFWorkbook wb = new XSSFWorkbook(ifile);
	XSSFSheet sheet = wb.getSheetAt(0);
System.out.println("the no of rows are : " + sheet.getLastRowNum());
		for (int i=1; i<=sheet.getLastRowNum(); i++){
	String firstname = sheet.getRow(i).getCell(0).getStringCellValue();
	String lastname = sheet.getRow(i).getCell(1).getStringCellValue();
	//String phone = sheet.getRow(i).getCell(2).getStringCellValue();
	String mailid = sheet.getRow(i).getCell(3).getStringCellValue();
	String address = sheet.getRow(i).getCell(4).getStringCellValue();
	String cty = sheet.getRow(i).getCell(5).getStringCellValue();
	//String postal = sheet.getRow(i).getCell(6).getStringCellValue();
	String uname = sheet.getRow(i).getCell(7).getStringCellValue();
	String pass = sheet.getRow(i).getCell(8).getStringCellValue();
	String cpass = sheet.getRow(i).getCell(9).getStringCellValue();
		//writing results in results column

		String str= "Register success";;
		if ("Register: Mercury Tours".equals(d.getTitle())){
			str = "Register success";
		d.findElement(By.linkText("REGISTER")).click();
				}
		else{str = "Register unsuccess";
			};
			d.navigate().to("http://newtours.demoaut.com");
			sheet.getRow(i).createCell(10).setCellValue(str);
				}
				
			ifile.close();
			FileOutputStream ofile = new FileOutputStream(file); 
			wb.write(ofile);
			ofile.close();
			wb.close();
		}
}	/*public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
			d =new ChromeDriver();
		newtour.Exceldata();
				}}*/
			
			