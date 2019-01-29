package testng_prg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG {

	@Test
	public void verifyurl() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.edureka.co");
		String x = driver.getCurrentUrl();
		System.out.println(x);
		Assert.assertEquals(x, "https://www.edureka.co/");
		driver.close();
	}

	@Test
	public void verifytitle() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.edurekaaaaaa.co");
		String x = driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x, x); 
//		driver.close();
	}
}
