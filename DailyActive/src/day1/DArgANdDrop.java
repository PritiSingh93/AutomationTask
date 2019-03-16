package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DArgANdDrop {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "A:\\selenium-prerequesite-jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement target=driver.findElement(By.xpath("//*[@id='bank']/li"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	}
}
