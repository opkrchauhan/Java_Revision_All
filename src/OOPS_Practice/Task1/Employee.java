//WAJP for 3 Employee and take their name, age, salary and
package OOPS_Practice.Task1;

public class Employee {
    String name;
    int age;
    int salary;
    long mobileNo;

    public Employee(String name, int age, int salary, long mobileNo){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.mobileNo = mobileNo;
    }

    public String getName(){
        return name;
    }


    public  int getAge(){
        return  age;
    }


    public  int getSalary(){
        return  salary;
    }

    public  long getMobileNo(){
        return  mobileNo;
    }

    public void displayDetails(){
        System.out.println ("---------------------"+"Details of OOPS_Practice.Task1.Employee is"+"-------------");
        System.out.println ("Name is : "+getName ());
        System.out.println ("Age is : "+getAge ());
        System.out.println ("Salary is : "+getSalary ());
        System.out.println ("MobileNo is : "+getMobileNo ());
    }
}

