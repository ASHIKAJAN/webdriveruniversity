package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashik\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		WebElement yellow = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]"));
		yellow.click(); 
	     System.out.println("Radio button Yellow is successfully selected.");
	     
	     
	     WebElement green =driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[1]"));
	     green.click();
	     System.out.println("Radio button green is successfully selected.");
	     

	}

}
