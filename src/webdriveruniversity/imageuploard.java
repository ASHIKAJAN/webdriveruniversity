package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imageuploard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashik\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		WebElement fileinput=driver.findElement(By.xpath("https://webdriveruniversity.com/File-Upload/index.html"));
		fileinput.sendKeys("C:\\Users\\ashik\\OneDrive\\Desktop\\picture.jpg");
		try
		{
			Thread.sleep(5000);
		}
		    catch(InterruptedException e)
		{
		    e.printStackTrace();	
		}
		
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
		submit.click();
		driver.switchTo().alert().accept();

	}

}
