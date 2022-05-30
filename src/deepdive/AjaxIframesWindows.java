package deepdive;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AjaxIframesWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\java\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		//AjaxActions
		a.moveToElement(driver.findElement(By.cssSelector("div.nav-line-1-container"))).build().perform();
		Thread.sleep(5000);
		//System.out.println(driver.findElement(By.cssSelector("span.nav-action-inner")).getText());
		
		//KeyboardFunctions
		a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("note").build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.cssSelector("div[aria-label='note 10 pro']")).click();
		WebElement note10pro = driver.findElement(By.cssSelector("img[alt='Redmi Note 10 Pro (Dark Night, 6GB RAM, 128GB Storage) -120hz Super Amoled Display|64MPwith 5mp Super Tele-Macro | 33W Cha...']"));
		a.moveToElement(note10pro).keyDown(Keys.CONTROL).click().build().perform();
		
		//HandlingMultipleWindows
		Set<String> window = driver.getWindowHandles();
		Iterator<String> ab = window.iterator();
		ab.next();
		String nextPage = ab.next();
		driver.switchTo().window(nextPage);
		
		
		driver.findElement(By.cssSelector("input#fbtCheck-2")).click();
		driver.findElement(By.cssSelector("input#fbtCheck-3")).click();
		driver.findElement(By.xpath("//input[@name='submit.addToCart']")).click();
		
		//Handling next window
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> abc = windows.iterator();
		abc.next();
		abc.next();
		String finalPage = abc.next();
		driver.switchTo().window(finalPage);
		
		Assert.assertEquals("Added to Cart",driver.findElement(By.xpath("//div[@id='sw-atc-details-single-container']/div/div/span")).getText());
		
		
		//iFrames
		//driver.switchTo().frame(0);
		//After completing all the actions in frame
		//driver.switchTo().defaultContent();
		

	}

}
