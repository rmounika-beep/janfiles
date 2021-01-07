package testNGscripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Parametarization_XLS {
	
	
	 WebDriver driver;
		
	 
	 @BeforeClass

	 public void startbrowser()
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
	 	
	 }
	 
	 
	@Test(priority='1',dataProvider="readData")
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
	
	
// Create a method that return a value
	// becuase thso method is going to read data from excel sheet and supply the data to me 
	//selenium scripts
	
	@DataProvider(name="readData")
	public Object[][] readData() throws BiffException, IOException
	{
		
File f= new File("C:\\Users\\Deepak\\Desktop\\Book1.xls");	

// get the workbook
            
    Workbook w  = Workbook.getWorkbook(f);
    
    // get sheet from workbook
        
    Sheet s=w.getSheet("Sheet1");
    
   // get the count of rows and columns which have data
    
 int rows=   s.getRows();  //21
 int col=   s.getColumns(); //4
    
 
 String inputData[][]= new String[rows][col];
 
 for(int i=0;i<rows;i++)
 {
	 for(int j=0; j<col; j++)
	 {
		Cell c= s.getCell(j, i);
		
		inputData[i][j]=c.getContents();
		 
		 
	 }
 }
 
 return inputData;
	}

}