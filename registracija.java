import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registracija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver= new ChromeDriver();
	try {
	driver.get(Vezba1.url1);
	driver.findElement(By.xpath("//td[@height='16']//td[2]")).click();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("tamara");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("banjeglav");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("064111222");
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("tamarab");
	driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Knez Mihajlova");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Beograd");
	driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Srbija");
	driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("11000");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tbanjeglav@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tamara.b");
	driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("tamara.b" + "\n");
		
}
catch (Exception ex) {
	System.out.println("Greska");
}
	
finally {
		driver.quit();
	}
}}