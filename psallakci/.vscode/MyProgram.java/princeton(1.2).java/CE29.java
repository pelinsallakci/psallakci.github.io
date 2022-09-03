public class CE29 {
    public static void main(String[] args) {
        // finding the day of the week

        int month = Integer.parseInt(args[0]);
        // takes a month as an input
        int day = Integer.parseInt(args[1]);
        // takes a day as an input
        int year = Integer.parseInt(args[2]);
        // takes a year as an input

        int year0 = year - (14 - month) / 12;
        int x = year0 + year0 / 4 - year0 / 100 + year0 / 400;
        int month0 = month + 12 * ((14 - month) / 12) - 2;
        int day0 = (day + x + 31 * month0 / 12) % 7;
        // Finding the day0 according to the Gregorian Calendar.

        System.out.println(day0);
        // prints the day of the week

    }
}
