//************************************************************************************
//	Commission.java
//
//	Represents a worker on commission pay.
//************************************************************************************

public class Commission extends Hourly
{
	private double totalSales;
	private double commissionRate;
	
	public Commission (String eName, String eAddress, String ePhone,
			String socSecNumber, double rate, double inputCommissionRate)
	{
		super (eName, eAddress, ePhone, socSecNumber, rate);
		commissionRate = inputCommissionRate;
	}
	
	// add sales to the commission employee, so that it can be paid based on sales
	public void addSales (double inputAdditionalSales)
	{
		totalSales += inputAdditionalSales;
	}
	
	// pays the employee
	public double pay()
	{
		double payment = super.pay() + (totalSales*commissionRate);
		
		return payment;
	}
	
	// represents a commission worker, referencing the parent class
	public String toString()
	{
		String returnString = super.toString();
		returnString += "\nTotal Sales: " + totalSales;
		
		return returnString;
	}
}