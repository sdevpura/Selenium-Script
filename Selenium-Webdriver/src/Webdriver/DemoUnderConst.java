package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoUnderConst {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SurbhiDevpura\\Documents\\Surbhi\\Automation\\Selenium-Upskill\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");		
		
		String underconstitle ="Under Construction: Mercury Tours";
        List<WebElement> link = driver.findElements(By.tagName("a"));
        String[] linktext = new String[link.size()];
        //Extract the link text of each link elements
        int i=0;
        for(WebElement e:link)
        {
            linktext[i] = e.getText();
            i++;
        }
        //Test weather each link is working or not working
        for(String t:linktext)
        {
            driver.findElement(By.linkText(t)).click();
            if(driver.getTitle().equals(underconstitle))
            {
                System.out.println("\"" + t + "\"" + "\"+ is underconstruction");
            }
            else
            {
                System.out.println("\"" + t + "\"" + "\"+ is working");
            }
            driver.navigate().back();
        }
    }


		

	}


