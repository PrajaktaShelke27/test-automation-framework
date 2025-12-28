package com.QaPages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dynamic_Pagination_Page extends Baseclass {

@FindBy(xpath ="//h1[contains(text(),'Dynamic pagination Table page for Automation Testi')]")
WebElement title;

@FindBy(xpath="//select[contains(@name,'example_length')]")
WebElement no_of_entries;

@FindBy(xpath = "//a[contains(text(),'Next')]")
WebElement nextpage;

@FindBy(xpath = "//tbody[@id='demo']/tr")
List<WebElement> list;

@FindBy(xpath="//div[@id='example_info']")
public WebElement NoOfEntries;

public Dynamic_Pagination_Page() {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}

public int showentries() {
	Select select= new Select(no_of_entries);
	select.selectByValue("5");
	//select.selectByVisibleText("5");
	int NoOfRows=list.size();
	return NoOfRows;
}
public void showentries1() {
	
}

public void navigatetopage() throws InterruptedException {
	boolean flag=nextpage.isEnabled();
	System.err.println(flag);
	if(flag)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'nearest'});", nextpage);
		Thread.sleep(500);

		nextpage.click();
		System.out.println("Next button clicked");
	}
	//System.out.println("Next button is disabled");
}



}
