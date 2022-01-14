//ID: 2014305642
//Name: Sadia Akhter
//Course: CSE215
//Section: 10


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CaseManagementSystem {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) { // Main method
		// Admin access and login
		System.out.print("Admin: ");
		String admin = input.next();
		System.out.print("Password: ");
		String pass = input.next();
		if (admin.equals("Robin") && pass.equals("Milford")) {
			menu();
		} else {
			System.out.print("Invalid login.");
		}
	}

	// Main menu method
	static void menu() {
		System.out.println("\nMENU\n1. Record entry\n2. Update entry");
		int menu = input.nextInt();
		// If-else method to choose menu options
		if (menu == 1) {
			record();
		} else if (menu == 2) {
			update();
		}
	}

	// Recording case details method
	@SuppressWarnings("deprecation")
	static void record() {
		System.out.print("Enter number of records: ");
		int recordNo = input.nextInt();
		for (int i = 1; i < recordNo + 1; i++) {
			System.out.println("\nEnter a brief description for case " + i + ":");
			String brief = input.next();
			Record record = new Record();
			record.setBrief(brief);
			System.out.print("Enter the number of suspects: ");
			int susNo = input.nextInt();
			ArrayList<String> suspects = new ArrayList<String>(susNo);
			for (int j = 1; j < susNo + 1; j++) // For loop to take suspect names
			{
				System.out.print("Enter name of suspect " + j + ": ");
				suspects.add(input.next());
			}
			record.setSuspects(suspects);
			record.setDate(new Date().toGMTString());
			System.out.print("Enter case status: ");
			String stats = input.next();
			record.setStats(stats);
			System.out.println("\nDetails of case " + i + "-");
			System.out.println(record.toString());
		}
		menu(); // Back to main menu
	}

	// Updating case details method
	@SuppressWarnings("deprecation")
	static void update() {
		System.out.print("Enter number of record you want to update: ");
		int recordNo = input.nextInt();
		for (int i = 1; i < recordNo + 1; i++) {
			if (i == recordNo) {
				System.out.println("\nEnter a brief description for case " + i + ":");
				String brief = input.next();
				Record record = new Record();
				record.setBrief(brief);
				System.out.print("Enter the number of suspects: ");
				int susNo = input.nextInt();
				ArrayList<String> suspects = new ArrayList<String>(susNo);
				for (int j = 1; j < susNo + 1; j++) {
					System.out.print("Enter name of suspect " + j + ": ");
					suspects.add(input.next());
				}
				record.setSuspects(suspects);
				record.setDate(new Date().toGMTString());
				System.out.println("\nDetails of case " + i + "-");
				System.out.print("Enter case status: ");
				String stats = input.next();
				record.setStats(stats);
				System.out.println("\nDetails of case " + i + "-");
				System.out.println(record.toString());
			} else {
				System.out.print("Invalid case number.");
			}
			menu(); // Back to main menu
		}

	}
}
