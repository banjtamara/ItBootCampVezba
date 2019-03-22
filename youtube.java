import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	public static final String url= "https://m.youtube.com/?hl=sr&gl=RS";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		try {
		driver.get(url);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("rik astlej" + "\n");
		
		driver.findElement(By.xpath("//a[contains(text(),'Rick Astley - Never Gonna Give You Up (Official Mu')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@title='Pause (k)']")).click();
		//List<WebDriver> lst1= new ArrayList<>();
		List<WebElement>lst2= driver.findElements(By.className("ytd-watch-flexy"));
		
		System.out.println(lst2.get(2));}
	catch(Exception ex)	{
		System.out.println("Greska");
	}
	
		
	}

}
