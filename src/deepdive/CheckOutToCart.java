package deepdive;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] names = {"Brocolli", "Cauliflower","Cucumber", "Tomato"};
 		System.setProperty("webdriver.chrome.driver", "G:\\java\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.tagName("h4"));
		List<String> a = Arrays.asList(names);
		for(int j= 0;j<products.size();j++)
		{
			String[] name = products.get(j).getText().split(" ");
			//System.out.println(Arrays.asList(name));a
			if(a.contains(name[0])){
				//System.out.println(Arrays.asList(name));
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(j).click();
				//System.out.println(j);
			}
		}
		
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.cssSelector("div.action-block")).click();
		
		//Explicit wait applied
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//Explicit wait applied
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}

}
