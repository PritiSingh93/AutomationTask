package Day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "A:\\selenium-prerequesite-jar\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	public void failed() {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("A:\\WorkSpace2\\Gochu\\DailyActive\\scrnshot\\testFailure.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
