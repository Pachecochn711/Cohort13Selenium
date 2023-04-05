package basicSeleniumTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Utilities.BaseClass;

public class openBrowserUsingDriverClass {

	@Before
	public void beforeMethod() {
		BaseClass.getDriver();
		
	}
	@Test
	public void test1() {
		String titlePage = BaseClass.getDriver().getTitle();
		System.out.println(titlePage);
		
				
		
	}
	@After
	public void afterMethod() {
		
		BaseClass.closeDrive();
	}
}
