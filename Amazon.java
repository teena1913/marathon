package fridaymarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option); 
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags",Keys.ENTER);
	    driver.findElement(By.id("twotabsearchtextbox")).clear();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys",Keys.ENTER);
	    String count= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        System.out.println(count);
        driver.findElement(By.linkText("Safari")).click();
        driver.findElement(By.id("p_89/American Tourister")).click();
       WebElement feature= driver.findElement(By.xpath("//span[text()='Sort by:']"));
       Actions act= new Actions(driver);
       act.moveToElement(feature).click(feature).perform();
       WebElement newarrival= driver.findElement(By.xpath("//a[text()='Newest Arrivals']"));
       act.moveToElement(newarrival).click(newarrival).perform();
      String pri=driver.findElement(By.xpath("//div[@class='a-row a-size-base a-color-base']")).getText();
       System.out.println(pri);
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        
       
	}

}



