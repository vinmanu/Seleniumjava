package javaseleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("WebDriver.chrome.driver","C:\\Browserdrivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         Thread.sleep(2000);
         WebElement un=driver.findElement(By.xpath("//input[@name='username']"));
         WebElement pd=driver.findElement(By.xpath("//input[@name='password']"));
         un.sendKeys("Admin");
         pd.sendKeys("admin123");
         WebElement log=driver.findElement(By.xpath("//button[@type=\'submit']"));
         log.click();
         Thread.sleep(2000);
         driver.navigate().back();
         Thread.sleep(2000);
         driver.navigate().forward();
         Thread.sleep(2000);
         driver.navigate().refresh();
	}

}
