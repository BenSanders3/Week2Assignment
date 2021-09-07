package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CompanyCalculations;
import model.CookieCompany;
	
/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
public class TestCompany {
	CompanyCalculations compCalc = new CompanyCalculations();
	CookieCompany company = new CookieCompany();
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		company.setExpenses(500);
		company.setProfits(1000);
	}

	@Test
	public void testIfSuccessfulCompany() {
		assertTrue("Net Gain" == compCalc.calculateIncome(company));
	}
	
	@Test
	public void testIfUnsuccessfulCompany() {
		assertFalse("Net Loss" == compCalc.calculateIncome(company));
	}

}
