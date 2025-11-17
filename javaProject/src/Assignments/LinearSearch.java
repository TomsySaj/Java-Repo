package Assignments;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,60,56,24,0,7};
		int key=0,i;
		for(i=0;i<6;i++)
		{
			if(a[i]==key)
			{
				System.out.println("Number is found in the position"+(i+1));
				break;
			}
		}
		if(i==6)
		{
			System.out.println("Not in the list");
		}

	}

}
