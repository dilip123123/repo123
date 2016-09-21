package june_30;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample_Table {
public static void main(String[] args) {
	//creating logger class
		Logger log=Logger.getLogger("ranggaa");
	System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	log.info("setting drivepath");
	WebDriver d=new ChromeDriver();
	log.info("chrome brower launch");
	d.navigate().to("file:///E:/qedge.html");
	log.info("url opened in brower ");
	d.manage().window().maximize();
	WebElement str=d.findElement(By.xpath("html/body/table/tbody/tr[4]/td[2]"));
	System.out.println(str.getText());
	//storing table
		WebElement tbody=d.findElement(By.tagName("table"));
		log.info("storing table");
		//counting no of rows
	List<WebElement>rows=tbody.findElements(By.tagName("tr"));
	System.out.println("no of rows are:::"+rows.size());
	log.info("printing no of rows");
	//iterate rows in a table
	for(int i=1;i<rows.size();i++){
		//counting no of columns
		List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
		if(i==1)
			System.out.println("no of cols are::"+cols.size());
		log.info("printing no of columns");
		//iterate columns 
		for(int j=0;j<cols.size();j++){
			//fetching data from columns
			String tabletext=cols.get(j).getText();
			System.out.print("   "+tabletext);
		}
		System.out.println("   ");
	}
	}

}
