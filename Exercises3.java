import java.util.Scanner;

public class Exercises3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Who are you: ");
        String name = sc.next();
        System.out.print("How old are you: ");
        int age = sc.nextInt();

        if(age < 16 ) System.out.println(name + " is a teenager");
        if(age >= 16 && age < 18) System.out.println(name + " in adulthood");
        if(age >= 18) System.out.println(name + " is old");
    }
}
