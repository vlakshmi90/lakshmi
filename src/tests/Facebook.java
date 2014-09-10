package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
	@Test
	public void testYahooTest(){
		WebDriver d = new FirefoxDriver();
		d.get("http://www.facebook.com");
		System.out.println(d.getTitle());
		Assert.fail("Fail method");
		d.close();
	}
	 

}
