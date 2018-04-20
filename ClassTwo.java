public class ClassTwo
{
	public static void main (String[] args)
	{
		ClassOne o1 = new ClassOne();
		ClassOne o2 = new ClassOne(4,-1);
		ClassOne o3 = new ClassOne(100,2,3);
		ClassOne Obj = new ClassOne();

		System.out.println (Obj.d); /// default
		System.out.println (Obj.e); /// public
		///System.out.println (Obj.f); *** We can't access it because it is private ***
		System.out.println (Obj.g); /// protected
	}
}