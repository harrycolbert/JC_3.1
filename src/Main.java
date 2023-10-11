import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //make a new scanner
        Scanner celcScanner = new Scanner(System.in);
        System.out.println("Enter degrees in Centigrade:");

        //assign result from scanner to "temp"
        int temp = Integer.parseInt(celcScanner.nextLine());
        //celcius to farenheit convert
        temp = (int) ((temp * 1.8) + 32);
        //print result
        System.out.println("Degrees in Farenheit: " + temp);
    }
}