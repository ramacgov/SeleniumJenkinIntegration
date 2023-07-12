package DatadrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement elt = driver.findElement(By.name("q"));
		elt.sendKeys("test");

		elt.clear();
	}

}
