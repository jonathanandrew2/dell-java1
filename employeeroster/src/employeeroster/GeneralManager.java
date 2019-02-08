package employeeroster;

import java.util.Scanner;

public class GeneralManager {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter employee name");
		String name = reader.nextLine();
		System.out.println("Please enter employee title");
		String Title = reader.nextLine();
		
		Roster roster = new Roster();
		Employee emp = new Employee( name, Title);
		roster.addEmployee(emp);

	}

}
