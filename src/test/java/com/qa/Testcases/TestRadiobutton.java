package com.qa.Testcases;

//import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QaPages.Baseclass;
//import com.QaPages.DynamictablePage;
import com.QaPages.Homepage;
import com.QaPages.RadiobtnPage;

public class TestRadiobutton extends Baseclass {
Homepage HP;
RadiobtnPage RP;

public TestRadiobutton()
{
	super();
}
@BeforeMethod
public void setup() throws InterruptedException  
{
	initialization();
	HP=new Homepage();
	RP=new RadiobtnPage();
	//JavascriptExecutor js = ((JavascriptExecutor) driver);
	//js.executeScript("window.scrollTo(0, 300)");  //document.body.scrollHeight

	RP=HP.testradiobtnlink();

}

@Test
public void validatetitle()
{
	String Pagetitle=RP.validatetitle();
	Assert.assertEquals(Pagetitle, "Radio Buttons page for Automation Testing Practice");
}

@Test
public void Testradiobtnclick() throws InterruptedException
{
	Thread.sleep(2);
	Boolean flag =RP.selectBulebtn();
	Assert.assertTrue(flag);
}



@AfterMethod
public void closeBrowser()
{
	driver.quit();
}

	
}
