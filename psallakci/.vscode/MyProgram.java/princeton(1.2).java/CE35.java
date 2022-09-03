public class CE35 {
    public static void main(String[] args) {
        String dragon0 = "F";
        // instruction 1

        String curves0 = "F";
        String dragon1 = dragon0 + "L" + curves0;
        // instruction 2

        String curves1 = dragon0 + "R" + curves0;
        String dragon2 = dragon1 + "L" + curves1;
        // instruction 3

        String curves2 = dragon1 + "R" + curves1;
        String dragon3 = dragon2 + "L" + curves2;
        // instruction 4

        String curves3 = dragon2 + "R" + curves2;
        String dragon4 = dragon3 + "L" + curves3;
        // instruction 5

        String curves4 = dragon3 + "R" + curves3;
        String dragon5 = dragon4 + "L" + curves4;
        // instruction 6

        System.out.println(dragon0);
        System.out.println(dragon1);
        System.out.println(dragon2);
        System.out.println(dragon3);
        System.out.println(dragon4);
        System.out.println(dragon5);
        // prints the instructions to draw the dragon curve from 0 through 5 (the code
        // will totally have 6 instructions).
    }
}