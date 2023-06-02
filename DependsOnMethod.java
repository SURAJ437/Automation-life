package ngtest;

import org.testng.annotations.Test;
//How to use dependsOnMethod argument in the testNG Class
public class DependsOnMethod {
	@Test
	public void createCustomerTest() {
		System.out.println("Execute HDFC create customer test");
		int[] arr = {1,2,3};
		System.out.println(arr[1]);
	}
	//Its help us to check the dependent test case is pass or fail
	//If dependent test-script get pass, execution will continue
	//Ifdependent test script get failed, It will skip the dependent test Script execution
	@Test(dependsOnMethods = "createCustomerTest")
	public void modifyCustomerTest() {
		System.out.println("execute modify HDFC to Airtel Customer Test");	
	}
	@Test(dependsOnMethods = "modifyCustomerTest")
	public void deleteCustomerTest() {
		System.out.println("execute delete Airtel Customer Test");
	}
}
