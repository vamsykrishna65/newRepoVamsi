package org.hmh.ODMSAutomation;

import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test(groups="group1")
	public void m1() {
		System.out.println("hai"+System.getProperty("hai"));
	}
	
	@Test
	public void m2() {
		System.out.println("hai from m2"+Thread.currentThread().getId());
	}
	@Test
	public void m3() {
		System.out.println("hai from m3"+Thread.currentThread().getId());
	}
	@Test
	public void m4() {
		System.out.println("hai from m4"+Thread.currentThread().getId());
	}
	@Test
	public void m5() {
		System.out.println("hai from m5"+Thread.currentThread().getId());
	}
}
