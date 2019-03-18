package Day7;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ExceptionSs {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\selenium-prerequesite-jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver).register(new AbstractWebDriverEventListener() {
			
			@Override
			public void onException(Throwable throwable, WebDriver driver) {
				File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(screen, new File("C:\\Users\\priti\\git\\AutomationTask\\DailyActive\\scrnshot.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		eventDriver.findElement(By.id("test"));
		fail("Caught the expected exception");
	}

}
