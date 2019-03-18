package Day7;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Highlighted {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\selenium-prerequesite-jar\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String color=driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[1]/td[1]/label")).getCssValue("color");
		String backgrd=driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[1]/td[1]/label")).getCssValue("border-color");
		System.out.println(color);
		System.out.println(backgrd);
		

}
}
