import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Write a number that you want to convert from fahrenheit to celsius: ");

        Scanner s = new Scanner(System.in);
        double fahrenheit = s.nextDouble();

        System.out.println("Here is that temperature in celsius: " + ((fahrenheit-32)*5/9));
    }
}