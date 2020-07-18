import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        double sum = 0;
        int count = 0;

        for (int i = first; i <= second; i++) {

            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println(sum / count);
    }
}
