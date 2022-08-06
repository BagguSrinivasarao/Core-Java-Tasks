package task1_exception;

import java.util.Scanner;

public class EmployeeInfo {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	EmployeeDetails employee1 = new EmployeeDetails("Raja",101,"Srikakulam");
	EmployeeDetails employee2 = new EmployeeDetails("Raju",102,"Gachibowli");
	EmployeeDetails employee3 = new EmployeeDetails("Raju",103,"KukatPalli");
	System.out.println("Enter the EmployeeId");
	int empid = scan.nextInt();
	if(empid==101||empid==102||empid==103)
	{
		System.out.println("Welcome to office");
	}
	else
	{
		throw new InvalidIdException("invalid Id");
	}
}
}
