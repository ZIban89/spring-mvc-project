package by.htp.nikonov.task02;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractUITest {
	
	protected WebDriver driver;
	protected static final String URL="http://localhost:6013/spring-mvc-project/";
	protected static final String webDriverLocation="src\\main\\resources\\chromedriver.exe";
	
	public AbstractUITest() {
		System.setProperty("webdriver.chrome.driver", webDriverLocation);
	}
	
	@Before
	public void init() {
		driver=new ChromeDriver();
	}
	
	
	@After
	public void destroy() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

}
