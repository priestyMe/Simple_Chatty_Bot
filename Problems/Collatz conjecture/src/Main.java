import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.print(number + " ");

        while (number > 1) {
            if (number % 2 == 0) {
                number /= 2;
                System.out.print(number + " ");
            } else {
                number *= 3;
                number++;
                System.out.print(number + " ");
            }
        }
    }
}
