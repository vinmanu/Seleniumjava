package javaseleniumtask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclickeg {

	public static void main(String[] args) {
		    WebDriver driver=new ChromeDriver();
		    System.setProperty("WebDriver.chrome.driver","C:\\Browserdrivers\\chromedriver-win64\\chromedriver.exe");
	       driver.get("https://omayo.blogspot.com/");
	       driver.manage().window().maximize();
	      // Thread.sleep(2000);
	       Actions a=new Actions(driver);
	       WebElement dc=driver.findElement(By.xpath("//p[@id='testdoubleclick'] "));
	       a.doubleClick(dc).build().perform();
	}

}
