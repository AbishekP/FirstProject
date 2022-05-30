package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trips {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\java\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
		driver.findElement(By.xpath("//div[@data-testid='one-way-radio-button']")).click();
		Thread.sleep(1000);
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div[2]/input")).sendKeys("MAA");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div/div[2]/input")).sendKeys("AMD");

	}

}
