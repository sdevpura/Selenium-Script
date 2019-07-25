package Webdriver;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGetWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SurbhiDevpura\\Documents\\Surbhi\\Automation\\Selenium-Upskill\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));

		//GetWindowHandles()-> get number of tabs in window
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println("Number of tabks are: "+tabs.size());
		//switchTo()->to switch b/w tabs/browesers
		driver.switchTo().window(tabs.get(1));
		String title1 = driver.getTitle();
		System.out.println("Tab 2 title is: "+title1);
		
		driver.switchTo().window(tabs.get(0));
		String title2 = driver.getTitle();
		System.out.println("Tab 1 title is: "+title2);
		
		if(title1.equals(title2))
			System.out.println("same");
		else
			System.out.println("different");
		
		
		
		

	}

}
