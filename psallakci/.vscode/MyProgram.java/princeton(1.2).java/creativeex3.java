public class creativeex3 {
    public static void main(String[] args) {
        // finding the day of the week
        int m = 1;
        int d = 0;
        int y = 2000;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        System.out.println(d0);
    }
}
