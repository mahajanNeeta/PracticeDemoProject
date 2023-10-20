import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Background {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		// Launching browser

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.uk/");
	
	String color=	driver.findElement(By.name("btnK")).getCssValue("background_color");
		System.out.println(color);

	}

}
