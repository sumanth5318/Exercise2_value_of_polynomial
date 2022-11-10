import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = scan.nextInt();
        System.out.print("Enter b:");
        int b = scan.nextInt();
        System.out.print("Enter c:");
        int c = scan.nextInt();
        System.out.print("Enter x:");
        double x = scan.nextDouble();
        double value = (((double) (a+b)/2)*(Math.pow(x,3))) + ((Math.pow((a+b),2))*(Math.pow(x,2))) + a + b + c;
        System.out.print("Value of polynomial :" + value);
    }
}