package trash.a_betterScripts2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest1112222 extends BaseClass12222
{
	By progressBar = By.xpath("//div[@class='progress-label'][contains(text(),'Complete!')]");

	@Test
	public void loginToApplication() throws Throwable
	{
		System.out.println("dddddddddddddddddddd");

		Thread.sleep(10000);
		//wait1.until(ExpectedConditions.elementToBeClickable(progressBar));
		String text = driver.findElement(progressBar).getText();
		Assert.assertEquals(text, "Complete!");

//		wait1.until(ExpectedConditions.elementToBeClickable(inputFirstName));
//		driver.findElement(inputFirstName).sendKeys("Miroslaw");

		//wait.until(ExpectedConditions.elementToBeClickable(progressBar));


//		driver.findElement(By.name("txtUsername")).sendKeys("Admin1");
//
//		driver.findElement(By.id("txtPassword")).sendKeys("admin1");
//
//		driver.findElement(By.id("btnLogin")).click();
//
//		driver.navigate().back();
		
		Thread.sleep(1000);
	}

}