package rahulShettyAcademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\java\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
		int sum=0;
		for(int i=0;i<values.size();i++) {
			sum = sum+ Integer.parseInt(values.get(i).getText());
		}
		int totalSum = Integer.parseInt((driver.findElement(By.className("totalAmount")).getText().split(": "))[1].trim());
		//System.out.println(totalSum + " and " + sum );
		Assert.assertEquals(totalSum, sum);
		
		//Number of Rows and columns in a table
		int rows = driver.findElements(By.xpath("//table[@class='table-display'] //tr")).size();
		int columns = driver.findElements(By.xpath("//table[@class='table-display'] //tr/th")).size();
		String secondColumn = driver.findElement(By.xpath("//table[@class='table-display'] //tr[3]")).getText();
		
		System.out.println("Number of rows: "+rows+ "\r" + "Number of columns: "+ columns);
		System.out.println(secondColumn);
	

	}

}
