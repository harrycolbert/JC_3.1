import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        //make a new scancer
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter number:");

        //assign result from scanner to "num_"
        int num_ = Integer.parseInt(numScanner.nextLine()) % 2;
        switch(num_){
            case 1:
                System.out.println("This is an ODD number");
            break;
            case 0:
                System.out.println("This is an EVEN number");
            break;
        }
    }
}
