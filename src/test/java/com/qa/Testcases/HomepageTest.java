package com.qa.Testcases;

//import java.sql.Driver;

import org.testng.Assert;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QaPages.Baseclass;
import com.QaPages.Homepage;
import com.QaPages.Webinputpage;

public class HomepageTest extends Baseclass {
	
	Homepage HP;
	Webinputpage WP;
	public HomepageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		HP=new Homepage();

	}
	@Test
	public void validatetitle()
	{
		String Pagetitle=HP.validatetitle();
		Assert.assertEquals(Pagetitle, "Practice Test Automation Website for Web UI & API");
	}
	
	@Test
	public void validateLogo()
	{
		boolean flag=HP.validateLogo();
		Assert.assertTrue(flag);
		
	}
	
	@Test
	public void validatewebinput() {
		WP=HP.testWebinput();
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
