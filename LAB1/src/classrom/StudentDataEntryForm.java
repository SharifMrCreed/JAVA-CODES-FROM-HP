package classrom;

import java.util.Scanner;

public class StudentDataEntryForm {

	public static void main(String[] args) {
		System.out.print("		STUDENT DATA ENTRY AND EVALUATION FORM \n");
		System.out.print("\nPLEASE ENTER THE NUMBER OF STUDENTS IN THE CLASS");
		enterStudent();
		

	}
	public static void enterStudent() {
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		String[] fName = new String[numberOfStudents +1];
		String[] lName = new String[numberOfStudents +1];
		int[] marks = new int[numberOfStudents +1];
		int sumOfMarks = 0;
		int freq = 0;
		
		for (int i = 1; i <numberOfStudents+1; i++) {
			System.out.print("\nENTER STUDENT "+ i +"'S FIRST NAME: ");
			fName[i] = sc.next();
			System.out.print("ENTER STUDENT "+ i +"'S SECOND NAME: ");
			lName[i] = sc.next();
			System.out.print("ENTER STUDENT "+ i +"'S MARKS: ");
			marks[i] = sc.nextInt();
			if (marks[i] < 0 || marks[i]>100) {
				System.out.print("Please enter " + fName[i] + " " + lName[i] + "'s correct marks : ");
				marks[i] = sc.nextInt();
			}else {
			System.out.print(fName[i] +" "+ lName[i] +"'s Grade is for the subject is: " + studentGrade(marks[i]) +"\n");
			}
			
			sumOfMarks = sumOfMarks + marks[i];
			freq = freq + (marks[i] * marks[i]);
				
		}
		averageAndStandardDeviation(sumOfMarks, numberOfStudents, freq);
	
	}
	
	public static void averageAndStandardDeviation(int sum , int studNum, int f) {
		double mean = (double)(sum / studNum);
		System.out.print("\nThe mean mark of the " + studNum + " students is: " +  mean);
		
		double var = (f / studNum) - (mean * mean);
		
		double stDev = Math.sqrt(var);
		
		System.out.print("\nThe standard deviation of the " + studNum + " students is: " +  stDev);
		
		
	}
	
	public static void studentTable(int iterator, String firstName, String lastName, int marks) {
			
			
	
		
		
		
	}
	
	public static String studentGrade(int a) {
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
