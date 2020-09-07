public class distanceBetweenPoints {



    public static void main(String[] args) {

        int xa = 1;
        int ya = 2;

        int xb = 5;
        int yb = 7;

        int sideA = (int) Math.pow((xa - xb), 2);
        int sideB = (int) Math.pow((ya - yb), 2);

        System.out.println((int)Math.sqrt(sideA + sideB));


    }
}
