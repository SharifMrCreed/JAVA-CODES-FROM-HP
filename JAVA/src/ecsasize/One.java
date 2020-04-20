package ecsasize;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("	  Class evaluation program\n");
		System.out.print("\nEnter the number of students in your class: ");
		int studNum = sc.nextInt();
		
		int i = 1;
		String[] fNames = new String[studNum + 1];
		String[] lNames = new String[studNum + 1];
		int[] marks = new int[studNum + 1];
		int sum = 0;
		double f = 0;
		double var = 0;
		
		while ( i<= studNum ) {
			System.out.print("\nEnter student " + i + "'s First Name: ");
			fNames[i] = sc.next();
			
			System.out.print("Enter student " + i + "'s Last Name: ");
			lNames[i] = sc.next();
			
			System.out.print("Enter " + fNames[i] + " " + lNames[i] + "'s Marks: ");
			marks[i] = sc.nextInt();
			if (marks[i] < 0 || marks[i]>100) {
				System.out.print("Please enter " + fNames[i] + " " + lNames[i] + "'s correct marks : ");
				marks[i] = sc.nextInt();
			}
			
			sum = sum + marks[i];
			int x = (marks[i] * marks[i]);
			f = f + x;
			
			System.out.print(fNames[i] + " " + lNames[i] + " got " + grade(marks[i]) + "\n");
			i++;
		}
		double mean = (double)(sum / studNum);
		System.out.print("\nThe mean mark of the " + studNum + " students is: " +  mean);
		
		var = (f / studNum) - (mean * mean);
		
		double stDev = Math.sqrt(var);
		System.out.print("\nThe standard deviation of the " + studNum + " students is: " +  stDev);
		
		System.out.print("\nBELOW IS A TABLE OF STUDENT PERFORMANCE.");
		System.out.println("\n _________________________________________________________________");
		System.out.println("|  No\t|  First Name\t|  Last Name\t|  Marks\t|  Grade  |");
		System.out.println("|_______|_______________|_______________|_______________|_________|");
		for(i=1; i<= studNum; i++) {
			System.out.println("|  "+(i)+"\t|\t  "+fNames[i]+"\t|\t  "+lNames[i]+"\t|\t  "+marks[i]+"\t|\t"+grade(marks[i])+" \t|");
			System.out.println("|_______|_______________|_______________|_______________|_________|");
		}
		
	}
	public static String grade(int a) {
		String grade;
		if(a >= 80){
			grade= "A"; 
		}else if (a >= 75){
			grade= "B+";	
		}else if(a >= 70){
			grade= "B";
		}else if(a >= 65){
			grade= "C+";
		}else if(a >= 60){
			grade= "C";
		}else if(a >= 55){
			grade= "D+";
		}else if(a >=50){
			grade= "D";
		}else {
			grade= "F";
		}
		return grade;
	}

}
