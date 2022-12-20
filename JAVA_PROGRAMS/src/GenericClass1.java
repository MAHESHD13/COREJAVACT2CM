import java.util.*;
public class GenericClass1 
{
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("RISE ROAR REVOLT");
		list.add("ALA VAIKUNTAPURAMLOO");
		list.add("RANGASTHALAM");
		list.add("ARAVINDHA SAMEETHA VEERA RAGHAVAREDDY");
		list.add("SARKARU VAARI PATA");
		String s=list.get(1);
		//System.out.println("element is :"+s);
        Iterator<String> itr=list.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
	}

}
