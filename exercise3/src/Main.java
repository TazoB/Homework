import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");

        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        boolean isLeap = false;

        if(year % 4 == 0){
            isLeap = true;

            if(year % 100 == 0){
                isLeap = false;
            }
            if(year % 400 == 0){
                isLeap = true;
            }
        }
        else{
            isLeap = false;
        }

        if(isLeap){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}