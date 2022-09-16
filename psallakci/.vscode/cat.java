// constructor ve method arasindaki farklar:
// constructor sadece class name'ini alir, methodlara istedigimiz ismi verebiliriz.
// classdaki attribute ile constructordaki attribute ayni isimde oldugu icin olusturulamaz.

public class cat { // the cat class is created
    private int age; // instance variable
    private int weight; // instance variable
    private String name; // instance variable

    public cat() {
        age = 0; // initialized attribute
        weight = 0; // initialized attribute
        name = " "; // initialized attribute
    }

    public cat(int a, int w, String n) { // this is a default constructor with a (formal) parameter list.
        age = a; // age is being defined by another variable.
        weight = w; // age is being defined by another variable.
        name = n; // age is being defined by another variable.
    }

    public boolean isSleeping() { // (behavior)this is a non-void method which returns something.
        return isSleeping(); // returns the boolean value.
    }

    public void jump() { // (behavior)void method performs a task, doesn't return a thing.
        System.out.println(name + "jumped 2 cm's"); // performs the printing task.
    }

    public void meow() {
        System.out.println(name + "is meowing"); // performs the printing task.

    }
}
