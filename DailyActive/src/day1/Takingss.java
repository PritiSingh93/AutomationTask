package day1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takingss {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "A:\\selenium-prerequesite-jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("A:\\WorkSpace2\\Gochu\\DailyActive\\scrnshot.png"));
		
		
	}

}
