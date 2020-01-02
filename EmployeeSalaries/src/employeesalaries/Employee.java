//Sabrina Turney
//COP2800 - January 25 2018
//Week Two Program
//This program creates employee classes and gets and sets methods
//with salary raises, and displayes info to the user before and after.

package employeesalaries; 
//package will be called in EmployeeTest.java

public class Employee {
//Creating class for Employee Salaries.

    private String firstName;
    private String lastName;
    private double monthlySalary;
//Initializing variables privately to call in gets and sets.
    
    public Employee() {
        new Employee("", "", 0.0);
    }
//Public class creating blank employees passing arguments.
    
    public Employee(String fN, String lN, double sal) {
//Using setters to set first name, last name, and salaries to 
//shorter variables.

        setFirstName(fN);
        setLastName(lN);
        setSalary(sal);
    }

    public void setFirstName(String fN) {
        firstName = fN;
 //using setter to change first name
    }

    public void setLastName(String lN) {
        lastName = lN;
//using setter to change last name
    }

    public void setSalary(double sal) {
        monthlySalary = sal;
//using setter to change salary
    }

    public String getFirstName() {
        return firstName;
//using getter to return first name value
    }
    
    public String getLastName(){
//using getter to return last name value
        return lastName;
    }
    
    public double getSalary(){
//using getter to return monthly salary value
        return monthlySalary;
    }
    
    public double getYearly(){
        double yearlySalary = monthlySalary * 12;
        return yearlySalary;
    }
    
    //Following print info prints getters to show employees in a nice
    //orderly fashion.
    public void printInfo() {
        System.out.println("Employee: " + getFirstName() + " " + getLastName() +
                           "\nMonthly Salary: " + getSalary() + 
                           "\nYearly Salary: " + getYearly());
        System.out.println("----------------------------------");
    }
    
    //Here we apply the raises by setting them equal to the salary in dollars.
    public void setRaise(double raisePercent) {
       double raiseDollars = raisePercent * monthlySalary;
       setSalary(monthlySalary + raiseDollars);
    }
  

}
