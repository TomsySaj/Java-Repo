package thiskeyword;

public class ThisVariable {

	public static void main(String[] args) {
		ThisVariable ob = new ThisVariable(29);
		

	}
	int age;
	public ThisVariable(int a) {
			this.age = a;
			System.out.println(this.age);
		}

}
