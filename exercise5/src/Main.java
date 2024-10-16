import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter +,-, *, or / : ");

        Scanner y = new Scanner(System.in);
        String S = y.nextLine();

        System.out.print("Enter first number: ");

        Scanner a = new Scanner(System.in);
        int firstNum = a.nextInt();

        System.out.print("Enter second number: ");

        Scanner b = new Scanner(System.in);
        int secondNum = b.nextInt();

        if(S == "+") System.out.println(firstNum + secondNum);
        else if(S == "-") System.out.println(firstNum - secondNum);
        else if (S == "*") System.out.println(firstNum * secondNum);
        else System.out.println(firstNum / secondNum);
    }
}