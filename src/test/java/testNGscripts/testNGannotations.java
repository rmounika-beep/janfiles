package testNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNGannotations {

	//all test methods going to be void method only.
	//this method which is testing a feature / executing on the web page is called test method.
	//@test this annotation will helps to execute the method.
	
	@Test
	public void wikipage()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//here driver name we can use in another method as well beco aft the tag clsoe the driver method will get dead.
driver.get("https://www.wikipedia.org/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("Deepak Damegunta");
driver.findElement(By.xpath("//*[@type='submit']")).click();
driver.close();
	}
	
	@Test
	public void Mainpage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/Special:Search?search=selenium+testing&go=Go&ns0=1");
	driver.findElement(By.linkText("Main page")	).click();
	Thread.sleep(4000);
	driver.quit();
	}
	//here @test is important to execute test cases or else it will not execute without this.
	//only if we write test annotation this method will get execute.execting the test cases alphabeticaly order,mainpage will get execute first then wiki page will execute later.
}
