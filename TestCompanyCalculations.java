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
public class TestCompanyCalculations {
	CompanyCalculations compCalc = new CompanyCalculations();
	CookieCompany company = new CookieCompany();
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateMonthlyExpenses() {
		company.setExpenses(500.0);
		double expenses = compCalc.calculateMonthlyExpenses(company);
		assertEquals(15000, expenses, 0.0);
	}
	
	@Test
	public void testCalculateMonthlyProfit() {
		company.setProfits(1000);
		double profits = compCalc.calculateMonthlyProfits(company);
		assertEquals(30000, profits, 0.0);
	}
	
	@Test
	public void testNetGain() {
		company.setProfits(1000);
		company.setExpenses(500);
		String netChange = "Net Gain";
		assertEquals(netChange, compCalc.calculateIncome(company));
	}
	
	public void testNetLoss() {
		company.setProfits(500);
		company.setExpenses(1000);
		String netChange = "Net Loss";
		assertEquals(netChange, compCalc.calculateIncome(company));
	}
}
