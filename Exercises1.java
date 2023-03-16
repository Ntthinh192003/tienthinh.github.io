import java.util.Scanner;

public class Exercises1{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1 is : ");
        int Number1 = sc.nextInt();
        System.out.print("Number 2 is : ");
        int Number2 = sc.nextInt();

        int Sum =  Number1 + Number2;
        System.out.println(Number1 + " + " + Number2 + " = " + Sum);
    
        int Sub = Number1 - Number2;
        System.out.println(Number1 + " - " + Number2 + " = " + Sub);
   
        int Mul = Number1 * Number2;
        System.out.println(Number1 + " * " + Number2 + " = " + Mul);
    
        float Div = (float)Number1 / (float)Number2;
        System.out.println(Number1 + " / " + Number2 + " = " + Div);
   
        int DivideByRemainder  = Number1 % Number2;
        System.out.println(Number1 + " % " + Number2 + " = " + DivideByRemainder);

        if(Number1 > Number2) System.out.println(Number1 + ">" + Number2);
            else if(Number1 < Number2) System.out.println(Number1 + "<" + Number2);
                   else System.out.println(Number1 + "=" + Number2);
    }
}