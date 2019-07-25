package rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Insurance1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.carwale.com/insurance/");
		driver.manage().window().maximize();
		//WebElement w=driver.findElement(By.id("drpMake"));
		//Select s=new Select(w);
		//s.selectByIndex(1);

		List<WebElement> l= driver.findElements(By.xpath("//select[@id='drpMake']/option"));
		System.out.println(l.size());


		WebElement j=driver.findElement(By.xpath("//select[@id='drpMake']"));

		//Select s=new Select((WebElement)(l.get(i)));
		Select s=new Select(driver.findElement(By.xpath("//select[@id='drpMake']")));
		for(int i=0;i<l.size();i++) {
			//s.selectByVisibleText("Aston Martin");


			s.selectByIndex(i);

			String u=l.get(i).getText().toString();
			//if(u=="Audi")
			if(u.equals("Force Motors"))
			{
				System.out.println(u);
Thread.sleep(3000);
				List<WebElement> n1=driver.findElements(By.xpath("//select[@id='drpModel']/option"));
				Select t=new Select(driver.findElement(By.xpath("//select[@id='drpModel']")));
				System.out.println(n1.size());
				for(int k=0;k<n1.size();k++)
				{
					
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					t.selectByIndex(k);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String u1=n1.get(k).getText();
					System.out.println(u1);
					/*if(u1.contentEquals("Gurkha"))
					{
						System.out.println(u1);
						break;

					}*/
					
				}
				break;
			}




			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



		}




	}

}
