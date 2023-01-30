package Class10.pathfinder_mock2_secB;
import java.util.*;
public class Consumer_LPG
{
	int consNo;
	String consName;
	int qty;
	void takeDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Consumer Name: ");
		consName=sc.nextLine();
		System.out.println("Enter the Consumer Number: ");
		consNo=sc.nextInt();
		System.out.println("Enter the quantity of LPG used in a month: ");
		qty=sc.nextInt();
		
		sc.close();
	}
	void calculate()
	{
		int bill=0;
		if(qty<=40)
			bill=qty*15;
		else if(qty<=100 && qty>40)
			bill=qty*18;
		else if(qty<=250 && qty>100)
			bill=qty*25;
		else if(qty>250)
			bill=qty*35;
		
		System.out.println("Net Bill Amount to be paid by the consumer: "+bill);
	}
	void display()
	{
		System.out.println("Consumer Number: "+consNo);
		System.out.println("Consumer Name: "+consName);
		System.out.println("Consumption of LPG by consumer: "+qty);
		calculate();
	}
	public static void main(String []args)
	{
		Consumer_LPG obj=new Consumer_LPG();
		obj.takeDetails();
		obj.display();
	}
}
