import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		// Launching browser

		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		//maximize the browser#
		driver.manage().window().maximize();
		
		//click search option
		
		

	}

}
