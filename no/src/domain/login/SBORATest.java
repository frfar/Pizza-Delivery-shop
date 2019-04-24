package domain.login;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SBORATest {

	@Test
	void testCalculatePrice() {
		orderController oc = new orderController();
		double output = oc.calcPrice(0, 0, 1);
		assertTrue(9.7425 == output);
	}
	
	@Test
	void testSendOrderMsg() {
		orderController oc = new orderController();
		String output = oc.successMessage(true);
		assertTrue(output.equals("Order confirmed!"));
	}

	@Test
	void testNumberCheck() {
		orderController oc = new orderController();
		int output = oc.isANumber("27");
		int output2 = oc.isANumber("Sup");
		assertTrue(output == 27);
		assertTrue(output2 == 0);
	}
}
