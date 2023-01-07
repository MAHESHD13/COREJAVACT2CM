package com.tnsif.shopmain;

import com.tnsif.applicationframework.GSNormalAcc;
import com.tnsif.applicationframework.GSPrimeAcc;
import com.tnsif.applicationframework.GSShopFactory;

public class ShopMain 
{

	public static void main(String[] args)
	{
		GSShopFactory gsfactory=new GSShopFactory();
		//gsfactory.getNewPrimeAccount(101,"RAM", 1925, true);
		//gsfactory.getNewNormalAccountint(102, "ARJUN", 6777, 50);

		GSPrimeAcc prime=new GSPrimeAcc(101, "RAM", 1925, true);
		prime.bookproduct(7893);
		
		
		GSNormalAcc normal=new GSNormalAcc(102,"ARJUN",6777,50);
		normal.bookproduct(9676);
		
		prime.toString();
		normal.toString();
	}

}
