package rahulShettyAcademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\java\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  //driver.manage().window().minimize();
		  
		  //Radio button
		  driver.findElement(By.xpath("//input[@value='radio1']")).click();
		  driver.findElement(By.xpath("//input[@value='radio2']")).click();
		  driver.findElement(By.xpath("//input[@value='radio3']")).click();
		  
		  //Dynamic dropDown
		  driver.findElement(By.
		  xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("ind");
		  Thread.sleep(3000);
		  List<WebElement> drops = driver.findElements(By.xpath("//ul/li/div[@class='ui-menu-item-wrapper']")); 
		  for(WebElement drop: drops)
		  {
			  if(drop.getText().equalsIgnoreCase("India")){
				  drop.click();
				  break;
			  }
		  }
		  
		  //Static dropDown
		  Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		  dropdown.selectByValue("option2");
		  dropdown.selectByValue("option3");
		  dropdown.selectByValue("option1");
		  
		  //CheckBox
		  driver.findElement(By.xpath("//div/fieldset/label/input[@id='checkBoxOption1']")).click();
		  
		  //Alert
		  driver.findElement(By.name("enter-name")).sendKeys("Abishek");
		  driver.findElement(By.id("alertbtn")).click();
		  driver.switchTo().alert().accept();
		  
		  //Parent - following-sibling concept
		  System.out.println(driver.findElement(By.xpath("//div/a/following-sibling::button[1]")).getText());
		  System.out.println(driver.findElement(By.xpath("//div/a/following-sibling::button[1]/parent::div/button[1]")).getText());
		 
	}
}
