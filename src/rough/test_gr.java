package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
//import com.sun.xml.internal.txw2.Document;

public class test_gr {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.flipkart.com/"; 
		driver.get(baseUrl);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();


	//	try {
			Thread.sleep(3000);
	//	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}

		driver.findElement(By.xpath("//div[@class='_2aUbKa']")).click();
		//driver.findElement(By.xpath("//div[@class='_1jcwFN qt4LQw']/span")).click();
	//	try {
			Thread.sleep(3000);
	//	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		driver.findElement(By.xpath("//div[contains(text(),'Sell on Flipkart')]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		//div[contains(text(),'24x7 Customer Care')]
		driver.findElement(By.xpath("//div[@class='_2aUbKa']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'24x7 Customer Care')]")).click();
		driver.navigate().back();

		driver.findElement(By.xpath("//div[@class='_2aUbKa']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Advertise')]")).click();
		driver.navigate().back();

		driver.findElement(By.xpath("//div[@class='_2aUbKa']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Download App')]")).click();
		driver.navigate().back();

		//div[contains(text(),'Download App')]
		/*driver.findElement(By.xpath("//div[contains(text(),'Advertise')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='JvUE0p']/div/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2k0gmP']/following-sibling::div[1]")).click();



/*WebElement txtUsername=driver.findElement(By.xpath("//div[@class='_1jcwFN qt4LQw']/span"));



try {
Thread.sleep(3000);
} catch (InterruptedException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
Actions builder=new Actions(driver);

Action seriesOfActions=builder.moveToElement(txtUsername).build();
try {
Thread.sleep(4000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
//Action n=builder.keyDown(txtUsername,Keys.SHIFT).build();
Action d=builder.keyDown(Keys.ALT).build();
//Action c=builder.doubleClick(txtUsername).contextClick().build();
seriesOfActions.perform();
try {
Thread.sleep(4000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
//n.perform();
//c.perform();
d.perform();
//asking about 1)why first pop up came and 2)how to go second tab
//3)4 xpaths  u have to written to select those dropdown

//click on that drop down tab and press with inspect element that webelement then its html xpath 
//element will show 

/*Select s=new Select(txtUsername);

s.selectByIndex(1);*/





	}
}
