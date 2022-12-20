import java.util.Arrays;
import java.util.List;
public class Unboundedwc 
{

	public static void display(List<?> list)
	{
		for(Object o:list)
		{
			System.out.println(o);
		}

	}
	public static void main(String args[])
	{
		List <Integer> l1=Arrays.asList(1,2,3);
		System.out.println("DISPLAYING THE INTEGER VALUES");
		display(l1);
		List <String> l2=Arrays.asList("ONE ","TWO ","THREE ");
		System.out.println("DISPLAYING THE STRING VALUES");
		display(l2);
	}

}
