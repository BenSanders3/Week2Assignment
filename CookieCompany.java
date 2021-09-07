package model;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
public class CookieCompany {
	private double averageDailyExpenses;
	private double averageDailyProfits;
	private boolean netChange;
	
	/**
	 * 
	 */
	public CookieCompany() {
		super();
	}
	/**
	 * @return the expenses
	 */
	public double getExpenses() {
		return averageDailyExpenses;
	}
	/**
	 * @param expenses the expenses to set
	 */
	public void setExpenses(double expenses) {
		this.averageDailyExpenses = expenses;
	}
	/**
	 * @return the profits
	 */
	public double getProfits() {
		return averageDailyProfits;
	}
	/**
	 * @param profits the profits to set
	 */
	public void setProfits(double profits) {
		this.averageDailyProfits = profits;
	}
	/**
	 * @return the netChange
	 */
	public boolean getNetChange() {
		return netChange;
	}
	/**
	 * @param netChange the netChange to set
	 */
	public void setNetChange(boolean netChange) {
		this.netChange = netChange;
	}
	
	
}
