package testpack;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import framework.BaseTest;

public class TestScenario102 extends BaseTest {
	@Test
	public void testCase101() {
		System.out.println("hello from testCase101");
		driver.get("http://www.google.com");

		driver.findElement(By.name("q")).sendKeys("seleniumhq.org");

	}

	@Test
	public void testCase102() throws InterruptedException {
		System.out.println("hello from testCase102");
		String googleTitle = driver.getTitle();
		Reporter.log("googleTitle: " + googleTitle, true);
		Thread.sleep(2000);
		driver.findElement(By.name("q")).submit();
	}
}
