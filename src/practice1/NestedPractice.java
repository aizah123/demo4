package practice1;
// parent class
public class NestedPractice {
	
	String name = "Deeba";
	int id = 120;
	
	 static String name1 = "Deeba1";
	 static int id1 = 125;
	
	
	// child class
	public  static class Nested1{
		
		
		
		String name2= "Aizah";
		static double wage = 45;
		
		// child class
		public static void main(String[] args) {
			NestedPractice obj = new NestedPractice();
			
			System.out.println(NestedPractice.id1);
			System.out.println(obj.id);
			Nested1 obj1 = new Nested1();
			System.out.println(obj1.name2);
			System.out.println(Nested1.wage);
			
			
			
		}
		
		
		
	}
	//parent method
	
	public static void main (String [] args) {

		
		
		
	}

}



	
