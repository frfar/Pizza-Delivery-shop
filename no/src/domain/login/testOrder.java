package domain.login;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testOrder {

	@Test
	void test() {
		Pizza cc = new Pizza();
		orderController o = new orderController();
		cc.setPepp(1);
		cc.setV(1);
		cc.setM(1);
		
		
		PizzaDao test = new PizzaDao();
		int stat = test.order(cc);
		assertEquals(1, stat);
		//assertEquals(o.y, )
	}

}
