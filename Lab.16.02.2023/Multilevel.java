package Now;
                              // Multilevel inheritance
class A {
    int a;
    void displayA() {
        System.out.println("Value of a is " + a);
    }
}

class B extends A {
    int b;
    void displayB() {
        System.out.println("Value of b is " + b);
    }
}

class C extends B {
    int c;
    void displayC() {
        System.out.println("Value of c is " + c);
    }
}

public class Multilevel {
	 public static void main(String[] args) {
	        C obj = new C();
	        obj.a = 10;
	        obj.b = 20;
	        obj.c = 30;
	        obj.displayA();
	        obj.displayB();
	        obj.displayC();
	    }
	    
	}

