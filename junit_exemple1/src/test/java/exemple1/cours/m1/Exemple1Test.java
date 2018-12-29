package exemple1.cours.m1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exemple1Test {
	Exemple1 e = new Exemple1();
	
	
	@Test
	public void test1F1() {		
		assertEquals(50, e.f1(30, 10));
	}
	
	@Test
	public void test2F1() {		
		assertEquals(1, e.f1(3, 2));
	}
	@Test
	public void test3F1() {		
		assertEquals(5, e.f1(2, 3));
	}
	@Test
	public void test4F1() {		
		assertEquals(0, e.f1(5, 5));
	}
	@Test
	public void test5F1() {		
		assertEquals(-6, e.f1(2,8));
	}

}
