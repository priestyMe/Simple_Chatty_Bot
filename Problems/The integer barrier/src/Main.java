import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        int sum = 0;
        Scanner sc = new Scanner(System.in);

        int number = 0;

        //boolean loop = true;

        while (true) {
            number = sc.nextInt();

            if (number == 0) {
                System.out.println(sum);
                break;
            }

            sum += number;

            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}