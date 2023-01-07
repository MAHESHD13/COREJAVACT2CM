package com.tnsif.framework;

public interface ShopFactory 
{
	public abstract PrimeAcc getNewPrimeAccount(int accNo,String accNm,float charges,boolean isPrime);
	public abstract NormalAcc getNewNormalAccountint(int accNo,String accNm,float charges,float deliverycharge);

}
