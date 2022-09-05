public class unit1 {
    public static void main(String[] args) {
        // Topic 1.1
        // Block comments: /* ... */ (name/date/purpose)(compiler ignores it)
        // Class Declaration: identifies the name, class name has to match the file
        // name.
        // main Method: controls all of the action in the program
        // println: move the cursor to the next line.
        // print: keep the cursor at the end of the line.
        /*
         * Programmer: Pelin Sallakci
         * Date: 9/4/2022
         * Purpose: Demonstrate the System class methods
         */
        System.out.print("AP ");
        System.out.print("CS ");
        System.out.print("A ");
        System.out.println("Rocks!");
        System.out.println("Hello World");

        // String literal: exact sequence of characters enclosed in " ".
        // Syntax/Compiler error: when we violet java syntax (misspeling, forgetting ; )
        // Logic error: it produces incorrect output. ex -using (-) sign while doing a
        // sum.

        // Topic 1.2
        // Primitive data: determines the size and type of info.
        // boolean- true, false (1 bit)
        // int- whole numbers (32)
        // double- decimal values (64)
        // Reference data type: string

        // when a variable is declared final, then it cannot be changed, it is a
        // constant.
        // final variables are named using ALL CAPS and underscores (_)
        // variable: memory location that holds a type of value.
        // variables are case sensitive, can't start with a digit, no spaces, no special
        // characters
        // camel case is used in naming variables
        // dataType variableName;
        // ex:
        // int numberOfMarbles;
        // double averageOfTestGrades;
        // boolean sugaryDrink;
        // final int tiresOnACar;

        // Topic 1.3
        // literal- representation of a fixed numeric value.
        // string literal- between ("")
        // arithmetic operators: +, -, /, *, %
        // mixed operations will result in double.

        // Priority order: 1. () 2. *, %, / 3. +, -
        // Exception error: ex- when n/0 --> Arithmetic Exception.
        // When a number is divided by zero in a operation (diger hicbir islem
        // yapilmiyor, direk error veriyor)
        // Assignment Operator (=): it assigns the value on the right hand side to the
        // one in left.
        // assignment operator works from right to left.

        // Topic 1.4
        // Compound Assignment Operators: +=, -=, *=, /=, %=
        // they can be used in place of assignment operator.
        // ex: x+=7 == x=x+7 : adding 7 to x.
        // increment operator(++): x++ adds 1 to x
        // decrement operator(--): x-- substracts 1 from x

        // describing behavior:
        int x = 23;
        // defining an int variable x, intializing it to 23.
        int y = 17;
        // defining an it y, initializing it to 17.
        x *= 4;
        // taking the current value of x, multiplying x with 4 and assigning th result
        // back to x.
        y++;
        // taking the current value of y, add 1 to x, assign it back to y.
        x /= 3;
        // taking the current value of x, dividing x by 3, assigning the result back to
        // x.
        y -= 9;
        // taking the current value of y, substraction 9 from y, assigning the result to
        // y.
        x %= y;
        // taking the current value of x, finding x modulus y, assigning the result to
        // x.
        System.out.println(x);

        // Topic 1.5
        // casting: used to temporarily change the type of variable.

        // data types are limited in storing information.
        // int: Integer.MAX_VALUE (2147483647) -10 digits
        // Integer.MIN_VALUE(-2147483648)
        // double: up to 14-15 digits
        // overflow error: When we try to store numbers that are too large than the
        // actual values it will not provide the value that we expect.
    }

}
