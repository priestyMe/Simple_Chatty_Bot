import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        int sum = 0;

        for (int i = first; i <= second; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}