import java.util.*;
abstract class Shape
{
	abstract void draw();	
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println(" DRAWING RECTANGLE ");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println(" DRAWING CIRCLE ");		
	}
}
	
public class WildcardGenerics
{
	public static void drawShapes(List<? extends Shape>lists)
	{
		for(Shape s:lists)
		{
			s.draw();
		}
	}

	public static void main(String[] args) 
	{
		List<Rectangle> list1=new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		List<Circle> list2=new ArrayList<Circle>();
		list2.add(new Circle());
		list2.add(new Circle());
		drawShapes(list1);
		drawShapes(list2);
	}

}
