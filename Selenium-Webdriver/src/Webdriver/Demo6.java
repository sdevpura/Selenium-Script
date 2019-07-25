//Actions and Robot Framework and switch Tabs
package Webdriver;

import java.awt.AWTException;
import java.awt.KeyEventDispatcher;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		//http://realestate.upskills.in/admin, admin, adminuser@12345
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SurbhiDevpura\\Documents\\Surbhi\\Automation\\Selenium-Upskill\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://realestate.upskills.in/admin");
		driver.findElement(By.xpath("//*[@id='user_login' and @name='log']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='user_pass' and @name='pwd']")).sendKeys("adminuser@12345");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		//String title1 = driver.getTitle();
		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		Actions act = new Actions(driver);
		act.contextClick(link).build().perform();
		String title1 = driver.getTitle();
		
		//Use Robot framework to click right click options
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);	
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		String title2 = driver.getTitle();
		if(title1.equals(title2)){
			System.out.println("same");
		}
		else
			System.out.println("not same");
		
		
		

	}

}
