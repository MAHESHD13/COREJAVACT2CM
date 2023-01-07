package com.tnsif.framework;

public class NormalAcc extends ShopAcc
{
	public float deliveryCharge;
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge)
	{
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}
    public void bookproduct(float charges)
    {
    	
    }
	@Override
	public String toString() 
	{
		return "NormalAcc [deliveryCharge=" + deliveryCharge + "]";
	}

	
	

}
