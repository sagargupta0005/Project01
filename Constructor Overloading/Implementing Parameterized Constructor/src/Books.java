import java.util.Scanner;
/*
public class Book{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String title=sc.next();
        String author=sc.next();
        double price=sc.nextDouble();
        if(price>0){
            System.out.println("No null values for title or author ");
        }
        System.out.println("Title: "+ title +" author: "+ author +" Price: "+price);
    }

}*/
class Book{
    String title;
    String author;
    double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author= author;
        this.price=price;
        System.out.println(" ");
    }
    public void displaydetails(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("price: "+this.price);
    }
}
public class Books {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a title: ");
        String Title=sc.next();
        System.out.println("Enter a Author: ");
        String Author=sc.next();
        System.out.println("Enter a Price: ");
        double price=sc.nextDouble();
        Book B1=new Book(Title ,Author ,price);
        System.out.println("\n Book details");
        B1.displaydetails();
        sc.close();
    }
}
