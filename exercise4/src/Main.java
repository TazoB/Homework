import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        System.out.print("Enter second number: ");

        Scanner l = new Scanner(System.in);
        int y = l.nextInt();

        if(x > 0 && y > 0) System.out.println("First");
        else if(x < 0 && y > 0) System.out.println("Second");
        else if(x < 0 && y < 0) System.out.println("Third");
        else if(x > 0 && y < 0) System.out.println("Fourth");
        else if(x == 0 && y == 0) System.out.println("(0; 0)");
        else if(x == 0) System.out.println("X");
        else if(y == 0) System.out.println("Y");
    }
}