import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		//Launching browser
		
		WebDriver driver = new ChromeDriver();
		
		//Enter URL
		
		driver.get("http://softwaretesting-guru.blogspot.com/p/main-page.html");
		
		//Handle Hyperlink
		
		driver.findElement(By.linkText("Selenium Practice page")).click();
		
		//handle TextBox
		
		driver.findElement(By.name("Name")).sendKeys("Selenium");
		
		//handle check box
		
		driver.findElement(By.name("subscribe")).click();
		//Handle text area
		driver.findElement(By.name("comments")).sendKeys("Welcome to Selenium Page");
		
		//handle drop down
		new Select(driver.findElement(By.name("countries"))).selectByVisibleText("Argentina");
		//Handle radio button
		
		driver.findElement(By.xpath("//input[@value='bad']")).click();
		
		
		
		
		
		
		
		
	}

}
