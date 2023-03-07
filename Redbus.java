package fridaymarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable notifications");
		ChromeDriver driver=new ChromeDriver(option); 
		driver.get("https://www.redbus.in/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.findElement(By.id("src")).sendKeys("chennai");
	       driver.findElement(By.className("selected")).click();
	       driver.findElement(By.id("dest")).sendKeys("bangalore");
	       driver.findElement(By.className("selected")).click();
	       driver.findElement(By.id("onward_cal")).click();
	       driver.findElement(By.xpath("//td[text()='25']")).click();
	       driver.findElement(By.id("search_btn")).click();
	       WebElement buses = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']"));
	        String num =buses.getText();
	        System.out.println(num);
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[@class='close-primo']")).click();
	        WebElement element = driver.findElement(By.xpath("//li/label[text()='SLEEPER']"));
	        driver.executeScript("arguments[0].click();", element);
	        WebElement newbus = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']"));
	        String num1 =newbus.getText();
	
	        System.out.println(num1);
	        System.out.println(driver.getTitle());
	        

	}

}
