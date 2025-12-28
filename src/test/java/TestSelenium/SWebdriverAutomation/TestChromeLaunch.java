package TestSelenium.SWebdriverAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.security.Timestamp;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TestChromeLaunch {
	
	WebDriver driver;
	
	@Test 
	public void Launchchrome() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Shri sai/Documents/PrajaktaS/SWebdriverAutomation/Driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com");
		System.out.println("Chrome Launch Successfully");
		
		
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(ss, new File("C:\\Users\Shri sai\Documents\PrajaktaS\SWebdriverAutomation\Screenshots\Testss.png"));
		FileHandler.copy(ss, new File("C:\\Users\\Shri sai\\Documents\\PrajaktaS\\SWebdriverAutomation\\Screenshots\\Testss.png"));
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		driver.close();

	}

}
