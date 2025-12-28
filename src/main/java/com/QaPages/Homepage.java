package com.QaPages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends Baseclass {
	 	
@FindBy(xpath="//h1[@id='main-title']")
private WebElement title;
@FindBy(xpath="//header/nav[1]/a[contains(@aria-label,'SUT')]")
private WebElement logo;
@FindBy(xpath="//a[contains(text(),'Web inputs')]")
private WebElement webinputlink;
@FindBy (xpath="//a[contains(text(),'Dynamic Table')]")
private WebElement DynamicTablellink;
@FindBy(xpath="//a[contains(text(),'My Browser Information')]")
public WebElement browserInfolink;

@FindBy(xpath = "//a[contains(text(),'Radio Buttons')]")  //
private WebElement radioBtnlink;

@FindBy(xpath = "//a[contains(text(),'Dynamic Pagination Table')]")
WebElement paginationlink;

@FindBy(linkText="Drag and Drop")  ////a[contains(text(),'Drag and Drop')]
private WebElement dragdroplink;

@FindBy(linkText="Drag and Drop Circles")
private WebElement cdragcirclelink;

@FindBy(xpath="//a[contains(text(),'Form Validation')]")
private WebElement formvalidlink;

@FindBy(xpath="//a[contains(text(),'File Upload')]")
private WebElement e;

@FindBy(xpath="//a[contains(text(),'File Downloader')]")
private WebElement f;

@FindBy(xpath="//a[contains(text(),'Forgot Password Form')] 	")
private WebElement g;	


public Homepage()
{
	PageFactory.initElements(driver, this);
}
public String validatetitle()
{
	String heading=title.getText();
	return heading;
	
}
public boolean validateLogo(){
	return logo.isDisplayed();
	
}
public Webinputpage testWebinput() {
	webinputlink.click();
	return new Webinputpage();
}

public RadiobtnPage testradiobtnlink() throws InterruptedException {
	//Thread.sleep(2);
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");  //document.body.scrollHeight
	//js.executeScript("window.scrollBy(450,1000);");
	
	
	Point point = radioBtnlink.getLocation();
	int x,y;
	x=point.getX();
	y=point.getY();
	System.out.println("X: " +x + ", Y: " + y);
	//js.executeScript("window.scrollBy(0, -100);"); // Scrolls up 100px

	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'nearest'});", radioBtnlink);

	//js.executeScript("arguments[0].scrollIntoView(true);", radioBtnlink);
	
	//js.executeScript("window.scrollBy(x,y)");
	Thread.sleep(500);
	
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(radioBtnlink)).click();
	
		
	//radioBtnlink.click();
	
	return new RadiobtnPage();
	
}

public DynamictablePage testDynamictable() {
	DynamicTablellink.click();
	return new DynamictablePage();
}
public Dynamic_Pagination_Page testPagination() throws InterruptedException {
	
	JavascriptExecutor js = ((JavascriptExecutor) driver);

	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'nearest'});", paginationlink);
	Thread.sleep(500);
	
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(radioBtnlink));
	paginationlink.click();
	return new Dynamic_Pagination_Page();
	
}

}
