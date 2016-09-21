package june22_parameters;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class CaptureScreenShotUsingWebDriver {
public WebDriver driver;
	@Test
	public void test() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com");
		driver.manage().window().maximize();
			
			//TimeStamp in java
			DateFormat df=new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss");
			Date d=new Date();
			String currentdatandtime=df.format(d);
			//Take ScreenShot with 
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//into local system  copy converted file  
FileUtils.copyFile(src, new File("E:\\seleniumworkspace\\"+"screens\\homepage"+currentdatandtime+".png"));	
			
}
}


