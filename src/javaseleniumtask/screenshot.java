package javaseleniumtask;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver.chrome.driver","C:\\Browserdrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        TakesScreenshot ts=(TakesScreenshot)driver;
       
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        WebElement un=driver.findElement(By.xpath("//input[@name='username']"));
        WebElement pd=driver.findElement(By.xpath("//input[@name='password']"));
        un.sendKeys("Admin");
        pd.sendKeys("admin123");
        WebElement log=driver.findElement(By.xpath("//button[@type=\'submit']")); 
        File src=ts.getScreenshotAs(OutputType.FILE);
        File des=new File("C:\\Users\\vinit\\Downloads\\screen1.png");
        FileUtils.copyFile(src, des);
        log.click();
        Thread.sleep(2000);
        File src1=ts.getScreenshotAs(OutputType.FILE);
        File des1=new File("C:\\Users\\vinit\\Downloads\\screen2.png");
        FileUtils.copyFile(src1, des1); 
        Thread.sleep(2000);
        WebElement buzz=driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[11]"));
		buzz.click();
		Thread.sleep(2000);
		 File src3=ts.getScreenshotAs(OutputType.FILE);
	     File des3=new File("C:\\Users\\vinit\\Downloads\\screen3.png");
	     FileUtils.copyFile(src3, des3);
     	Thread.sleep(2000);
		WebElement post=driver.findElement(By.xpath("//textarea[@class='oxd-buzz-post-input']"));
		 post.sendKeys("Vinita");
		 Thread.sleep(2000);
		 File src4=ts.getScreenshotAs(OutputType.FILE);
	     File des4=new File("C:\\Users\\vinit\\Downloads\\screen4.png");
	     FileUtils.copyFile(src4, des4);
	     WebElement postbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	 	 postbutton.click();
	 	 Thread.sleep(2000);
	 	 File src5=ts.getScreenshotAs(OutputType.FILE);
	     File des5=new File("C:\\Users\\vinit\\Downloads\\screen5.png");
	     FileUtils.copyFile(src5, des5);
	 	 //Thread.sleep(2000);

	}

}
