package stringClass;

public class stringBuffer {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Java");
		
		System.out.println(s);
		
		// Method 1 append()
		s.append(" Program");
		System.out.println(s);
		
		// Method 2 Insert()
		s.insert(5, "is a programming language");
		System.out.println(s);
		
		//method 3 replace()
		
		s.replace(10, 37, "simple");
		System.out.println(s);
		
		//method 4 delete()
		s.delete(8, 10);
		System.out.println(s);
		
		//method 5 capacity()
		//s.capacity();
		//System.out.println(s.capacity());
		StringBuffer s1=new StringBuffer("");
		System.out.println(s1.capacity());
		
		System.out.println(s.capacity());
		//method 6 substring()
		
		System.out.println(s.substring(7));
		
		
		//method 7 reverse()
		System.out.println(s.reverse());
		 
		

	}

}
