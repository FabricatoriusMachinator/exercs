import java.util.Scanner;

public class linesIntersect {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter coordinates fir A1x and A1y");

        int a1x = Integer.parseInt(s.nextLine());
        int a1y = Integer.parseInt(s.nextLine());

        System.out.println("Enter coordiantes for A2x and A2y");

        int a2x = Integer.parseInt(s.nextLine());
        int a2y = Integer.parseInt(s.nextLine());

        System.out.println("Enter coordinates for B1x and B1y");

        int b1x = Integer.parseInt(s.nextLine());
        int b1y = Integer.parseInt(s.nextLine());

        System.out.println("Enter coordinates for B2x and B2y ");

        int b2x =  Integer.parseInt(s.nextLine());
        int b2y = Integer.parseInt(s.nextLine());

        if (a1x != a2x && a1y != a2y) {
            System.out.println("A must be horizontal or vertical!");
        }
        else if (b1x != b2x && b1y != b2y) {
            System.out.println("B must be horizontal or vertical!");
        }
        else {

            int temp;
            if (a1x > a2x) {
                temp = a2x;
                a2x = a1x;
                a1x = temp;
            }
            if (b1x > b2x) {
                temp = b2x;
                b2x = b1x;
                b1x = temp;
            }
        }

        if (b1x >  a2x || b2x > a1x || b1y > a2y || b2y > a1y){
            System.out.println("The lines don't intersect");

        }
        else {
            System.out.println("The lines intersect");
        }

    }

}
