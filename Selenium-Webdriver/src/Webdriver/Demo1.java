package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		//Set Chrome Driver properties
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SurbhiDevpura\\Documents\\Surbhi\\Automation\\Selenium-Upskill\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		//Open new instances of Browsers
		//WebDriver  = new ChromeDriver(); //'Webdriver' Interface supports for all the drivers
		ChromeDriver driver = new ChromeDriver(); //  'Chromedriver' supports only for chrome driver
		//FirefoxDriver driver1 = new FirefoxDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\SurbhiDevpura\\Selenium Jars\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//FirefoxDriver driver1 = new FirefoxDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); //to open url

		
		//API Maximise the screen
		driver.manage().window().maximize();
		
		String expectedTitle = "OrangeHRM";
		//Enter Username and password
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String actualTitle = driver.getTitle(); //to get title
		if(expectedTitle.equals(actualTitle)){
			System.out.println("Title match");
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(2000);			
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();	
			driver.close(); // Close active browser instance
			driver.quit(); //close all the browsers
			System.out.println("Testing Github commit1");
			
		}

		
		
	}

}
