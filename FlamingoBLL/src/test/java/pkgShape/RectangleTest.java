package pkgShape;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void test() {
		Rectangle rec1 = new Rectangle(10,20);
		
		assertTrue(rec1.area() == 200);
		
	}

}
