package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class hello2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		
		String underConsTitle = "Under Construction: Mercury Tours";
		driver.get(baseUrl);
	
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		//Thread.sleep(3000);
		String[] linkTexts = new String[linkElements.size()];							
		int					i = 0;					

		//extract the link texts of each link element		
		for (WebElement e : linkElements) {							
		linkTexts[i] = e.getText();							
		i++;			
    }
		//test each link		
		for (String t : linkTexts) {							
		driver.findElement(By.linkText(t)).click();					
		if (driver.getTitle().equals(underConsTitle)) {							
            System.out.println("\"" + t + "\""								
                    + " is under construction.");			
        } else {			
            System.out.println("\"" + t + "\""								
                    + " is working.");			
        }		
		driver.navigate().back();			
    }		
		driver.quit();	
		

	}

}
