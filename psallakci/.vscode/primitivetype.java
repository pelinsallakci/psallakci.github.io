public class primitivetype {
   // There are 2 types in java: Pirmitive and Reference Types
   // difference between int and Integer: 
   // int is a primitive type, Integer (behaves as a wrapper class)is a class type.
   // wrapper classes provides to use primitive types as objects. (int to an object, object to an int)
   // Integer takes 128 bits to store int value.
    int number; // a Primitive Type
    // we can assign string to an object of Integer type using Integer(String)constructor
    // parseInt(String to convert String literal to an int)
	boolean statement; // a Primitive Type
	double decimalnumber; // a Primitive Type
	String name; // a Reference Type
	System.out.println(number);
	System.out.println(statement);
	System.out.println(decimalnumber);
	System.out.print(name);
    // the variables are not initialized so it gives error.

}
