package com.QaPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Webinputpage extends Baseclass {
	
@FindBy(xpath="//input[contains(@type,'number')]")
private WebElement number;

@FindBy(xpath="//input[contains(@name,'input-text')]")
private WebElement text;

@FindBy(xpath="//input[contains(@type,'password')]")
private WebElement password;

@FindBy(xpath="//input[contains(@id,'input-date')]")
private WebElement date;

@FindBy(xpath="//button[@id='btn-display-inputs']")
private WebElement displaybtn;

@FindBy(xpath="//strong[@id='output-number']")
public WebElement outputnumb;

@FindBy(xpath="//strong[@id='output-text']")
public WebElement outputtext;

@FindBy(xpath="//strong[@id='output-password']")
public WebElement outputpassword;

@FindBy(xpath="//strong[@id='output-date']")
public WebElement outputdate;

public Webinputpage()
{
	PageFactory.initElements(driver, this);
}

public void displayinput() throws InterruptedException{
	number.sendKeys("10");
	text.sendKeys("Testuser");
	password.sendKeys("Testpassword123");
	//date.sendKeys("2024-10-04");
	//date.click();
	Thread.sleep(3000);	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("document.getElementById('input-date').value='2024-10-04';");


	// executor = (JavascriptExecutor)driver;
	//executor.executeScript("document.getElementById('input-date').style.display='block';");
	//Select select = new Select(driver.findElement(By.id("input-date")));
	//select.selectByVisibleText("10/10/2023");
	//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("CalendarClass")));
	
	//"//td[text()=10]"
	displaybtn.click();
	
}


}
