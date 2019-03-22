import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vezba1 {
public static final String url= "https://mts.rs/";
public static final String url1="http://newtours.demoaut.com/";
	public static void main(String[] args) {
	
 WebDriver driver= new ChromeDriver();
 driver.get(url);
 driver.get(url1);
 driver.navigate().back();
 driver.getTitle();

 System.out.println("Title je:" + driver.getTitle());

System.out.println("Length je:" + driver.getPageSource().length());
String actualUrl = driver.getCurrentUrl();

 if(actualUrl.equals(url)) {
	 System.out.println("Corect URL:" + url);
 }
 else
 {
	 System.out.println("actual url is: " + actualUrl);
	 System.out.println("expected url is: " +url);
 }
 driver.getPageSource();
	driver.quit();
	 
	}

}
