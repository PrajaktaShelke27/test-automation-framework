package com.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QaPages.Baseclass;
import com.QaPages.DynamictablePage;
import com.QaPages.Homepage;
//import com.QaPages.Webinputpage;

public class DynamictableTest extends Baseclass {

	Homepage HP;
	DynamictablePage DTP;
	
	public DynamictableTest() {
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		HP=new Homepage();
		DTP=new DynamictablePage();
		DTP=HP.testDynamictable();

	}

	@Test
	public void validatetitle()
	{
		String Pagetitle=DTP.validatetitle();
		Assert.assertEquals(Pagetitle, "Dynamic Table page for Automation Testing Practice");
	}
	
	
	@Test
	public void validateCPUvalue()
	{

		String CPUval=DTP.validateCPUValue();
		System.out.println("CPU value is" +CPUval);
		System.out.println("Chrome CPU value is" +DTP.chromecpuval.getText());

		Assert.assertEquals("Chrome CPU: "+CPUval, DTP.chromecpuval.getText(),"Value does not match");
		
		
	}
	
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

	
}
