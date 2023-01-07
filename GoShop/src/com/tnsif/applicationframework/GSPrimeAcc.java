package com.tnsif.applicationframework;

import com.tnsif.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	
	private final float charges=0;
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime)
	{
		super(accNo, accNm, charges, isPrime);
	}
	
	
	public void bookproduct(float charges)
	{
		System.out.println(" DEAR PRIME USER ,YOUR PRODUCT CHARGES ARE : "+charges);
	}
	@Override
	public String toString() 
	{
		return "GSPrimeAcc [charges=" + charges + "]";
	}	 
    
}
