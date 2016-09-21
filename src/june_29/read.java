package june_29;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class read {
public static void main(String[] args) throws IOException, InterruptedException  {
		//Reading from file.
		  //Create Object of java FileReader and BufferedReader class.
	System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://newtours.demoaut.com");
		d.manage().window().maximize();
		  FileReader FR = new FileReader("d://temp.txt");
		  BufferedReader BR = new BufferedReader(FR);
		  String Content  = "";
		  while((Content = BR.readLine())!= null){
			   //System.out.println(Content);
		  String vararray[]=Content.split("@");
		  d.findElement(By.name("userName")).sendKeys(vararray[0]);
		  d.findElement(By.name("password")).sendKeys(vararray[1]);
		  d.findElement(By.name("login")).click();
		  d.findElement(By.linkText("Home")).click();
		  Thread.sleep(3000);
		  
		 
		  }
		 }

	}

