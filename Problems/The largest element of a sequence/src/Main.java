import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int largest = 0;

        do {
            if (number > largest) {
                largest = number;
            }
            number = sc.nextInt();
        } while (number != 0);

        System.out.println(largest);
    }
}