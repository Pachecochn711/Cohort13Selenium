package cohort_seleniumcp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openingBrowserTesting {

	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/techcircle/Downloads");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techcircleschool.com/");
		String url="https://www.techcircleschool.com/";
		driver.get(url);
		
	}
}
