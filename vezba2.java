import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vezba2 {
	//8. Close the Browser
	public static final String url= "http://newtours.demoaut.com/";	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Launch new Browser
		//2. Open http://newtours.demoaut.com/
		//3. Click on Register link using “driver.findElement(By.id(“<pronaci id u DOM-u>”)).click();“
		//4. Come back to Home page (Use ‘Back’ command)
		//5. Again go back to Registration page (This time use ‘Forward’ command)
		//6. Again come back to Home page (This time use ‘To’ command)
		//7. Refresh the Browser (Use ‘Refresh’ command)
		//8. Close the Browser
	WebDriver driver= new ChromeDriver();
	driver.get(url);
	driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().to(url);
	driver.navigate().refresh();
	driver.close();
	
	
	
	
	}

}
