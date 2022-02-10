package day2java;

import java.util.Scanner; // to import scanner from library

public class Accessmodifier {
	int noe;
	float wrkhrs;
	int nop;
	Scanner Sc = new Scanner (System.in); //syntax for scanner
	private void displayEmployees() {//m1
		System.out.println("Number of Employees");
		noe  = Sc.nextInt();
	}
	void displayWorkingHours() {//m2
		System.out.println("Number of Working Hours");
		wrkhrs  = Sc.nextInt();
	}
	void displayProject() {//m3
		System.out.println("Number of Project");
		nop  = Sc.nextInt();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//objectsyntax
    // classname variable = variable(new) constructor();		
		Accessmodifier am = new Accessmodifier();
		am.displayEmployees();
		am.displayWorkingHours();
		am.displayProject();
	}
}