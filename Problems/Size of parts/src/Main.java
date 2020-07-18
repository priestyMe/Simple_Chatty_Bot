import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int nParts = sc.nextInt();

        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < nParts; i++) {
            int partPrint = sc.nextInt();
            if (partPrint == 1) {
                larger++;
            } else  if (partPrint == -1) {
                smaller++;
            } else if (partPrint == 0) {
                perfect++;
            }
        }

        System.out.println(perfect + " " + larger + " " + smaller);
    }
}
