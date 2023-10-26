package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashik\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		WebElement FirstName=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
		FirstName.sendKeys("ASHIK");
		WebElement LastName=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
		LastName.sendKeys("AJAN");
		WebElement EmailAddress=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
		EmailAddress.sendKeys("ashikajankvkl@gmail.com");
		WebElement Comments=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
		Comments.sendKeys("no comments");
		WebElement Submit=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
		Submit.click();
		
		
		

	}

}
