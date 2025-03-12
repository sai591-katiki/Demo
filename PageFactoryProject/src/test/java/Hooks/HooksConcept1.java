package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksConcept1 {
	@Before
	public void method1() {
		System.out.println("Before Scenario");
	}
	
	@BeforeStep
	public void method2() {
		System.out.println("Before each Step of the Scenario");
	}
	
	@AfterStep
	public void method3() {
		System.out.println("After each Step of the Scenario");
	}
	
	@After
	public void method4() {
		System.out.println("After Scenario");
	}
}
