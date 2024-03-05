package com.cg.java8.features;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeOperations {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ashok", "Sales", 25, 100000, "Male"));
        employeeList.add(new Employee("Suresh", "Sales", 25, 200000, "Male"));
        employeeList.add(new Employee("Shahrukh", "HR", 30, 200000, "Male"));
        employeeList.add(new Employee("Pallavi", "HR", 26, 150000, "Female"));
        employeeList.add(new Employee("Sameer", "HR", 22, 250000, "Male"));
        employeeList.add(new Employee("Virat", "HR", 24, 160000, "Male"));

        //Find count of Male and Female employees
        Map<String, Long> employeeCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(employeeCount);

        //Find count of employees dept wise
        Map<String, Long> deptWiseEmpCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(deptWiseEmpCount);

        //Find count of Male and Female employees
        Map<String, Double> deptWiseAvgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingLong(Employee::getSalary)));
        System.out.println(deptWiseAvgSalary);

        //Name of employee having highest salary
        Optional empName = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(empName.isPresent() ? empName : "List is empty");


        //Sorted Employee list
//        List<Employee> empListSorted = employeeList.stream().sorted().collect(Collectors.toList());
//        System.out.println(empListSorted);

        //Sorted by age desc
        List<Employee> empListSorted = employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
        System.out.println(empListSorted);

        Comparator<Employee> ageComparator = (e1, e2) -> e1.getAge().compareTo(e2.getAge());
        Comparator<Employee> salaryComparator = Comparator.comparing(Employee::getSalary);
        Comparator<Employee> salaryComparatorReversed = Comparator.comparing(Employee::getSalary, Comparator.reverseOrder());
        Comparator<Employee> genderComparator = (e1, e2) -> e1.getGender().compareToIgnoreCase(e2.getGender());


        //Sorted by age salary and gender
        employeeList.sort(genderComparator.thenComparing(salaryComparator));
        System.out.println("Sorted by age salary and gender" + employeeList);

        employeeList.sort(salaryComparatorReversed);
        System.out.println("Sorted by salary reversed" + employeeList);
    }
}
