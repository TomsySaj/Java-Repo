package Assignments;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=30,temp,p=20,q=15;
		System.out.println("Before swapping a :"+a+ " b: "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a :"+a +" b: "+b);
		System.out.println("Before swapping p :"+p+ " q: "+q);
		p=p+q;
		q=p-q;
		p=p-q;
		System.out.println("After swapping p :"+p +" q: "+q);
		
		
		

	}

}
