package svkp;
@FunctionalInterface
interface Operator1
{
	public int Operate(int num1,int num2);
}
public class OperatorDemo1
{
	public static void main(String[] args)
	{
		Operator1 op=(num1,num2) -> num1+num2;
		int sum=op.Operate(20,30);
		System.out.println("SUM: "+sum);
	}
}
