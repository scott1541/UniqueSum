import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueSumTest{
	@Test
	public void test1(){
		UniqueSum sum1 = new UniqueSum();
		assertEquals(3, sum1.method(1, 2, 2)) ;
		
		
	}

	@Test
	public void test2(){
		UniqueSum sum1 = new UniqueSum();
		assertEquals(3, sum1.method(1, 2, 3)) ;
		
		
	}
	@Test
	public void test3(){
		UniqueSum sum1 = new UniqueSum();
		assertEquals(10, sum1.method(1, 5, 4)) ;
		
		
	}

	@Test
	public void test4(){
		UniqueSum sum1 = new UniqueSum();
		assertEquals(0, sum1.method(1, 1, 1)) ;
		
		
	}

	
}
