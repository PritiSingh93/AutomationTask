package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\selenium-prerequesite-jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.name("postalCode")).sendKeys("4000080");
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByValue("COMOROS");
		select.selectByIndex(2);
	}

}
