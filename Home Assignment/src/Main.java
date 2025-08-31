class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void displaydetailsInfo(){
        System.out.println("Student name "+ this.name);
        System.out.println("Student age "+ this.age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person P1=new Person("Sagar",19);
        P1.displaydetailsInfo();
    }
}