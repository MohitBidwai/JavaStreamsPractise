Java 8 Streams – 20 Interview Questions (Basic → Advanced)

This repository contains 20 Java Stream API coding questions solved from basic to advanced level using an Employee class.
These questions cover real interview topics like filtering, mapping, sorting, grouping, partitioning, reduce operations, and parallel streams.

🚀 Why This Repo?

Java Streams are one of the most asked topics in backend interviews.
This repo helps you:

Practice functional programming in Java

Master commonly asked Stream interview problems

Build strong Stream API fundamentals

Improve coding skills for interviews

🧩 Employee Class Used
public class Employee {
    private Integer id;
    private String name;
    private String department;
    private Integer salary;

    // constructor, getters, setters, toString
}

📘 List of 20 Questions (Basic → Advanced)
🟢 Basic Level

Get list of all employee names.

Filter employees of the “IT” department.

Count employees earning more than 50,000.

Find employee with the highest salary.

Convert List<Employee> to Set<Employee>.

🟡 Intermediate Level

Sort employees by salary in descending order.

Find average salary of employees in the “HR” department.

Find the second-highest salary.

Convert list into Map<id, name>.

Group employees by department.

🔵 Advanced Level

Find highest-paid employee in each department.

Partition employees into salary > 50,000 and salary ≤ 50,000.

Find total salary payout for each department.

Sort employees by department, then by salary.

Get names of employees whose name starts with “A”.

🟣 Very Advanced Level

Get sum of all salaries using reduce().

Find lowest-paid employee in each department.

Check if any employee earns more than 1,00,000.

Convert List<Employee> → List<String> in "name - salary" format.

Use parallelStream() to count employees earning more than 60,000.

📂 Project Structure
/src
  └── Employee.java
  └── StreamQuestions.java
README.md

🧠 Stream Concepts Covered

filter()

map()

sorted()

Comparator & multi-level sorting

collect()

Collectors (groupingBy, partitioningBy, toMap, toList, toSet)

reduce()

Optional handling

maxBy(), minBy()

collectingAndThen()

parallelStream()

These questions cover almost everything required for Java interviews.

🏃‍♂️ How to Run

Clone the repo:

git clone https://github.com/MohitBidwai/JavaStreamsPractise.git


Open in VS Code / IntelliJ / STS

Run the main method inside StreamQuestions.java

📌 Status

✔ 15 questions solved

⏳ Remaining 5 coming soon

🔥 Will continue updating the repository

⭐ Show Support

If this repo helped you, please ⭐ star the repo—it motivates me to share more Java interview content!
