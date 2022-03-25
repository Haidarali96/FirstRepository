package testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

public class BasicClass {
	public class Subclass{
		@Test(priority=1,enabled=true)
		public void method11() {
			
			System.out.println("I am from subclass");
			SoftAssert sassert=new SoftAssert();
			sassert.assertAll();
			sassert.assertEquals("hi", "hello");
			System.out.println("iam after assert of test1");
			
		}
		
	}
	@Parameters("one")
	@Test()
public void method1(String one) {
		System.out.println("I am from method one"+one);
		//throw new SkipException("assert equals");
		
	}
	@BeforeSuite()
	public void method2() {
		System.out.println("I am from Before Suite");
	}
	@BeforeTest
	public void method3() {
		System.out.println("I am from BeforeTest");
	}
	@BeforeClass()
	public void method4() {
		System.out.println("I am from BeforeClass");
	}
	@BeforeMethod()
	public void method5() {
		System.out.println("I am from BeforeMethod");
	}
	@AfterMethod()
	public void method6() {
		System.out.println("I am from AfterMethod");
	}
	@AfterClass
	public void method7() {
		System.out.println("I am from AfterClass");
	}
	@AfterTest()
	public void method8() {
		System.out.println("I am from AfterTest");
		
	}
	@AfterSuite()
	public void method9() {
		System.out.println("I am from AfterSuite");
	}
	@Test(priority=2,groups= {"a"})
	public void Method10() {
		System.out.println("I am from method 10");
		Assert.assertFalse(false);
		System.out.println("iam after assert of test2");
	}
	
	

}
