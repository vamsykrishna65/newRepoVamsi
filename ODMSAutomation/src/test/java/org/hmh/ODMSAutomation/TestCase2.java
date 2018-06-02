package org.hmh.ODMSAutomation;

import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test
	public void m1() {
		System.out.println("TestCase2 hai from m1"+Thread.currentThread().getId());
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
