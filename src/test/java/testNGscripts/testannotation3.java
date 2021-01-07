package testNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testannotation3 {

	public static WebDriver driver;
	//req:each time 	you execute a test method a new chrome browser should open.
	
	//@BeforeTest//@Beforemethod annotation it will tel us that this particular method will be executed before every test method in this class
	
	@BeforeClass //this setup method will get executed as very first method in the class.
	public void setup() //we are making driver as global now.
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");	
		
	}

	@Test(priority='1')
	public void wikipage() throws InterruptedException
	{

driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("Deepak Damegunta");
driver.findElement(By.xpath("//*[@type='submit']")).click();
Thread.sleep(4000);

	}
	
	@Test(priority='2')
	public void mainPage() throws InterruptedException
	{
		//driver.navigate().to("https://en.wikipedia.org/wiki/Special:Search?search=selenium+testing&go=Go&ns0=1");	
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Main page")).click();
	Thread.sleep(4000);
	
}
	@AfterMethod
	public void closebrowser()
	{
		System.out.println("after method executed");
		driver.close();
	}
	
}
//some issue here that why we are nto able o exceutt this.