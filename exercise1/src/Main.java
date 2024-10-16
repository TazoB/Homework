import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Write a number that you want to convert from celsius to fahrenheit: ");
        Scanner s = new Scanner(System.in);
        double celsius = s.nextDouble();

        System.out.println("Here is that temperature in fahrenheit: " + (celsius * 9 / 5 + 32));
    }
}