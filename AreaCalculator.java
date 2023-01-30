package Class10.pathfinder_mock2_secB;
import java.util.*;
public class AreaCalculator
{
	void findArea(int len, int brd)
	{
		System.out.println("Area of Reactangle: "+((double)len*brd)+" sq. units");
	}
	void findArea(float bs, float ht)
	{
		System.out.println("Area of Triangle: "+((1.0/2.0)*bs*ht)+" sq. units");
	}
	void findArea(double rad)
	{
		System.out.println("Area of Circle: "+(Math.PI*Math.pow(rad, 2))+" sq. units");
	}
	double findArea(double x, double y)
	{
		return ((x*y)/2);
	}
	public static void main(String []args)
	{
		AreaCalculator obj=new AreaCalculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to find area of Ractangle");
		System.out.println("Enter 2 to find area of Triangle");
		System.out.println("Enter 3 to find area of Circle");
		System.out.println("Enter 4 to find area of Rhombus");
		System.out.println("Enter 5 to EXIT");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter the Length: ");
			int l=sc.nextInt();
			System.out.println("Enter the Breadth: ");
			int br=sc.nextInt();
			obj.findArea(l,br);
			break;
		case 2:
			System.out.println("Enter the Base: ");
			float bs=sc.nextFloat();
			System.out.println("Enter the Height: ");
			float ht=sc.nextFloat();
			obj.findArea(bs,ht);
			break;
		case 3:
			System.out.println("Enter the Radius: ");
			double r=sc.nextDouble();
			obj.findArea(r);
			break;
		case 4:
			System.out.println("Enter the first diagonal of the Rhombus: ");
			double a=sc.nextDouble();
			System.out.println("Enter the second diagonal of the Rhombus: ");
			double b=sc.nextDouble();
			System.out.println("Area of Rhombus: "+obj.findArea(a, b)+" sq. units");
			break;
		case 5:
			System.out.println("YOU CHOSE TO EXIT. PROGRAM TERMINATED.");
			System.exit(0);
			break;
		default:
			System.out.println("Wrong Choice Entered");
		}
		sc.close();
	}
}
