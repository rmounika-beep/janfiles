package testNGscripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import com.utility.Xls_dataProvider;

import jxl.Cell;



public class paramterizationwithapoi {
	
	WebDriver driver;
	// pass the name of data provide method as parameter to thsi test method
	 
	 @BeforeClass

	 public void startbrowser()
	 
	 {
		Reporter.log("this script is for fecthing the data from excel sheet and passing on to wikipage method,"+	
		"we are using dataprovider annotaions "+"we are using reporter .log method also to log messages "
				+"we have also used the tyep of excel sheet used is .xlsx ");
	 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
	 	driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
	 	
	 }
		 
		@Test(priority='1',	dataProvider="Book4")
		public  void wikipagedata(String name, String password, String retype, String email)
		{
			driver.findElement(By.id("wpName2")).clear();	
			driver.findElement(By.id("wpName2")).sendKeys(name);
			driver.findElement(By.id("wpPassword2")).clear();
			driver.findElement(By.id("wpPassword2")).sendKeys(password);
			driver.findElement(By.id("wpRetype")).clear();
			driver.findElement(By.id("wpRetype")).sendKeys(retype);
			driver.findElement(By.id("wpEmail")).clear();
			driver.findElement(By.id("wpEmail")).sendKeys(email);
		}
		
		
	@DataProvider(name="Book4")
	public  Object[][] readExcel() throws EncryptedDocumentException, IOException
	{
		Object input[] []=Xls_dataProvider.getTestData("Sheet1");
			
			return input;
		}}
	/*Reporter.log("reading the location of excel file", true);
	FileInputStream file=new FileInputStream("C:\\Users\\Deepak\\Desktop\\Book4.xlsx");
	
	Reporter.log("getting the workbook from above file location", true);
	
	 Workbook  book=WorkbookFactory.create(file);

	 Reporter.log("sheet is fecthed from the workbook", true);
Sheet sheet=book.getSheet("Sheet1");

Reporter.log("counting till the last row which has data in the sheet", true);
int rows= sheet.getLastRowNum();

Reporter.log("counting till the last column which has data in the sheet", true);
int col= sheet.getRow(0).getLastCellNum();

String input[][]= new String [rows][col]	;

for(int i=0;i<rows;i++)
{
	 for(int j=0;j<col;j++) {
		 
		 // fetch the data from each cell of that row
		
		 // fetching the cell
	input[i][j]= sheet.getRow(i+1).getCell(j).toString();
		 
		 }
	
}
Reporter.log("data is suppliyed to my test method", true);
return input;

//something wrong here.


}} */