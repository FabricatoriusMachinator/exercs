import java.io.Console;
import java.util.Scanner;

public class secondsConverter {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        System.out.println(timeConverter(input.nextLine()));
    }

    private static String timeConverter(String in) {

        double allSeconds = Double.parseDouble(in);

        double hours = Math.floor(allSeconds / 3600);
        double min = Math.floor((allSeconds- (hours * 3600)) / 60);
        double seconds = ((allSeconds / 60) - Math.floor(allSeconds / 60)) * 60;

        return ("Converted time: " + (int)hours +":" + String.format("%02d", (int) min) + ":" + (int) seconds);


    }



}
