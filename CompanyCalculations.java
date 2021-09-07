package model;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
public class CompanyCalculations {
	
	public double calculateMonthlyExpenses(CookieCompany cookieCompany) {
		double monthlyExpenses = 0;
		monthlyExpenses = cookieCompany.getExpenses() * 30;
		return monthlyExpenses;
	}
	
	public double calculateMonthlyProfits(CookieCompany cookieCompany) {
		double monthlyProfits = 0;
		monthlyProfits = cookieCompany.getProfits() * 30;
		return monthlyProfits;
	}
	
	public String calculateIncome(CookieCompany cookieCompany) {
		if (cookieCompany.getProfits() - cookieCompany.getExpenses() > 0) {
			return "Net Gain";
		} else {
			return "Net Loss";
		}
	}
}
