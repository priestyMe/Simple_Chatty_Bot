import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int previous = number;
        int countAscending = 0;
        int countDescending = 0;

        boolean ordered = true;
        do {

            //check descending order
            if (number < previous) {
                if (countAscending > 0) {
                    ordered = false;
                    break;
                } else  {
                    countDescending++;
                }
                //check ascending order
            } else {
                if (number > previous) {
                    if (countDescending > 0) {
                        ordered = false;
                        break;
                    } else {
                        countAscending++;
                    }
                }
            }

            previous = number;
            number = sc.nextInt();

        } while (number != 0);

        System.out.println(ordered);
    }
}