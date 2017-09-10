package by.htp.nikonov.task02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditTest extends AbstractUITest {

	@Test
	public void testWrongFilling() throws InterruptedException {
		driver.get(URL);
		Thread.sleep(1000);

		fillField("T");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"user\"]/table/tbody/tr[9]/td[1]/input")).click();
		Thread.sleep(1000);

		boolean flag = true;
		if (!("3 or more chars").equals(driver.findElement((By.xpath("//*[@id=\"password.errors\"]"))).getText())) {
			flag = false;
		}
		if (!("3 or more chars").equals(driver.findElement((By.xpath("//*[@id=\"login.errors\"]"))).getText())) {
			flag = false;
		}
		if (!("only digits").equals(driver.findElement((By.xpath("//*[@id=\"age.errors\"]"))).getText())) {
			flag = false;
		}

		Assert.assertTrue(flag);
	}
	
	@Test
	public void testCorrectFilling() throws InterruptedException {
		driver.get(URL);
		String firstName=driver.findElement((By.xpath("//*[@id=\"deleteForm\"]/table/tbody/tr[2]/td[2]/p"))).getText();
		String lastName=driver.findElement((By.xpath("//*[@id=\"deleteForm\"]/table/tbody/tr[2]/td[3]/p"))).getText();
		
		Thread.sleep(1000);

		fillField("100");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"user\"]/table/tbody/tr[9]/td[1]/input")).click();
		Thread.sleep(1000);

		boolean flag = true;
		
		if (!("100").equals(driver.findElement((By.xpath("//*[@id=\"deleteForm\"]/table/tbody/tr[2]/td[4]/p"))).getText())) {
			flag = false;
		}
		if (!(firstName+"100").equals(driver.findElement((By.xpath("//*[@id=\"deleteForm\"]/table/tbody/tr[2]/td[2]/p"))).getText())) {
			flag = false;
		}
		if (!(lastName+"100").equals(driver.findElement((By.xpath("//*[@id=\"deleteForm\"]/table/tbody/tr[2]/td[3]/p"))).getText())) {
			flag = false;
		}
		
		Assert.assertTrue(flag);
	
	}

	private void fillField(String s) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"deleteForm\"]/table/tbody/tr[2]/td[7]/a")).click();

		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).sendKeys(s);

		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys(s);

		Thread.sleep(1000);
		WebElement age = driver.findElement(By.id("age"));
		age.clear();
		age.sendKeys(s);

		Thread.sleep(1000);
		WebElement login = driver.findElement(By.id("login"));
		login.clear();
		login.sendKeys(s);

		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys(s);
	}

}
