import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static final String url= "https://m.facebook.com/?refsrc=https%3A%2F%2Fsr-rs.facebook.com%2F&_rdr";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		 driver.get(url);
		 driver.findElement(By.xpath("//input[@id='m_login_email']")).click();
		 driver.sendKeys("tamarrra.s.84@hotmail.com");
		 driver.findElement(By.xpath("))

	
	
	}
	
	}


