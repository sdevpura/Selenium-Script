package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws Exception {
			
		//Launch Chrome browser	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SurbhiDevpura\\Documents\\Surbhi\\Automation\\Selenium-Upskill\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); //  'Chrome driver' supports only for chrome driver
		
		//Open site "http://newtours.demoaut.com/"
	driver.get("http://newtours.demoaut.com/");
	
	//API Maximise the screen
	driver.manage().window().maximize();
	
	//Login to site
		
	driver.findElement(By.name("userName")).sendKeys("sunil");	
	driver.findElement(By.name("password")).sendKeys("sunil");
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(3000); 
	
	//find required elements and assign to variables.	
	WebElement btnRound = driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']"));
	WebElement btnOneWay = driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']"));
	
	//Test 1. Check if Radio button for Round Trip is checked by default.		
 	/*if(btnRound.isSelected())
 		System.out.println("Radio button for Round Trip is checked by default.");
 		else
 			System.out.println("Radio button for Round Trip is not checked by default.");
 	
 	//Test 2. Select radio button for One way and Check if Radio button for One Way Trip is checked	
 		btnOneWay.click();
 		
 		if(btnOneWay.isSelected())
 			System.out.println("Radio button for One Way Trip is checked successfully.");
 		else
 			System.out.println("Radio button for One Way Trip is not checked successfully.");*/
 		
 		
	if(btnRound.isSelected()){
 		System.out.println("Radio button for Round Trip is checked by default.");
 		
 		btnOneWay.click();
 		
 		if(btnOneWay.isSelected())
 			System.out.println("Radio button for One Way Trip is checked successfully.");
 		else
 			System.out.println("Radio button for One Way Trip is not checked successfully.");
 		
	}
 		else
 			System.out.println("Radio button for Round Trip is not checked by default.");
	

	WebElement DD = driver.findElement(By.name("passCount")); //Passanger count
	//WebElement DD = driver.findElement(By.name("fromPort")); //Passanger count
	
	
//To work with Drop Down List using for loop
	Select sel = new Select(DD); //Use Class Select
	List<WebElement> data = sel.getOptions();
			System.out.println("Size is: "+data.size());
	for(int i=0;i<data.size();i++){
		System.out.println("Options are: "+data.get(i).getText());
	}
	
	// 1. 
	sel.selectByVisibleText("2");
	Thread.sleep(2000);
/*	//2
	sel.selectByIndex(2);
	Thread.sleep(2000);
	//3
	sel.selectByValue("1");	*/
	
	/*//To select Departing from:
	
	Select sel = new Select(DD); //Use Class Select
	List<WebElement> data = sel.getOptions();
			System.out.println("Size is: "+data.size());
	for(int i=0;i<data.size();i++){
		System.out.println("Options are: "+data.get(i).getText());
	}
	
	// 1. 
	sel.selectByVisibleText("Frankfurt");
	Thread.sleep(2000);
	System.out.println("Frankfurt selected");
	//2
	sel.selectByIndex(2);
	Thread.sleep(2000);
	//3
	sel.selectByValue("1");*/
	
	
	driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
	driver.findElement(By.xpath("//*[@name='findFlights']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@name='reserveFlights']")).click();
	
	driver.findElement(By.name("passFirst0")).sendKeys("Surbhi");
	driver.findElement(By.name("passLast0")).sendKeys("Devpura");
	driver.findElement(By.name("creditnumber")).sendKeys("1234 1234 1234");
	List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
	
	//to select both checkboxes
	for(WebElement e:checkbox)
		e.click();
	
	//to select first checkbox
	for(int i=1;i<checkbox.size();i++){
		checkbox.get(i).click();
		
	}
		
	

 		
 		//driver.close();
	
	}

}
