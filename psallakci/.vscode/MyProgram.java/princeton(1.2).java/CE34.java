public class CE34 {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        // takes three values for x, y, z.

        int resultmin = Math.min(x, Math.min(y, z));
        // finds the min value
        int resultmax = Math.max(x, Math.max(y, z));
        // finds the max value
        int resultmedian = x + y + z - resultmin - resultmax;
        // finds the median value

        System.out.println(resultmin);
        System.out.println(resultmedian);
        System.out.println(resultmax);
        // prints the values in ascending order.
    }
}
