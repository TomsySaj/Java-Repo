package Assignments;

public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
System.out.print(a+" ");
System.out.print(b+ " ");
for (int i=1;i<10;i++)
{
int c=a+b;
a=b;
b=c;
System.out.print(c +" ");
}
	}

}
