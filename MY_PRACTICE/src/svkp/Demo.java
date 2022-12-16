package svkp;
@FunctionalInterface
interface print
{
	String getValue();
}
public class Demo
{

	public static void main(String[] args) 
	{
		print p;
		p=()-> "WELCOME TO LAMBDA EXPRESSIONS";
        System.out.println(p.getValue());
	}

}
