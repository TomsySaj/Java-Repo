package thiskeyword;

public class ThisMethod {

	public static void main(String[] args) {
		ThisMethod ob=new ThisMethod();
		ob.name("Tomsy");
		
		// TODO Auto-generated method stub

	}
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void name(String  s)
	{
		System.out.println(s);
		this.sum(20, 30);
	}
	

}
