import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Reference {
    public static void main(String[] args) {
        /*
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
        Point point1 = new Point(1,1);
        Point point2 = point1;
        System.out.println(point1); */
        String message = "C: \\Hello world\\";
        System.out.println(message.endsWith("\\"));
        System.out.println(message.replace("H","Y"));
        int[] numbers = new int[6];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;
        System.out.println(Arrays.toString(numbers));
    }
}