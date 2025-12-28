package com.QaPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {	
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Baseclass()
	{

try {
	prop=new Properties();
	FileInputStream is=new FileInputStream("/Users/Shri sai/Documents/PrajaktaS/SWebdriverAutomation/src/main/java/com/qa/config/config.properties");
	prop.load(is);
	
	
}catch(FileNotFoundException e)
{
	e.printStackTrace();
}catch(IOException e) {
	e.printStackTrace();
}
	}
	
//@SuppressWarnings("deprecation")
public static void initialization()
{
	String browsername= prop.getProperty("browser");
	if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
		driver=new ChromeDriver();
	}
	//else if(browsername.equals("FF"))
	//{
		//System.setProperty("webdriver.chrome.driver", prop.getProperty("ffdriverpath"));
		//driver=new FirefoxDriver();
		
//	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(prop.getProperty("url"));
	
}

	

}
