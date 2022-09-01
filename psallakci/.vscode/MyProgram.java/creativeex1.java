public class creativeex1 {
    public static void main(String[] args) {
        // finding the windchill
        double t = 30; // gave a value for t considering it shouldn't be larger than 50.
        double v = 100; // gave a value for v considering it shouldn't be larger than 120 or less than
                        // 3.
        double b = 0.16; // b is a constant for the windchill formula
        double result = Math.pow(v, b); // found v to the power of b.
        double windchill = (35.74 + 0.6215 * t + (0.4275 * t - 35.75) * result);
        System.out.println("temperature is " + t + " in Fahrenheit"); // printed the temperature value
        System.out.println("windspeed is " + v + " in miles per hour"); // printed the windspeed value
        System.out.println("windchill is " + windchill); // printed the windchill value

    }

}
