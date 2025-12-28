package com.QaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamictablePage extends Baseclass {

@FindBy(xpath="//td[contains(text(),'Chrome')]/following-sibling::td[contains(text(),'%')]")
public WebElement CPUvalue;
@FindBy(xpath="//h1[contains(text(),'Dynamic Table page for Automation Testing Practice')]")
private WebElement title;

@FindBy(xpath="//p[@id='chrome-cpu']")
public WebElement chromecpuval;



public DynamictablePage() {
	PageFactory.initElements(driver, this);

}

public String validatetitle()
{
	String heading=title.getText();  //Dynamic Table page for Automation Testing Practice										
	return heading;  
	
}

public String validateCPUValue() {
	String cpuval=CPUvalue.getText();
	return cpuval;

}

}
