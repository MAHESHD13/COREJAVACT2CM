package com.tnsif.framework;

public class ShopAcc
{
	int accNo;
	String accNm;
	float charges;
    public ShopAcc(int accNo,String accNm,float charges)
    {
    	super();
    	this.accNo=accNo;
    	this.accNm=accNm;
    	this.charges=charges;
    }
    public void bookproduct(float charges) 
    {
    	
    	
    }
    public void items(float charges)
    {
    	
    }
	@Override
	public String toString() 
	{
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
}
