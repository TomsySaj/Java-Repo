package Assignments;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=34;
		if (total<40)
		{
			System.out.println("Failed:(");
		}
		else if (total>40 && total<60 )
		{
			System.out.println("Grade D");
		}
		else if (total>61 && total<70 )
		{
			System.out.println("Grade C");
		}
		else if (total>71 && total<80 )
		{
			System.out.println("Grade B");
		}
		else if (total>81 && total<100 )
		{
			System.out.println("Grade A !!!!!!!!!!");
		}
		

	}

}
