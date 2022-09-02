public class exercises21 {
   public static void main(String[] args) {
      double t = Double.parseDouble(args[0]);
      double tInRad = Math.toRadians(t);
      double sum = Math.sin(2 * tInRad) + Math.sin(3 * tInRad);
      System.out.println(sum);
   }
}
