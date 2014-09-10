package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
	
	@Test
	public void testGoogleTest(){
	
		WebDriver d = new FirefoxDriver();
		d.get("http://www.gmail.com");
		System.out.println(d.getTitle());
		d.close();
		
		
		
	}

}
