package com.tnsif.framework;

public class PrimeAcc extends ShopAcc
{
	boolean isPrime;
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime)
	{
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	public void bookproduct(float charges)
	{
		
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
   

}
