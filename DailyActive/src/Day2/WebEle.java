package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEle {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "A:\\selenium-prerequesite-jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		String text=driver.findElement(By.xpath("//*[@id=\'gbw\']/div/div/div[1]/div[2]/a")).getText();
		System.out.println("Value of Text is = "+text);
		String text1=driver.findElement(By.xpath("//*[@id=\'gbw\']/div/div/div[1]/div[1]/a")).getAttribute("href");
		System.out.println("VAlue of Attribute is = "+text1);
	}
}
