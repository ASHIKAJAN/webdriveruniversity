package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashik\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		
		 WebElement Option1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]"));
		 Option1.click();
		 System.out.println("Option1 Checkbox is selected");
		 
		 WebElement Option2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]"));
		 Option2.click();
		 System.out.println("Option2 Checkbox is selected");
		 
		 driver.close();

	}

}
