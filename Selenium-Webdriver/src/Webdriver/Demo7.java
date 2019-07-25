package Webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SurbhiDevpura\\Documents\\Surbhi\\Automation\\Selenium-Upskill\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title1 = driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		
		WebElement link = driver.findElement(By.linkText("Gmail"));		
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		Thread.sleep(1000);		
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		//Use Robot framework to click right click options
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		String title2 = driver.getTitle();
		if(title1.equals(title2)){
			System.out.println("same");
		}
		else
			System.out.println("not same");
	}

}
