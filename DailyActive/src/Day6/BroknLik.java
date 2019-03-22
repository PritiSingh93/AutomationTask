package Day6;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// checked
public class BroknLik {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\selenium-prerequesite-jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("Total Link are "+link.size());
		for(int i=0;i<=link.size();i++) {
			WebElement ele=link.get(i);
			String url=ele.getAttribute("href");
			verfiyLink(url);
		}
		
	}

	private static void verfiyLink(String url) {
		try {
			URL urlLink = new URL(url);
			HttpURLConnection httpConnrct= (HttpsURLConnection)urlLink.openConnection();
			httpConnrct.setConnectTimeout(10000);
			httpConnrct.connect();
			if(httpConnrct.getResponseCode()==200) {
				System.out.println(url +" -- "+httpConnrct.getResponseMessage());
			}
			if(httpConnrct.getResponseCode()==404) {
				System.out.println(url +" -- " +httpConnrct.getResponseMessage());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
