package javaseleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class METHOD {
	String driverPath = "C:\\Browserdrivers\\chromedriver.exe";
	
     WebDriver driver=new ChromeDriver();
      void navigate() throws InterruptedException {
    	  System.setProperty("WebDriver.chrome.driver","C:\\Browserdrivers\\chromedriver.exe");
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        
    }
      void login() throws InterruptedException {
    	  
    	  WebElement un=driver.findElement(By.xpath("//input[@name='username']"));
          WebElement pd=driver.findElement(By.xpath("//input[@name='password']"));
          un.sendKeys("Admin");
          pd.sendKeys("admin123");
          WebElement log=driver.findElement(By.xpath("//button[@type=\'submit']"));
          log.click();	
          Thread.sleep(2000);
      }
    void post() throws InterruptedException {
    	
    	 WebElement buzz=driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[11]"));
  		buzz.click();
  		Thread.sleep(2000);
 		WebElement post=driver.findElement(By.xpath("//textarea[@class='oxd-buzz-post-input']"));
 		post.sendKeys("Vinita");
 		Thread.sleep(2000);
 		WebElement postbutton=driver.findElement(By.xpath("//button[@type='submit']"));
 		postbutton.click();
 		Thread.sleep(2000);
    }

}
