package Day3;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenShotFa extends Base{
	@BeforeMethod
	public void setUp() {
		initialization();
		
	}
	@AfterMethod
	public void tearUp() {
		driver.quit();
		
	}
	@Test
	public void takeScreenShot() {
		Assert.assertEquals(false, true);
	}

}
