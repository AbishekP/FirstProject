package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriversInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\java\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.close();
		
		System.setProperty("webdriver.edge.driver", "G:\\java\\Jars\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://google.com");
		driver1.close();
		
		System.setProperty("webdriver.gecko.driver", "G:\\java\\Jars\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://google.com");

	}

}
