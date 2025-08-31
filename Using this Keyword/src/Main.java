import java.util.Scanner;
class Students{
    String Name;
    double Marks;
    public Students(String name,double marks){
        this.Name=name;
        this.Marks=marks;

    }
    public void displayDetailsInfo(){
        System.out.println("Student Name: "+this.Name);
        System.out.println("Students marks: "+this.Marks);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String Name= sc.next();
        System.out.println("Enter the marks: ");
        double Marks= sc.nextDouble();
        Students S1=new Students(Name,Marks);
        System.out.println("_students Details_");
        S1.displayDetailsInfo();
        sc.close();
    }
}