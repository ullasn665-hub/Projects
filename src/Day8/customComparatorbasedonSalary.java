package Day8;
import java.util.*;
public class customComparatorbasedonSalary {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Ravi", "IT", 60000),
            new Employee("Anil", "HR", 50000),
            new Employee("Priya", "IT", 50000),
            new Employee("Amit", "HR", 60000),
            new Employee("Rahul", "AT", 50000)
        );
        employees.sort(
            Comparator.comparing((Employee e) -> e.salary)
        );

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

}

class Employee {
	    String name;
	    String department;
	    int salary;

	    Employee(String name, String department, int salary) {
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	    }

	    public String toString() {
	        return name + " - " + department + " - " + salary;
	    }
	}

	