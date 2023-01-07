package com.tnsif.applicationframework;

import com.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc 
{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		
	}
	public void bookproduct(float charges)
	{
		System.out.println(" DEAR NORMAL USER YOUR PRODUCT CHARGEA ARE:"+charges+" WITH DELIVERY CHARGES " +deliveryCharge);
		
	}
	@Override
	public String toString() 
	{
		return "GSNormalAcc []";
	}
	
	

}
