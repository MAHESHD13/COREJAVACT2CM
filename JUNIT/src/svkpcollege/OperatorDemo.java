package svkpcollege;
@FunctionalInterface
interface Operator
{
	public int operate(int num1,int num2);
}
public class OperatorDemo
{

	public static void main(String[] args) 
	{
		Operator op= (num1,num2)->num1+num2;
		int sum=op.operate(20, 30);
        System.out.println(" SUM OF TWO PARAMETERS IS = "+sum);
	}

}
