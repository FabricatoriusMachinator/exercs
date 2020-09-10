import java.util.Scanner;

public class compareXYZ {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = Integer.parseInt(s.nextLine());
        int y = Integer.parseInt(s.nextLine());
        int z = Integer.parseInt(s.nextLine());

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        if (x != y && x!= z && y != z) {
            System.out.println("None of the values are equal and all are different");
        }
        else if(x == y || x == z || y == z) {
            System.out.println("One or more of the values are equal");
        }


    }

}
