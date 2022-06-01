package rahulShettyAcademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\java\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.className("custom_date_pic")).click();
		List<WebElement> date = driver.findElements(By.cssSelector("div[id='ui-datepicker-div'] td[data-handler='selectDay']"));
		Thread.sleep(2000);
		for(int i=0;i<date.size();i++) {
			WebElement selectedDate = date.get(i);
			if(selectedDate.getText().equalsIgnoreCase("3")) {
				date.get(i).click();
				break;
			}
		}
	}

}
