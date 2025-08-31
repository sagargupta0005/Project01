import java.util.Scanner;


class Rectangle{
    double Length;
    double Breadth;

    public Rectangle(double length, double breadth){
        this.Length=length;
        this.Breadth=breadth;
        System.out.println("Length: "+ length +" Breadth: "+breadth);
    }
    public double calculateArea(){
        return Length*Breadth;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        double Length1=sc.nextDouble();
        System.out.println("Enter the breadth:");
        double Breadth1=sc.nextDouble();
        Rectangle R1=new Rectangle(Length1, Breadth1);
        System.out.println("Area of Rectangle"+ R1.calculateArea());
        sc.close();

    }
}