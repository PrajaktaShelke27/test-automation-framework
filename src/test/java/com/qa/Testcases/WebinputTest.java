package com.qa.Testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QaPages.Baseclass;
import com.QaPages.Homepage;
import com.QaPages.Webinputpage;

public class WebinputTest extends Baseclass {
	
	Homepage HP;
	Webinputpage WP;
	
	public WebinputTest() {
		super();
	
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		HP=new Homepage();
		WP=new Webinputpage();
		WP=HP.testWebinput();

	}

	@Test
	public void verifyDisplayinput() throws InterruptedException {
		WP.displayinput();
		Thread.sleep(5000);
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(WP.outputnumb));
		String number=WP.outputnumb.getText();
		Assert.assertEquals("10",number);
		
		String text=WP.outputtext.getText();
		Assert.assertEquals("Testuser",text);
		
		String password=WP.outputpassword.getText();
		Assert.assertEquals("Testpassword123",password);
		
		String date=WP.outputdate.getText();
		Assert.assertEquals("2024-10-04",date);
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
