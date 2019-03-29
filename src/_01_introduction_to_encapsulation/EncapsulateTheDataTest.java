package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {
	EncapsulateTheData e = new EncapsulateTheData();
	@Test
	void test() {
		e.setItemsReceived(20);
		assertEquals(20, e.getItemsReceived());
		e.setItemsReceived(-10);
		assertEquals(0, e.getItemsReceived());
		e.setDegrees(180);
		assertEquals(180, e.getDegrees());
		e.setDegrees(-10);
		assertEquals(-1, e.getDegrees());
		e.setClature("hello");
		assertEquals("hello", e.getClature());
		e.setClature("");
		assertEquals(" ", e.getClature());
		Object o = new Object();
		e.setObject(o);
		assertEquals(o, e.getObject());
		e.setObject("hello");
		assertEquals(e.getObject(), e.getObject());
		
	}

}
