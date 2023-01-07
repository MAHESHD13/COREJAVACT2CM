package com.tnsif.applicationframework;

import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.ShopFactory;

public class GSShopFactory implements ShopFactory
{

	@Override
	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime)
	{
		GSPrimeAcc gsprime=new GSPrimeAcc(accNo, accNm, charges, isPrime);
		
		return gsprime;
	}

	@Override
	public GSNormalAcc getNewNormalAccountint(int accNo, String accNm, float charges, float deliverycharge) 
	{
		GSNormalAcc gsnormal=new GSNormalAcc(accNo,accNm,charges,deliverycharge);
		
		return gsnormal;
	}
	

}
