package OOPs.Polymorphisum;

class Employee{
    String name;
    int empId;
    double salary;
    static String designation= "Employee";

    public Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

   public void display(){
       System.out.println("=====Emplaoyee Details=====");
       System.out.println("Name: "+this.name);
       System.out.println("EmpId: "+this.empId);
       System.out.println("Salary: "+this.salary);
       System.out.println("Designation: "+ designation);
   }

}
class Developer extends Employee{
    int devId;
    static String designation = "Developer";

    public Developer(String name, int empId, int devId, double salary) {
        super(name, empId, salary);
        this.devId = devId;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("=====Developer Details=====");
        System.out.println("Name: "+this.name);
        System.out.println("EmpId: "+this.empId);
        System.out.println("DevId: "+this.devId);
        System.out.println("Salary: "+this.salary);
        System.out.println("Designation: "+ designation);
    }

    public void parentDisplay(){
        super.display();
    }
}

class Tester extends Employee{
    int testId;
    static String designation = "Tester";

    public Tester(String name, int empId, double salary, int testId) {
        super(name, empId, salary);
        this.testId = testId;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("=====Tester Details=====");
        System.out.println("Name: "+this.name);
        System.out.println("EmpId: "+this.empId);
        System.out.println("TestId: "+this.testId);
        System.out.println("Salary: "+this.salary);
        System.out.println("Designation: "+ designation);
    }

    public void parentDisplay(){
        super.display();
    }
}
public class Diver {
    public static void main(String[] args) {
        Developer dev = new Developer("Harsh",101,100,1000.00);
        Employee emp=dev;

        emp.display();
    }
}
