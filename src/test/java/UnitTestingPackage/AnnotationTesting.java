package UnitTestingPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class AnnotationTesting {
	@BeforeMethod
	public void beforeClass() {
        
        //System.out.println("Executing Before test");
    }
    
    @Test
    public void test1() {
        System.out.println("Executing Test1");
     }
    
        @Test
        public void test2() {
            System.out.println("Executing Test2");
    }
    
    @AfterMethod
	public void afterClass() {
        System.out.println("Executing After Test");
    }

}
