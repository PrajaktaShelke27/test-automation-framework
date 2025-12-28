package TestSelenium.SWebdriverAutomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testcheckbox {
	@Test
public void Testcheckbox1() throws InterruptedException {
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/Shri sai/Documents/PrajaktaS/SWebdriverAutomation/Driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.nseindia.com/");
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement dailyreport=driver.findElement(By.linkText("Daily Report"));  //ul[contains(@Class, 'topband-gray justify-content-center')]/li/a[text()='Daily Reports']"));
	Actions action= new Actions(driver);
	action.moveToElement(dailyreport).click().perform();
	//driver.switchTo().frame(0);
	
	
	WebElement search=driver.findElement(By.xpath("//input[contains(@id,'crEquityDailySearch')]"));
	search.sendKeys("var begin");
	Thread.sleep(1000);
	
	WebElement checkbox=driver.findElement(By.xpath("//h4/span[contains(@id,'cr_equity_currentDate')]/following::div[5]/label"));
	
	JavascriptExecutor js=((JavascriptExecutor)driver);
	
	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'nearest'});", checkbox);
	
	Thread.sleep(500);
	
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(checkbox));
	
	
	//Thread.sleep(200);
	checkbox.click();
	
	
}
}
