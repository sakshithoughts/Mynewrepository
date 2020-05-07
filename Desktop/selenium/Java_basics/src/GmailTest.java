import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GmailTest {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SakShi\\Desktop\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ilovepdf.com/jpg_to_pdf");
        driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
  Thread.sleep(3000);
  
        Runtime.getRuntime().exec("C:\\Users\\SakShi\\Desktop\\AutoItConcepts\\Script3.exe");
     Thread.sleep(3000);
     driver.findElement(By.cssSelector("[class*='btn--process']")).click();


	}

}
