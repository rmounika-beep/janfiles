package testNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class4 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		//test:step 1:locate  a text box and enter the data int he text box.
		driver.findElement(By.id("searchInput")).sendKeys("selenium Testing");
		
		//2ND locator
		driver.findElement(By.name("search")).sendKeys("selenium testing");
		//3rd locator
		driver.findElement(By.className("not applicable for this element "));
		//4th lcoator
		driver.findElement(By.tagName("input")).sendKeys("selenium testing");
		//cannout use because tag names are not unique.
		//5th locator..relative.x path...
		
		driver.findElement(By.xpath("//*[@id=\"cr-hidden-style\"]")).sendKeys("selenium testing");
		//6th locator ..x path..absolute x path
		driver.findElement(By.xpath("/html/body/dom-module[1]")).sendKeys("selenium testing");
		
		//6th css
		
		driver.findElement(By.cssSelector("#cr-hidden-style")).sendKeys("selenium testing");
		
		
		//********* after the above expalnation refer th class 3 continaution.
	}

}
