package test.exercise_1_1_4;

import main.exercise_1_1_4.TypicalArrayProcess;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TypicalArrayProcessTest {

	TypicalArrayProcess tap = null;
	double a[] = {1.0,2.2,3.5,5.4,4.3,3.1,2.1,8.2};

	@Before
	public void init(){
		tap = new TypicalArrayProcess();
	}

	@Test
	public void testfindMax() {
		Assert.assertEquals(8.2, tap.findMax(a), 0.001);
	}
	
	@Test
	public void testavg(){
		System.out.println(tap.avg(a));
	}
	
	@Test
	public void testcopy(){
		Assert.assertArrayEquals(a, tap.copy(a), 0.001);
	}
	
	@Test
	public void testoverturn(){
		
		for(double d:tap.overturn(a) )
		System.out.print(d+" ");
	}
	
	@Test
	public void testsqrt(){
		
		double c = 9.7;
		
		Assert.assertEquals(Math.sqrt(c), tap.sqrt(c), 1e-15);
		
		c = -1;
		
		Assert.assertEquals(Math.sqrt(c), tap.sqrt(c), 1e-15);
		System.out.println(tap.sqrt(c));
	}
	
	@Test
	public void testsyso(){
		System.out.println( ( 0 + 15 ) / 2 );
		System.out.println(2.0e-6 * 100000000.1 );
		System.out.println( true && false || true && true );
		System.out.println((1 + 2.236)/2 );
		System.out.println(1 + 2 + 3 + 4.0);
		System.out.println( 4.1 >= 4 );
		System.out.println( 1 + 2 + "3");
	}
}
