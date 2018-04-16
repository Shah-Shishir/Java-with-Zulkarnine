import java.util.Scanner;

public class Switch
{
	public static void main (String[] args)
	{
		int a;

		Scanner in = new Scanner (System.in);
		a = in.nextInt();

		switch (a)
		{
			case 1:
				System.out.println ("It is one.");
				break;
			case 2:
				System.out.println ("It is two.");
				break;
			case 3:
				System.out.println ("It is three.");
				break;
			case 4:
				System.out.println ("It is four.");
				break;
			case 5:
				System.out.println ("It is five.");
				break;
			case 6:
				System.out.println ("It is six.");
				break;
			case 7:
				System.out.println ("It is seven.");
				break;
			case 8:
				System.out.println ("It is eight.");
				break;
			case 9:
				System.out.println ("It is nine.");
				break;
			case 10:
				System.out.println ("It is ten.");
				break;
			default:
				System.out.println ("Eat muri.");
				break;
		}
	}
}