import java.util.Scanner;

public class PrimeDecomposition {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int inputNumber = Integer.parseInt(s.nextLine());


        for (int i = 2;  i <= inputNumber; i++) {

            boolean prime = false;
            prime = isPrime(i);

            if (prime == true && (float) inputNumber / i == Math.floor(inputNumber / i) ) {
                inputNumber = inputNumber / i;
                System.out.println(i + "\n");
                i--;

            }
        }
    }

    private static boolean isPrime(int n) {

        for(int i=2; i < n/2; i++) {

            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

}
