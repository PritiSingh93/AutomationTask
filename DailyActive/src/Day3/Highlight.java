package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\selenium-prerequesite-jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("Priti");
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", username);
	}

}
