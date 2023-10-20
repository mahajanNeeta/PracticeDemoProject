import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetToolTip {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		// Launching browser

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=facebook+login&rlz=1C1CHBF_en-GBGB961GB961&ei=zLkBYd7MFpXA8gKru7jYCg&oq=faceboo&gs_lcp=Cgdnd3Mtd2l6EAEYATIKCAAQsQMQgwEQQzIKCAAQsQMQgwEQQzIICAAQsQMQgwEyCggAELEDEIMBEEMyBwgAELEDEEMyBwgAELEDEEMyAggAMggIABCxAxCDATIICAAQsQMQgwEyCAgAELEDEIMBOgcIABBHELADOgcIABCwAxBDOgUIABCxAzoECAAQQzoKCAAQ6gIQtAIQQzoKCC4Q6gIQtAIQQzoICAAQ6gIQjwE6AgguOggILhDHARCjAkoECEEYAFDhgAZYntAGYLnhBmgCcAJ4AoABZYgBxQeSAQQxMi4xmAEAoAEBqgEHZ3dzLXdperABCsgBCsABAQ&sclient=gws-wiz");
		
		//Get Tool Tip Text
	String ToolTip	=driver.findElement(By.xpath("//div[@class='logo doodle']/a/img")).getAttribute("title");
	
		System.out.println(ToolTip);
	}

}
