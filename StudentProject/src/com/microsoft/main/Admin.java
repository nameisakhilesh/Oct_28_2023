package com.microsoft.main;
import java.util.Scanner;

import com.microsoft.service.StudentScheduler;

public class Admin {

	static public void main(String... args) {
		// TODO Auto-generated method stub
		StudentScheduler studSch = new StudentScheduler();

		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		while(true)
		{
			System.out.println("1.add student details");
			System.out.println("2.show all student details");
			System.out.println("3.Show Student details by roll number");
			System.out.println("4.Show Student details by course name");
			System.out.println("5.exit");
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			
			switch(choice) {
			case 1:

				System.out.println("Enter Student Roll Number:");
				int rollno = sc.nextInt();
			
				System.out.println("Enter Student Name:");
				String name = sc.next();
			
				System.out.println("Enter number of courses to register:");
				int coursecount = sc.nextInt();
			
				String[] courseNames = new String[coursecount];
				for(int i=0; i < coursecount; i++) {
					System.out.println("Enter Course Name:");
					courseNames[i] = sc.next();
				}

				System.out.println(studSch.addStudent(rollno, name, courseNames));
			    break;
			       
			 case 2:
				 
				 studSch.showAllStudnetDetails();
			     break;
			     
			 case 3:
				 
				 System.out.println("Enter Roll number of student you want to search:");
				 int rollnumber = sc.nextInt();
				 studSch.showStudentDetailsByRollno(rollnumber);
				 break;
				 
			 case 4:
				 
				 System.out.println("Enter course name you want to search:");
				 //Not Implemented
				 break;
				 
			 case 5:
				 
				 System.exit(0);
				 break;
				
			 default:System.out.println("Wrong choice");
				      
			}	
		}
	}
}
