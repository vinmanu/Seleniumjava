package javaseleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class visibility {

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
         boolean a,b;
        // a=log.isDisplayed();
        // b=log.isEnabled();
         //System.out.println(a+" "+b);
         if(log.isDisplayed() && log.isEnabled())
         
         
         log.click();	
         Thread.sleep(2000);
         driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
         Thread.sleep(2000);
         WebElement gendermale=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
         if(gendermale.isSelected()==false) {
        	 driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
        	 driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']")).click();
         }
         //driver.quit();

	}

}
