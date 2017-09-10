package by.htp.nikonov.task02;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class MainPageTest extends AbstractUITest{

	/*@Test
	public void testAddUserFunction() throws InterruptedException {
		driver.get(URL);
		Thread.sleep(1000);
		
		WebElement newBtn=driver.findElement(By.id("newBtn"));
		newBtn.click();
		Thread.sleep(1000);
		
	}*/
	
	@Test
	public void testDelUserFunction1() throws InterruptedException {
		driver.get(URL);
		Thread.sleep(1000);		
		List<WebElement> startRows= driver.findElements(By.xpath("//*[@id=\"deleteForm\"]/table/tbody/tr"));		
		markRow();		
		performAlert(false);
		List<WebElement> endRows= driver.findElements(By.xpath("//*[@id=\"deleteForm\"]/table/tbody/tr"));		
		Assert.assertEquals(endRows.size(),startRows.size());
	}
	
	@Test
	public void testDelUserFunction2() throws InterruptedException {
		driver.get(URL);
		Thread.sleep(1000);		
		List<WebElement> startRows= driver.findElements(By.xpath("//*[@id=\"deleteForm\"]/table/tbody/tr"));		
		markRow();		
		performAlert(true);
		List<WebElement> endRows= driver.findElements(By.xpath("//*[@id=\"deleteForm\"]/table/tbody/tr"));		
		Assert.assertEquals(endRows.size(),startRows.size()-1);
	}
	
	private void markRow() throws InterruptedException {
		WebElement firstUserCheckbox=driver.findElement(By.xpath("//*[@id=\"deleteForm\"]/table/tbody/tr[2]/td[1]/input"));
		firstUserCheckbox.click();
		Thread.sleep(1000);
		
		WebElement delBtn=driver.findElement(By.id("delBtn"));
		delBtn.click();
		Thread.sleep(1000);
	}
	
	private void performAlert(Boolean flag) throws InterruptedException {
		Alert alert=driver.switchTo().alert();
		Thread.sleep(1000);
		if(flag) {
			alert.accept();
		}else {
			alert.dismiss();
		}
		Thread.sleep(1000);		
	}
	
}
