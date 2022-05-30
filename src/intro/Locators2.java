package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://rahulshettyacademy.com/AutomationPractice/
		
		System.setProperty("webdriver.chrome.driver", "G:\\java\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.cssSelector("div a button:nth-child(1)")).getText());
		//driver.findElement(By.cssSelector("//div/button[text()='Practice']")).getText();
		System.out.println(driver.findElement(By.xpath("//div/a/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.cssSelector("header div button:nth-child(2)")).getText());
		System.out.println(driver.findElement(By.xpath("//button[contains(@class,'btn')][text()='Home']")).getText());
		driver.close();
		
		
		
		
		
	}

}
