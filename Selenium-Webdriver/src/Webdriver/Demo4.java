package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SurbhiDevpura\\Documents\\Surbhi\\Automation\\Selenium-Upskill\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Performance")).click();	
		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		System.out.println("Link Count is: "+linkCount.size());
		for(WebElement e:linkCount){
			String text = e.getText();
			System.out.println(text);
		}
		
		
		}

}
