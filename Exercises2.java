import java.util.Scanner;

public class Exercises2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number is : ");
        int Number = sc.nextInt();

        if(Number % 2 == 0) System.out.println(Number + " is even number");
           else System.out.println(Number + " is odd number");
    }
}
