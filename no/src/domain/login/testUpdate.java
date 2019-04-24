package domain.login;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testUpdate {

	@Test
	void test() {
		Customer cc = new Customer();
		cc.setUsername("theDude");
		cc.setEmail("theDude@utd.com");
		cc.setName("Angela");
		cc.setPassword("fa");
		
		CustomerDaoImpl test = new CustomerDaoImpl();
		int stat = test.update(cc);
		assertEquals(1, stat);
		
	}
	
	@Test
	void test1() {
	Customer ccc = new Customer();
	ccc.setUsername("theDude1");
	ccc.setEmail("theDude1@utd.com");
	ccc.setName("Angela1");
	ccc.setPassword("fa1");
	
	CustomerDaoImpl test = new CustomerDaoImpl();
	int stat = test.register(ccc);
	assertEquals(1, stat);
	}

}
