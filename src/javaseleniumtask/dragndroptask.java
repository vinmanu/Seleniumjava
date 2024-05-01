package javaseleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndroptask {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		    System.setProperty("WebDriver.chrome.driver","C:\\Browserdrivers\\chromedriver-win64\\chromedriver.exe");
	       driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
	       driver.manage().window().maximize();
	      // Thread.sleep(2000);
	       Actions a=new Actions(driver);
	       WebElement w=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']\r\n"));
	       driver.switchTo().frame(w);
	       a.dragAndDrop(driver.findElement(By.xpath("//img[@src=\"images/high_tatras_min.jpg\"]")),driver.findElement(By.xpath("//div[@id='trash']"))).build().perform();
	       Thread.sleep(2000);
	       a.dragAndDrop(driver.findElement(By.xpath("//img[@src=\"images/high_tatras2_min.jpg\"]")),driver.findElement(By.xpath("//div[@id='trash']"))).build().perform();
	       Thread.sleep(5000);
	       a.dragAndDrop(driver.findElement(By.xpath("//img[@src=\"images/high_tatras3_min.jpg\"]")),driver.findElement(By.xpath("//div[@id='trash']"))).build().perform();
	       Thread.sleep(4000);
	       a.dragAndDrop(driver.findElement(By.xpath("//img[@src=\"images/high_tatras4_min.jpg\"]")),driver.findElement(By.xpath("//div[@id='trash']"))).build().perform();
	     

	}

}
