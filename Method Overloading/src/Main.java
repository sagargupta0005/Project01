import java.util.Scanner;
class MathOperations{
    int A;
    int B;
    public MathOperations{

    }
    public int add(int a, int b){
        this.A= a;
        this.B= b;
       // System.out.println("num1"+ this.A);
       // System.out.println("num2"+ this.B);
        return a+b;
    }
    double A1;
    double B1;
    public double add(double a, double b){
        this.A1=a;
        this.B1=b;
        return a+b;
        //System.out.println("num2"+this.A);
       // System.out.println("numm2"+ this.B);
    }
    public void displayInfo(){
        System.out.println("");
    }


}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 int value: ");
        int A01=sc.nextInt();
        System.out.println("enter 2 int value: ");
        int B01=sc.nextInt();
        MathOperations M1=new MathOperations(A01,B01);

        System.out.println("enter 1 double value: ");
        double A001=sc.nextDouble();
        System.out.println("enter 2 double value: ");
        double B001=sc.nextDouble();
        MathOperations M2=new MathOperations(A001,B001);
        System.out.println();
    }
}