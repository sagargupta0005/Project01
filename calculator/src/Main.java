import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner C1 = new Scanner(System.in);
        System.out.println("enter the value: ");
        float a = C1.nextInt();
        float b = C1.nextInt();
        System.out.println("enter operator(+,-,*,/): ");
        char operator= C1.next().charAt(0);
        if(operator=='+') {
            System.out.println("add:" + (a + b));
        } else if (operator=='-') {
            System.out.println("sub:" + (a - b));
        } else if (operator=='*') {
            System.out.println("mul:"+ (a*b));
        } else if (operator=='/') {
            System.out.println("div:" +(a/b));
        }
        else{
            System.out.println("Invalid Operator...");
        }
    }
}