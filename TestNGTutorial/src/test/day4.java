package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {

	@Test(groups= {"smoke"})
	public void demo6() {
		System.out.println("just a few test cases can be run using groups in all the methods");
	}
}
