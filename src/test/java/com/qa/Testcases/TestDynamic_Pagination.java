package com.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QaPages.Baseclass;
import com.QaPages.Dynamic_Pagination_Page;
import com.QaPages.DynamictablePage;
import com.QaPages.Homepage;

public class TestDynamic_Pagination extends Baseclass{
	Homepage HP;
	Dynamic_Pagination_Page DPP;
	public TestDynamic_Pagination() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		HP=new Homepage();
		DPP=new Dynamic_Pagination_Page();
		DPP=HP.testPagination();

	}
	@Test(priority=0)
	public void testshowentry()
	{
		int rowcount=DPP.showentries();
		System.out.println("No of ros shown are" +rowcount);
		
	}

	@Test(priority=1)
	public void clickNext() throws InterruptedException
	{	
		DPP.showentries();

		DPP.navigatetopage();
		String msg=DPP.NoOfEntries.getText();
		System.out.println(msg);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}


}
