//Sabrina Turney
//COP2800 - January 25 2018
//Week Two Program
//This program creates employee classes and gets and sets methods
//with salary raises, and displayes info to the user before and after.

package employeesalaries;
//Here is where the Employeesalaries will take my values from.

public class EmployeeTest {
 public static void main(String[] args) {
        
        //First, I print an introduction that explains the program to the user.
        
        System.out.println("Welcome to my Employee Salary Display!");
        System.out.println("First, I'll display five employee objects and"
                + "their yearly salaries.");
        System.out.println("Then, I'll give each employee a raise of 2, 3, 4, "
                + "5, and 6 percent.");
        System.out.println("\n\n First, here are our employees and their yearly"
                + " salaries: \n");
     
        //Here are our employees and their corresponding values.
        Employee emp1 = new Employee("Sabrina", "Turney",
                600.00);
        Employee emp2 = new Employee("Jack", "Russell", 700.50);
        Employee emp3 = new Employee("Kiwi", "Doge", 500.05);
        Employee emp4 = new Employee("Xena", "Princess",
                2000.50);
        Employee emp5 = new Employee("Jack", "Ripper",
                50000.00);

       //We print the info of each employee through the print info function.
       emp1.printInfo();
       emp2.printInfo();
       emp3.printInfo();
       emp4.printInfo();
       emp5.printInfo();
       
       //Then we apply the raises of each employee, passing the raises as args.
       emp1.setRaise(0.02);
       emp2.setRaise(0.03);
       emp3.setRaise(0.04);
       emp4.setRaise(0.05);
       emp5.setRaise(0.06);
       
       System.out.println("Now, after applying raises of 2 through 6 percents"
               + " to each employee one through five, their salaries are as "
               + "follows:");
       System.out.println("********************************");
       System.out.println("                                  ");
       
       //Here is where we'll be printing out the new info for our employees.
       emp1.printInfo();
       emp2.printInfo();
       emp3.printInfo();
       emp4.printInfo();
       emp5.printInfo();
       
       //Here's a happy goodbye for the end user before the program ends.
       System.out.println("Thank you for using my program!");
       System.out.println("Goodbye!");
    }   
}
