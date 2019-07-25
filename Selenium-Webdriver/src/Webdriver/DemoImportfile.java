package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoImportfile {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SurbhiDevpura\\Documents\\Surbhi\\Automation\\Selenium-Upskill\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://elearning.upskills.in");
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin@123");
        driver.findElement(By.id("form-login_submitAuth")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='block-items-admin']/ul/li[4]/a")).click();
        
        //Best practice is to use 'sendkeys' method to import files in Se. Another tool is AutoIt
        driver.findElement(By.xpath("//*[@id='user_import_import_file']")).sendKeys("C:\\Users\\SurbhiDevpura\\Selenium Jars\\SETestfile.txt");
		
		System.out.println("done");
		

	}

}
