package TestNg;

import org.testng.annotations.Test;

public class groupingTest {
	
	@Test(groups= {"group1","group2"})
	public static void Test1() {
		System.out.println("test_method1 called");
	}
	@Test(groups= {"group2"})
	public static void Test2() {
		System.out.println("test_method2 called");
	}
	@Test(groups= {"group1"})
	public static void Test3() {
		System.out.println("test_method3 called");
	}
}
