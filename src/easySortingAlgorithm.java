import java.lang.reflect.Array;
import java.util.Scanner;

public class easySortingAlgorithm {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] numbers = new int[3];

        numbers[0] = Integer.parseInt(s.nextLine());
        numbers[1] = Integer.parseInt(s.nextLine());
        numbers[2] = Integer.parseInt(s.nextLine());

        System.out.println("Sort ascending? (true/false)");

        boolean sortAsc = Boolean.parseBoolean(s.nextLine());

        int low = 0;
        int mid = 1;
        int high = 2;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Loop: " + i +  "\n");

            if (numbers[i] >= high && numbers[i] >= mid) {

                if (i == 2){
                    low = mid;
            }
                mid = high;
                high = numbers[i];
                System.out.print("High\n");
            }
            else if (numbers[i] > low && numbers[i] > mid ) {

                low = mid;
                mid = numbers[i];
                System.out.print("Mid\n");
            }

            else  {
                low = numbers[i];
                System.out.print("Low\n");
            }

        }

        if (sortAsc == true) {
            System.out.println(low);
            System.out.println(mid);
            System.out.println(high);
        }
        else {
            System.out.println(high);
            System.out.println(mid);
            System.out.println(low);
        }
    }
}
