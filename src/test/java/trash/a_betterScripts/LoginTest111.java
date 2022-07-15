package trash.a_betterScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest111 extends BaseClass
{
	static By progressBar = By.xpath("//div[@class='progress-label'][contains(text(),'Complete!')]");

	@Test(description="This TC will perform valid login")
	public static void loginToApplication() throws Throwable
	{
		System.out.println("dddddddddddddddddddd");

		wait1.until(ExpectedConditions.elementToBeClickable(progressBar));
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