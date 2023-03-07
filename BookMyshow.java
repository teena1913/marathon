package fridaymarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyshow {

	public static void main(String[] args) throws InterruptedException  {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
			ChromeDriver driver=new ChromeDriver(); 
			driver.get("https://in.bookmyshow.com/");
		       driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		       driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("mumbai");
		       driver.findElement(By.xpath("//strong[text()='Mumbai']")).click();
		       System.out.println( driver.getCurrentUrl());
		       driver.findElement(By.xpath("//div[@class='sc-kxynE gLkGwh']")).click();
		       driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")).sendKeys("pathaan");
		       driver.findElement(By.xpath("//strong[text()='Pathaan']")).click();
		       driver.findElement(By.xpath("//span[text()='Book tickets'][1]")).click();
		      Thread.sleep(1000);
		       WebElement flim = driver.findElement(By.xpath("//a[text()='Carnival: Annex Mall, Borivali']"));
		        String num =flim.getText();
		        System.out.println(num);
		        Thread.sleep(1000);
		       driver.findElement(By.xpath("//div[text()='INFO']")).click();
		        String ss=driver.getTitle();
		        System.out.println(ss);;
		       if(ss.contains("parking")){
		    	System.out.println("there is parking");
		       }
		       else {
		    	   System.out.println("there is no parking");
		       }
		       Thread.sleep(1000);
		        driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		        driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		        driver.findElement(By.xpath("//a[@data-date-time='07:25 PM']")).click();
		        driver.findElement(By.xpath("//div[text()='Accept'][1]")).click();
		        
		        driver.findElement(By.xpath("//li[@id='pop_1']")).click();
		        driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//a[@class='_available'][1]")).click();
		        driver.findElement(By.xpath("//a[@id='btmcntbook'][1]")).click();
		        WebElement price=driver.findElement(By.xpath("//span[@class='__sub-total']"));
		        System.out.println(price.getText());
	}

}
