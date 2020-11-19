package STEPS_03;

import org.junit.Assert;

import io.cucumber.java.en.Given;


public class Steps_03 {
	@Given("Test Case is passed")
	public void test_case_is_passed() {
		System.out.println("test case is supposed to be passed");
		 Assert.assertEquals("Test assertion is passed", true,true);
    

	}

	@Given("Test case is failed")
	public void test_case_is_failed() {
		 System.out.println("This test case is supposed to be failed.");
	        Assert.assertEquals("Test assertion is failed", true,false);
	}

}
