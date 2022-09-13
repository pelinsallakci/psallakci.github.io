public class multipliesof3or5 {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) && (i % 5 == 0){
            count ++;
            sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}
