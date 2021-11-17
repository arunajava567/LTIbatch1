package com.staging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanTest {
	Loan l;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		 l=new Loan();
	}

	@AfterEach
	void tearDown() throws Exception {
		l=null;
	}

	@Test
	void testGetEmi() {
	
		int result=l.getEmi(6000);
		assertEquals(500,result);
		
		//fail("Not yet implemented");
	}
    //@Test
}
