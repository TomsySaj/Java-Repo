package Assignments;

public class ReverseUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=234,c=0;
		while(a!=0)
		{
			int b=a%10;
			c=c*10+b;
			a=a/10;
			
			
			
		}
		System.out.println(c);

	}

}
