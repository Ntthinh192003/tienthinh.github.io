import java.util.Scanner;

public class Exercises8  {

    static float Average(int arr[]) {
        float avg = 0;
        int Sum = 0;

        for (int x : arr) {
            avg = (float) (Sum += x) / arr.length;
        }
        return avg;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array[" + i + "]" + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\tAverage = " + Average(arr));
    }
}