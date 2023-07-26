package TestNG;

import org.testng.annotations.Test;

public class InvocationCounts {
	
	@Test (priority=1, invocationCount=4)
	void openApp()
	{
		System.out.println("kurma");
	}

}
