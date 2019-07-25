package rough;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
		//WebDriverWait d=new WebDriverWait(driver,15);
		//d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("html/body/div/div/div[5]/ul/li[2]/a")));
		//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("https://accounts.google.com/AccountChooser?service=mail&amp;continue=https://mail.google.com/mail/")).click();
		// driver.findElement(By.xpath("html/body/div/div/div[5]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//li[@class='h-c-header__nav-li g-mail-nav-links']/a[contains(text(),'Sign in') and @target='_blank' and @class='h-c-header__nav-li-link '][not(*)]")).click();
		//li[@class='h-c-header__nav-li g-mail-nav-links']/a[contains(text(),'Sign in') and @target='_blank' and @class='h-c-header__nav-li-link '][not(*)] 
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();

		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());

	}

}
