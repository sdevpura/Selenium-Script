// Program to use methods  like isEnabled(), isDisplayed(), getAttribute(), 
package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SurbhiDevpura\\Documents\\Surbhi\\Automation\\Selenium-Upskill\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); //  'Chromedriver' supports only for chrome driver
		
	driver.get("http://newtours.demoaut.com/");
	
	//API Maximise the screen
	driver.manage().window().maximize();
	
	//Enter Username and password
	WebElement UN = driver.findElement(By.name("userName"));
	
	if(UN.isEnabled()){
	UN.sendKeys("sunil");
	Thread.sleep(2000);
	UN.clear();
	UN.sendKeys("Manipal");
	}
	
	if(driver.findElement(By.name("userName")).isDisplayed()){
		
		System.out.println(UN.getAttribute("value"));
		String name1 = UN.getAttribute("name"); // toget value of attribute 'name'
		System.out.println(name1);
		String type = UN.getAttribute("type"); // toget value of attribute 'type'-> userName
		System.out.println(type);
		String size = UN.getAttribute("size");
		System.out.println(size);
		String name2 = UN.getText();
		System.out.println("Text is: "+name2);
		
		//gettext is used to find value of the label or text in dropdown
		String label = driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText(); 
		System.out.println(label);
	}
	driver.quit();
	
	//driver.findElement(By.name("password")).sendKeys("sunil");
	//driver.findElement(By.name("login")).click();
	
	}

}
