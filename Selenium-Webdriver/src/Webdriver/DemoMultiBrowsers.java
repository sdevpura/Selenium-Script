package Webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMultiBrowsers {

	public static void main(String[] args) throws InterruptedException {
		//Work with Multiple browsers---- https://www.toolsqa.com/automation-practice-switch-windows/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SurbhiDevpura\\Documents\\Surbhi\\Automation\\Selenium-Upskill\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window Name: "+parentWindow);
		WebElement button = driver.findElement(By.xpath("//*[@id='button1']"));
		
		//To click button to open child browser windows 3 times
		for(int i=0;i<3;i++){
			button.click();
			Thread.sleep(3000);
		}
		
		//To identify child windows
		List<String> childWindow = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Parent Window and Child Windows are: "+childWindow);
		String lastWindow = "";
		
		for(int i=1;i<childWindow.size();i++){
			driver.switchTo().window(childWindow.get(i));
			driver.navigate().to("https://www.google.com/");
			System.out.println("Child Tile "+i+" is: "+driver.getTitle());
			lastWindow = childWindow.get(i).toString();
		}
		
		
		driver.switchTo().window(parentWindow);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Parent Window is "+driver.getTitle());
		
		//Close active Browser
		driver.close();
		
		driver.switchTo().window(lastWindow);
		driver.navigate().to("http://newtours.demoaut.com/");
		System.out.println("Last Window is: "+driver.getTitle());
		Thread.sleep(3000);
		
		driver.quit();
	}

}
