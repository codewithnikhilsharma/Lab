package Today;

public class Student {
  
	// Default 
		Student(){
			System.out.println(" This is Default ");
		 }
		
	   // parameterized 
		 int age;
		 String name;
		 
		 Student( int a , String n){	 
			 age = a;
			 name = n;		 
		   } 
		 
		 void show(){
			 System.out.println(age+ " "+ name);}
				 	 
		 public static void main(String[] args) {
			
			 // this object foe default
			 Student o = new Student(); 
			 // this for parameterized
			 Student ob = new Student( 22 , "Nikhil");
			 ob.show(); 
		 }
	   }

