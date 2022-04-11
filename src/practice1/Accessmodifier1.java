package practice1;

public class Accessmodifier1 {
	
           int age1 = 30;
           String name1 = "Fouzia";
           double salary1 = 500.632;
           
          public int age2 = 36;
           static String name2 = "KEY";
           public static double salary2 = 600.365;
	
	public static void main(String[] args) {
		
		int age3 = 35;
		String name3 = " World";
		
		Accessmodifier1 obj = new Accessmodifier1();
		
		
		System.out.println(obj.age1);
		System.out.println(Accessmodifier1.name2);
		System.out.println(obj.age2);
		System.out.println(age3);

	
	AccessModdifier2 obj3 = new AccessModdifier2();
	System.out.println(AccessModdifier2.id2);
	System.out.println(obj3.id);
	
	
	Class1 obj5 = new Class1();
		
		
		
	}
	
	
	
	

}
