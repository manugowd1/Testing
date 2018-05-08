package com.sathya;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSample {
	@Before
	public void test1(){
		System.out.println("before");
		
	}
	@BeforeClass
	public static void test3(){
		System.out.println("manohar");
	}

	@Test
	public void test() {
		System.out.println("gfhgfehdf");
	}
	@Test
	public void test2() {
		System.out.println("manu");
	}

}
