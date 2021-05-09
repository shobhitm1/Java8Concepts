package Flatmap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesWithStream {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		driver.manage().window().maximize();
		
		java.util.List<WebElement> checkboxList =driver.findElements(By.cssSelector("td.select-checkbox"));
		checkboxList.forEach(x->x.click());
		
		driver.quit();
	}

}
