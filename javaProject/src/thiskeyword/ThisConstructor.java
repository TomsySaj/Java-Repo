package thiskeyword;

public class ThisConstructor {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ThisConstructor o1=new ThisConstructor();
	}
	public ThisConstructor()
	{
		this("Tomsy");
		int a=10;
		System.out.println(a);
	}
	public ThisConstructor(String name)
	{
		this(100,100);
		System.out.println(name);
	}
	public ThisConstructor(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	

}
