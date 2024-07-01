package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void Demo(){
		System.out.println("Using test NG");
	}
	
	@BeforeTest
	public void prequisite() {
		System.out.println("I will run first");
	}
	@BeforeSuite
	public void runbeforesuite() {
		System.out.println("this should run before the suite");
		
	}
    @AfterSuite //suite is the whole test
    public void runaftersuite() {
    	System.out.println("this should run after the suite");
    }
    }
