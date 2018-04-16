import java.util.Scanner;

public class TryCatchFinally
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in);
		int n,ans;

		while (in.hasNext())
		{
			n = in.nextInt();

			try
			{
				ans = 100/n;
				System.out.println (ans);
			}
			catch (Exception Hudai)
			{
				Hudai.printStackTrace();
				//System.out.println ("Program ti shesh holo :D");
			}
			finally
			{
				System.out.println ("Program ti shesh holo :D");
			}
		}
	}
}