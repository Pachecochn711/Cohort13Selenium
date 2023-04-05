package UnitTestingPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicSelenniumMethods {

	WebDriver driver;

	public void openBrowser() {
		 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	public void test1() {
		WebElement checkBox1 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));

		Boolean isTrueOrFALSE = checkBox1.isSelected();

		if (isTrueOrFALSE) {
			System.out.println("It is selected");
		} else {
			checkBox1.click();

		}
	}
}
