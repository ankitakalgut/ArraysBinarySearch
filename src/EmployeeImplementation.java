import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeImplementation {

	public static void main(String args[]) {
		Employee emp1 = new Employee("Ankita", 20000.0);
		Employee emp2 = new Employee("John", 900009.0);
		Employee emp3 = new Employee("Kelvin", 40000.0);
		List<Employee> emp = new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
	
		
		Employee e=emp.stream()
        .max(Comparator.comparingDouble(Employee::getSalary)).get();
       double highestSalary=0;
		for(Employee em:emp)
		{
			if(em.getSalary()>=em.getSalary())
			{
				highestSalary=em.getSalary();
			}
		}
		
		/*
		 * for (int i = 0; i <emp.size(); i++) {
		 * 
		 * if (emp.get(i).getSalary() >= emp.get(i + 1).getSalary()) { highestSalary =
		 * emp.get(i).getSalary();
		 * 
		 * } }
		 */
		
		System.out.println("highest salary among the employees is "+highestSalary);
		System.out.println("highest salary among the employees is "+e.getSalary());
		//assertEquals(90009.0,FindMax());
	}

}
