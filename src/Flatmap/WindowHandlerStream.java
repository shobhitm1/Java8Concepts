package Flatmap;

import java.util.Set;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerStream {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		
		Set<String> handles= driver.getWindowHandles();
		handles.forEach(x->System.out.println(x));
		driver.findElement(By.linkText("Good PopUp #3")).click();
		String title=switchToWindow(driver, "PopupTest Sunday");
		System.out.println(title);
	}
	
	public static String switchToWindow(WebDriver driver,String title) {
		return driver.getWindowHandles().stream()
				.map(handler->driver.switchTo().window(handler).getTitle())
				.filter(ele->ele.contains(title))
				.findFirst()
				.orElseThrow(()->{
					throw new RuntimeException("No Such Window");
				});
	}

}
