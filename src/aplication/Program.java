package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import emplyoeers.Emplyoeers;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("How many employees will be registered? ");
		n = sc.nextInt();
		
		List <Emplyoeers> list = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			clearBuffer(sc);
			System.out.println("Employee #" +(i+1)+ ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			clearBuffer(sc);
			System.out.print("NAME: ");
			String name = sc.nextLine();
			System.out.print("SALARY: ");
			Double salary = sc.nextDouble();
			Emplyoeers emp = new Emplyoeers(id, name, salary);
			list.add(emp);
		}
		
		
		System.out.print("Enter the ID of who will have salary increase: ");
		int idIncrease = sc.nextInt();
		int varControl = 0; //variable just to control if the list has ended 
		
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).getId() == idIncrease)
			{
				System.out.print("Insert the % to increase: ");
				double percentage = sc.nextDouble();
				list.get(i).increaseSalary(percentage);
			}
			
			else if(varControl == (list.size()-1))
			{
			System.out.println("ID does not exist!");
			}
			varControl++;
		}
		
		System.out.println("List of employees: ");
		for(int i =0; i<list.size(); i++) 
		{
			System.out.println(list.get(i).toString());
		}
		
		sc.close();
	}
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
