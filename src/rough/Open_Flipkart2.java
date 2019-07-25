package rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Open_Flipkart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 
		 System.out.println("Open Flipkart");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();

		 
//		 driver.findElement(By.xpath("//a[@type='Login & Signup' ]")).click();
		 
		 driver.findElement(By.xpath("//*[@class='_2zrpKA']")).sendKeys("9477523466");	
		 
		 driver.findElement(By.xpath("//*[@type='password']")).sendKeys("abcd1234"); 
		 
     	 driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
     	 
     	try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	
     	 driver.findElement(By.xpath("//*[@class='LM6RPg']")).click();
     	 
     	 driver.findElement(By.xpath("//*[@class='LM6RPg']")).sendKeys("mobile lens");
     	 
     	 
     	 
    
     	
        driver.findElement(By.xpath("//*[@class='vh79eN']")).click();
   
      
       try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     /*  List<WebElement> v= driver.findElements(By.xpath("//div[@class='_1qKb_B']/select/option"));
       
       System.out.println(v.size());
       int i;
       for (i=0;i<v.size();i++)
       {
    	   WebElement t=v.get(i);
    	   System.out.println(t.getAttribute("value"));
    	  
    	   Select s=new Select(t);
    	   String st=t.getAttribute("value");
    	     
    	 //s.selectByVisibleText(st);
    	 s.selectByIndex(i);
    	   */
       Select u= new Select(driver.findElement(By.xpath("//div[@class='_1qKb_B']/select")));
       Thread.sleep(4000);
       u.selectByValue("300");
       Select x= new Select(driver.findElement(By.xpath("//div[@class='_1YoBfV']/select")));
       Thread.sleep(4000);
       x.selectByValue("750");
       
       List<WebElement> v= driver.findElements(By.xpath("//div[@class='_1qKb_B']/select/option"));
              int size=v.size();
       for(int i=0;i<size;i++)
       {
       Select t= new Select(driver.findElement(By.xpath("//div[@class='_1qKb_B']/select")));
       Thread.sleep(4000);
       String st=((WebElement) t).getAttribute("value");
       if(st.equals("300"))
       {
    	   t.selectByValue("300");
       }
       
       
       List<WebElement> w= driver.findElements(By.xpath("//div[@class='_1YoBfV']/select/option"));
       int s=w.size();
       for(int j=0;j<s;j++)
       {
    	  
    	   Select q= new Select(driver.findElement(By.xpath("//div[@class='_1YoBfV']/select")));
           Thread.sleep(4000);
           String str=((WebElement) t).getAttribute("value");
           if(str.equals("750"))
           {
        	   q.selectByValue("750");
        	   break;
           }

           
       }
       }
    	   
       }
      

	}


