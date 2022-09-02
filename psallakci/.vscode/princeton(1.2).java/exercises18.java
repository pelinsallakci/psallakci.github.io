public class exercises18 {
    public static void main(String[] args) {
        // finding the distance of a (x,y point ) to origin.
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // finding distance between (x,y) to origin
        double distance = Math.sqrt(x * x + y * y);

        // printing the distance
        System.out.println(distance);
    }
}
