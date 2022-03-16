package RestTesting;

import org.testng.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Restjunit {
	@BeforeTest
	public void BT() {
		
		String Name ="Vinay";
		String FName ="Arjuna";
		
		Assert.assertEquals(FName, Name);
	}
	@Test
	public void testCase1()
	{
		System.out.println("this is the first method");
	}
	@AfterTest  void AT()
	{
		System.out.println("this is after method");
	}

}
