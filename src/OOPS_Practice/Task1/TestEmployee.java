package OOPS_Practice.Task1;

import OOPS_Practice.Task1.Employee;

public class TestEmployee {
    public static void main ( String[] args ) {
        Employee emp = new Employee ("Rahul", 12, 7200, 6764874);
        Employee emp1 = new Employee ("Ram", 18, 9000, 6064874);
        Employee emp2 = new Employee ("Rahul", 12, 8800, 56764874);

        if(emp.getSalary () > emp1.getSalary () && emp.getSalary ()>emp2.getSalary ()){
            emp.displayDetails ();
        }
        else if(emp1.getSalary () > emp2.getSalary () && emp1.getSalary ()>emp.getSalary ()){
            emp1.displayDetails ();
        }
        else{
            emp2.displayDetails ();
        }
    }


//    public static Employee findHighestSalary(Employee e1, Employee e2, Employee e3){
//        if(e1.getSalary ()>e2.getSalary () && e1.getSalary ()>e3.getSalary ()){
//           return  e1;
//        }
//        else if(e2.getSalary ()>e1.getSalary () && e2.getSalary ()>e3.getSalary ()){
//            return  e2;
//        }
//        return  e3;
//    }

}
