package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashik\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")));
		dropdown.selectByVisibleText("python");
		
		Select dropdown1=new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]")));
		dropdown1.selectByVisibleText("Maven");
		
		Select dropdown2=new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")));
		dropdown2.selectByVisibleText("CSS");

	}

}
