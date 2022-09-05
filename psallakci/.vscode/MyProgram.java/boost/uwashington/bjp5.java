public class bjp5 {
    public static void main(String[] args) {
        // exercise 2.1
    double s0 = 12.0;
    double v0 = 3.5;
    double a = 9.8;
    int t = 10;
    double s = s0 + v0 * t + 0.5 * a * (t*t);
    System.out.println(s);
        // exercise 2.2
        for (int i = 1; i<=10; i++){
            int result = (int) Math.pow(i,2);
            System.out.println(result);
            }
        // exercise 2.3
        int first = 1;
        int second = 1;
        int third;
       for (int i=0; i<=10; i=++) {
        third = first + second;
        System.out.println(third + " ");
        first = second;
        second = third; 
       }
       // exercise 2.4
       for (int i=0; i<=3; i++){
            for (int j=0; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
       }
       // exercise 2.6
       for (int i=1; i<=7; i++){
        for (int j=1; j<=i; j++){
            System.out.print(i);
        }
        System.out.println();
       }
       // exercise 2.7
       for (int i=1; i<=5; i++){
        for (int k=1; k<=i;k--){
            System.out.print(" ");
        }
        for (int j=1; j<=i; j++ );
            System.out.println(i);
        }
        System.out.println();
        
       // exercise 2.8
       for (int i=1; i<=5; i++){
        for (int k=1; k<=i; i++){
            System.out.print(" ");
        }
        for (int j=1; j<=i; j++){
            System.out.print(i);
        }
        System.out.println();
       }
       // exercise 2.10
       for (int i=1; i<=2; i++){
        for (int k=1; k<=i; k++){
           for (int j=1; j<=6; i++){
               System.out.print("|");
               System.out.print("1234567890");
           }
          }
    }
       // exercise 2.11
        // soruyu pek anlayamadim 




    }
}
