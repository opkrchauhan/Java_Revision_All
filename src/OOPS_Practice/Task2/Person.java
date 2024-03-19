package OOPS_Practice.Task2;

public class Person {
    String name;
    int age;
    public  Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public  int getAge(){
        return  age;
    }

    public  void displayDetails(){
        System.out.println ("Name is : "+getName ());
        System.out.println ("Age is : "+getAge ());
    }
}
