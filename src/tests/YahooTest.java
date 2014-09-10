package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest {
	@Test
	public void testYahooTest(){
		WebDriver d = new FirefoxDriver();
		d.get("http://www.yahoo.com");
		System.out.println(d.getTitle());
		d.close();
	}

}
