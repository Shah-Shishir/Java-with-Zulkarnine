public class ClassOne
{
	int a;
	public int b=20;
	private int c;
	int d=100;
	public int e=200;
	private int f=300;
	protected int g = 400;

	public ClassOne ()
	{
		System.out.println ("Parameter chara constructor.");
	}

	public ClassOne (int a, int b)
	{
		System.out.println ("a + b = " +(a+b));
	}

	public ClassOne (int a, int b, int c)
	{
		System.out.println ("a * b * c = " +(a*b*c));
	}

	public int getA ()
	{
		return 10;
	}

	public int getB ()
	{
		return b;
	}

	public void setC (int x)
	{
		c = x;
	}

	public int getC ()
	{
		return c;
	}

	public static void main (String[] args)
	{
		ClassOne ob1 = new ClassOne();
		ClassOne ob2 = new ClassOne(1,2);
		ClassOne ob3 = new ClassOne(1,2,3);

		ClassOne Obj = new ClassOne();

		System.out.println (Obj.getA());
		System.out.println (Obj.getB());
		Obj.setC(54);
		System.out.println (Obj.getC());
	}
}