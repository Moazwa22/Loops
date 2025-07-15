public class Main {
    public static void main(String[] args) {
        int[] scores = {40, 91, 60, 51, 80};

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] % 2 == 0) {
                scores[i] = 0;
                System.out.println("Even number will be zero at index: " + i);
            }
        }
        System.out.print("Array after replacing : ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(  scores[i] +" " );
        }
        System.out.println();

        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("_______________________________");
        System.out.println("The maximum number is : " + max);
    }
}


