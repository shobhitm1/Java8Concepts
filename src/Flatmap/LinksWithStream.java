package Flatmap;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksWithStream {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.cssSelector("ul.footer-nav li"));
		List<String> newFooterList = new ArrayList<String>();
		driver.findElements(By.cssSelector("ul.footer-nav li")).
		stream().
		forEach(elem->newFooterList.add(elem.getText()));
		links.stream().forEach(elem->newFooterList.add(elem.getText()));
		newFooterList.forEach(x->System.out.println(x));
		

	}

}
