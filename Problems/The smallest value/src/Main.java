import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        long fact = sc.nextLong();
        long result = 0;
        int count = 0;

        while (result <= fact) {
            result = factorial(count);
            if (result > fact) {
                System.out.println(count);
            }
            count++;
        }
    }

    public static long factorial(int number) {

        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
