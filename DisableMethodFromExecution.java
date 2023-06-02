package ngtest;

import org.testng.annotations.Test;

public class DisableMethodFromExecution {
	@Test
	public void atestCase_01Test() {
		System.out.println("TestCase_01 Executed");
	}
	@Test
	public void btestCase_02Test() {
		System.out.println("TestCase_02 Executed");
	}
	@Test(enabled = false)
	public void ctestCase_03Test() {
		System.out.println("TestCase_03 Executed");
	}
}
