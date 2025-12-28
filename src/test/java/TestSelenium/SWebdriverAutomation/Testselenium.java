package TestSelenium.SWebdriverAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testselenium {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/Shri sai/Documents/PrajaktaS/SWebdriverAutomation/Driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		System.out.println("Chrome Launch Successfully");
		
		String filepath="c:/Users/Shri sai/Documents/PrajaktaS/SWebdriverAutomation/Testdata/Book1.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		// TODO Auto-generated method stub
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		Row row;
		Cell cell;
		
				for(int i=1; i<=sheet.getLastRowNum()-1;i++)
				{
					WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
					WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
					row=sheet.getRow(i);
					cell=row.getCell(0);
					//cell.setCellType(cell.CELL_TYPE_STRING);
					username.sendKeys(cell.getStringCellValue());
					System.out.println(cell.getStringCellValue());
					row=sheet.getRow(i);
					cell=row.getCell(1);
					password.sendKeys(cell.getStringCellValue());
					System.out.println(cell.getStringCellValue());


					driver.findElement(By.xpath("//button[@type='submit']")).click();
					
				}
				driver.close();
	}

}
