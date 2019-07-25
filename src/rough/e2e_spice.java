package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e_spice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(3000);
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("it is disabled");
			Assert.assertTrue(true);

		} else {
			System.out.println("it is enabled");
			Assert.assertTrue(false);
		}
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Thread.sleep(3000);
		int l = driver.findElements(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option")).size();
		for (int k = 0; k < l; k++) {
			String s = s = driver
					.findElements(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option")).get(k)
					.getAttribute("value");
			if (s.equals("AED")) {
				driver.findElements(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option")).get(k)
						.click();

			}
		}
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input[value='Search']")).click();
	}

}
