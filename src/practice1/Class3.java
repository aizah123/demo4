package practice1;

public class Class3 {
	
	public static void main(String[] args) {
		
		
		
		System.out.println(Class4.name2);
		
		
		Class4 obj1 = new Class4();
		System.out.println(obj1.name1);
		
		System.out.println(obj1.age1);
		obj1.age1= 50;// reassign
		Class4.name2 = "FC";
		System.out.println(obj1.age1);
		obj1.age1 = 15;
		System.out.println(obj1.age1);
		System.out.println(obj1.salary1);
		System.out.printf("$%.2f\n",+obj1.salary1);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
