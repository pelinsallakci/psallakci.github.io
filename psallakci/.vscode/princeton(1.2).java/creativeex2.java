public class creativeex2 {
    public static void main(String[] args) {
        // finding uniform random numbers
        int x = (int) Math.random();
        int y = (int) Math.random();
        int z = (int) Math.random();
        int a = (int) Math.random();
        int b = (int) Math.random();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println((x + y + z + a + b) / 5);
        System.out.println(Math.min(x, b));
        System.out.println(Math.max(x, b));
    }

}