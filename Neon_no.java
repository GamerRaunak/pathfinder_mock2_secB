package Class10.pathfinder_mock2_secB;
import java.util.*;
public class Neon_no
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		sc.close();
		int sq_num=num*num;
		int d=0,sum=0;
		while(sq_num!=0)
		{
			d=sq_num%10;
			sum+=d;
			sq_num=sq_num/10;
		}
		if(sum==num)
			System.out.println(num+" is a Neon Number.");
		else
			System.out.println(num+" is not a Neon Number.");
	}
}
