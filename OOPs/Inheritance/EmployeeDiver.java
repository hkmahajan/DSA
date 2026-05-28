package OOPs.Inheritance;

class Employee {
    String name;
    int empid;
    double salary;
    String Greet = "Hello From Emp";
    static{
        System.out.println("Static Initializer block of employee class");
    }
    public void display(){
        System.out.println(this.name);
        System.out.println(this.empid);
        System.out.println(this.salary);
        System.out.println();
        System.out.println("...........................");
        System.out.println(this.Greet);
        System.out.println("...........................");
    }
//    @Override
//    public String toString(){
//        return "Name: "+this.name+" Empid: "+this.empid+" Salary: "+this.salary;
//    }
    Employee(String name,int empid,double salary){
        this.name=name;
        this.empid=empid;
        this.salary=salary;

        System.out.println("Employees class parameterised construtor call");
    }
    Employee(){
        System.out.println("Employees class no argument constructor call");
    }

}
class Developer extends Employee{
    int devid;
    String Greet = "Hello From Developers";
    public void coding(){

        System.out.println(String.format("Employee %s can code",name));
    }
    static{
        System.out.println("static initializer block of developer class.");
    }
    Developer(){
        this(null,0,0.0);
        System.out.println("default constucrtor with no argument having this calling statement called");
    }
    Developer(String name,int empid,int devid,double salary){
        this.name=name;
        this.empid=empid;
        this.devid=devid;
        this.salary=salary;

        System.out.println("Developer class parameterised constructor with this keyword is called.");
    }

    Developer(String name,int empid,double salary){
        super(name,empid,salary);
        System.out.println("Developer class parameterised constructor with super calling statement is called.");
    }

    Developer(String name,double salary,int empid){
        super.name=name;
        super.empid=empid;
        super.salary=salary;

        System.out.println("Developer class parameterised constructor with super keyword is called.");
    }

    @Override
    public void display() {
//        super.display();
        System.out.println("----------------------");
        System.out.println(this.Greet);
        System.out.println("----------------------");
        System.out.println(super.Greet);
        System.out.println("----------------------");
    }
    @Override
    public String toString(){
        return Greet+"Name: "+this.name+" Empid: "+this.empid+" Dev id: "+this.devid+" Salary: "+this.salary;
    }
}

public class EmployeeDiver{
    public static void main(String[] args) {
        Developer dev = new Developer("harsh",101,401,1000.0);
        System.out.println(dev);

        Employee emp = new Employee("sachin",102,1500.0);
        System.out.println(emp);

        Employee emp2 = new Developer("Harsha",103,402,1500);
        System.out.println(emp2);
    }
}
