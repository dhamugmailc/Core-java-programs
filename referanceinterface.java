package practice;
interface A {
    void someMethod();
}

class b implements A {
    @Override
    public void someMethod() {
        System.out.println("Implementation of someMethod");
    }
}


   


public class referanceinterface {
	 public static void main(String[] args) {
	       A a; // Declaring a reference variable of type MyInterface
	        a = new b(); // Assigning an object of MyClass to the reference variable
	        a.someMethod(); // Calling the method on the object through the interface reference
	    }
}
