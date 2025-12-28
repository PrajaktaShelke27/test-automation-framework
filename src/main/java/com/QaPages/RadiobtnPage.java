package com.QaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

public class RadiobtnPage extends Baseclass {
	
	@FindBy(xpath="//h1[contains(text(),'Radio Buttons page for Automation Testing Practice')]")
	private WebElement title;
	
	@FindBy(xpath="//input[@id='blue']")
	private WebElement bluebtn;

	@FindBy(xpath="//input[@id='red']")
	private WebElement redbtn;
	
	@FindBy(xpath="//input[@id='yellow']	")
	private WebElement yellowbtn;
	
	@FindBy(xpath="//input[@id='black']")
	private WebElement blackbtn;
	
	@FindBy(xpath="//input[@id='green']")
	private WebElement greenbtn;
	
	@FindBy(xpath="//label[contains(text(),'Basketball')]")
	private WebElement basketballbtn;
	
	@FindBy(xpath="//label[contains(text(),'Football')]")
	private WebElement footballbtn;

	@FindBy(xpath="//label[contains(text(),'Tennis')]")
	private WebElement tennisbtn;
	
	@FindBy(xpath="//body[@class='d-flex flex-column min-vh-100']")  //ad-bar
	private WebElement testad;
	
	@FindBy(xpath="//div[@id='dismiss-button']")  //ad-bar
	private WebElement closead;
	
	
	
	public RadiobtnPage() {
		PageFactory.initElements(driver, this);
	}

	

	public String validatetitle()
	{
		String heading=title.getText();  //Dynamic Table page for Automation Testing Practice										
		return heading;  
		
	}
	
	public boolean selectBulebtn()
	{
		System.out.print("add is displayed-"+testad.isDisplayed()); 
		System.out.print("add is displayed-"+closead.isDisplayed()); 

		if(testad.isDisplayed()&& closead.isDisplayed())
			closead.click();
		//Select select=new Select(bluebtn)
			bluebtn.click();
			boolean flag=bluebtn.isSelected();
			return flag;
			
	}

	public void selectredbtn()
	{
		redbtn.click();
	}
	public void selectyellobtn()
	{
		yellowbtn.click();
	}
	public void selectBlackbtn()
	{
		blackbtn.click();
	}
	public boolean checkdissabledbtn()
	{
		boolean flag=greenbtn.isEnabled();
		return flag;
	}
	
	

}
