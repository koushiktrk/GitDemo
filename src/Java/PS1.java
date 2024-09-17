package Java;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS{
	
	@Test
	public void testRun()
	{
		int a =13;
		doThis();
		PS2 ps2 = new PS2(a);
		
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
	
		System.out.println(ps2.multiply());
		
		
		
	}

}
