package Class10.pathfinder_mock2_secB;
import java.util.*;
public class Cyclic_vowel_rotation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word: ");
		String wrd=sc.next();
		sc.close();
		wrd.trim();
		wrd=wrd.toLowerCase();
		int len=wrd.length();
		String nwrd="";
		for(int i=0;i<len;i++)
		{
			char ch=wrd.charAt(i);
			if("aeioua".indexOf(ch)>=0)
			{
				ch="aeioua".charAt("aeioua".indexOf(ch)+1);
			}
			nwrd=nwrd+ch;
		}
		System.out.println("New Word: "+nwrd);
	}
}
