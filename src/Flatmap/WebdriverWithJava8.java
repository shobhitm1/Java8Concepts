package Flatmap;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverWithJava8 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		/*
		 * for(WebElement elem:linklist) { System.out.println(elem.getText()); }
		 */
		//1.
		//linklist.forEach(elem->System.out.println(elem.getText()));
		
		
		//2. 
		/*
		 * java.util.List<String> newList=linklist.stream()
		 * .filter(ele->!ele.getText().equals("")).map(ele->ele.getText())
		 * .collect(Collectors.toList()); newList.forEach(x->System.out.println(x));
		 * System.out.println(newList);
		 */
		
		//3. 
		
		/*
		 * String findele=
		 * linklist.stream().filter(ele->!ele.getText().equals("")).findFirst().get().
		 * getText(); System.out.println(findele);
		 */
		//4.
		/*
		 * String findelem=
		 * linklist.stream().filter(ele->!ele.getText().equals("")).findAny().get().
		 * getText(); System.out.println(findelem);
		 */
		
		/*
		 * //5.exclude blank and starts with amazon 
		 * java.util.List<String> newList1= linklist.stream().filter(ele->!ele.getText().equals("") &&
		 * ele.getText().startsWith("Amazon")) .map(ele->ele.getText())
		 * .collect(Collectors.toList());
		 * 
		 * newList1.forEach(x->System.out.println(x));
		 */
		
		//6.
		
		 java.util.List<String> newList2=linklist.stream().filter(ele->!ele.getText().isEmpty())
		.filter(ele->!ele.getText().startsWith(" "))
		.map(ele->ele.getText())
		.collect(Collectors.toList());
				
		 newList2.forEach(x->System.out.println(x));	
		//driver.quit();
	}

}
