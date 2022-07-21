package rahulShettyAcademy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MiscellaneousTopics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		//Accepting certificates - In secured sites
		option.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "G:\\java\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Maximizing window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://google.com");
		
		//Taking screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Abishek Periyasamy\\Desktop\\screenshot.png"));
		
		
		
		
	}

}
