package com.classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(

				new Employee(1, "Mohit", "Backend", 6000), new Employee(2, "Yash", "Full Stack", 45000),
				new Employee(3, "Rakesh", "FrontEnd", 60000), new Employee(4, "Anish", "Finance", 75000),
				new Employee(5, "Ajay", "HR", 80000), new Employee(6, "Akash", "Devops", 62000),
				new Employee(7, "Reema", "Devops", 65000), new Employee(8, "Sakshi", "FrontEnd", 76000),
				new Employee(9, "Sam", "HR", 90000));

		// Q1) Get list of employee names.
		List<String> names = employees.stream().map(e -> e.getName()).collect(Collectors.toList());

		System.out.println(names);

		// Question 2: Filter employees of the “Devops” department.

		List<Employee> devopsEmployees = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Devops"))
				.collect(Collectors.toList());
		System.out.println(devopsEmployees);

		// Q3) Count Employees earing more than 50,0000

		long count = employees.stream().filter(e -> e.getSalary() > 50000).count();
		System.out.println(count);

		// Q4: Find employee with the highest salary?

		Employee highestSalary = employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);

		System.out.println(highestSalary);

		// Q5) Convert List<Employee> to Set<Employee>

		Set<Employee> employeeSet = employees.stream().collect(Collectors.toSet());
		System.out.println(employeeSet);

		// Q6: Sort employees by salary (descending)?

		List<Employee> employeeSortedBySalary = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());

		System.out.println(employeeSortedBySalary);

		// Q7: Find average salary of employees in “HR” department.
		double avg = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("HR"))
				.mapToInt(Employee::getSalary).average().orElse(0);
		System.out.println("Avg Salary in Hr dept: " + avg);

		// Q8 : Find the second-highest salary.
		Integer secondHigestSalary = employees.stream().map(e -> e.getSalary()).distinct()
				.sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);

		System.out.println(secondHigestSalary);

		// Q9): Convert list into Map<id, name>?

		Map<Integer, String> map = employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		System.out.println(map);

		// Q10 Group employees by department.
		Map<String, List<Employee>> groupByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(groupByDept);

		// Q11: Find the highest-paid employee in each department

		Map<String, Employee> highestPaidEmployeeInEachDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));
		System.out.println(highestPaidEmployeeInEachDept);

		// Q12: Partition employees into salary > 50,000 and salary ≤ 50,000
		Map<Boolean, List<Employee>> partionedEmployyes = employees.stream()
				.collect(Collectors.partitioningBy(e -> e.getSalary() > 50000));
		System.out.println(partionedEmployyes);

		// Q13: Find total salary payout for each department (Map<String, Integer>).

		Map<String, Integer> payOutForEachDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingInt(Employee::getSalary)));
		System.out.println(payOutForEachDept);

		// Q14 : Sort employees by department, then by salary.
		List<Employee> sortedByEmployeeAndSalary = employees.stream()
				.sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary))
				.collect(Collectors.toList());

		System.out.println(sortedByEmployeeAndSalary);

		// Q15: Get names of employees whose name starts with “A”.

		List<String> namesStartingWithA = employees.stream().filter(e -> e.getName().startsWith("A"))
				.map(e -> e.getName()).collect(Collectors.toList());
		System.out.println(namesStartingWithA);

	}
}
