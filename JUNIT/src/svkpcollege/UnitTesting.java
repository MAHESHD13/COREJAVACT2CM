package svkpcollege;
import static org.junit.Assert.assertEquals;
public class UnitTesting 
{
int Square(int x)
{
	return x*x;
}
	public void TestUnit()
	{
		UnitTesting obj = new UnitTesting();
		int output=obj.Square(5);
		assertEquals(25,output);
		
	}
	
}
