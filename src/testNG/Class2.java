package testNG;

import org.testng.annotations.Test;

public class Class2 {

	@Test
	public void Day4()
	{
		System.out.println("Day4");
	}
	
	@Test(groups= {"smoke"})
	public void Day3()
	{
		System.out.println("Day3");
	}
}
