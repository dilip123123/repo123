package june22_parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Face_Book {
public WebDriver d;
@BeforeTest
public void launch(){
	System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	d=new ChromeDriver();
	}
@Parameters({"url","fname","sname","mmail","rmail","pwd","bday","bmonth","byear"})
@Test
public void Account(String url,String namef,String names,String mailn,String mailr,
	String pass,String bday,String bmonth,String byear){
	d.navigate().to(url);
	d.manage().window().maximize();
	d.findElement(By.cssSelector("#u_0_1")).sendKeys(namef);
	d.findElement(By.cssSelector("#u_0_3")).sendKeys(names);
	d.findElement(By.cssSelector("#u_0_6")).sendKeys(mailn);
	d.findElement(By.cssSelector("#u_0_9")).sendKeys(mailr);
	d.findElement(By.cssSelector("#u_0_b")).sendKeys(pass);
	new Select(d.findElement(By.cssSelector("#day"))).selectByVisibleText(bday);
	new Select(d.findElement(By.cssSelector("#month"))).selectByVisibleText(bmonth);
	new Select(d.findElement(By.cssSelector("#year"))).selectByVisibleText(byear);
	WebElement rdn=d.findElement(By.cssSelector("#u_0_f"));
	if(!rdn.isSelected())
		rdn.click();
	d.findElement(By.linkText("Terms")).click();
	d.findElement(By.cssSelector("#u_0_j")).click();
	}}

