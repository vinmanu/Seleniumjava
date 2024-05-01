package javaseleniumtask;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Windowhandling {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Browserdrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@title='Take a look at Instagram']")).click();     
        String pid=driver.getWindowHandle();
        Set<String>abc=driver.getWindowHandles();
        System.out.println(pid);
        System.out.println(abc);
        for(String a:abc) {
        	
        	if(!(pid.equals(a))) {
        		
        		driver.switchTo().window(a);
        	}
        }
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vinita");
        
    

	}

}
