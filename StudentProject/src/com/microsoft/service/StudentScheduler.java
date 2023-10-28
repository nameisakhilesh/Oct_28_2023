package com.microsoft.service;
import com.microsoft.beans.Student;

public class StudentScheduler {
	
	private Student[] students = new Student[10];
	private int counterStudent;
	private String[] courseName;

	public String addStudent(int rollNumber, String name, String[] courseNames) {
		students[counterStudent] = new Student();

		students[counterStudent].setRollNumber(rollNumber);
		students[counterStudent].setName(name);
		students[counterStudent].setCourseNames(courseNames);
		
		counterStudent++;
		return "Student added successfully";
	}

	public void showAllStudnetDetails() {
		
		for(int i=0; i < counterStudent; i++) {
			System.out.println(students[i].getRollNumber());
			System.out.println(students[i].getName());
			courseName = students[i].getCourseNames();
			for(int j=0; j < courseName.length; j++) {
				System.out.println(students[i].getCourseNames()[j]);
			}
		}

	}
	
	public void showStudentDetailsByRollno(int rollNumber) {
		
		for(int i=0; i< counterStudent; i++) {
			Student student = students[i];
	        if (student.getRollNumber() == rollNumber) {
	            System.out.println(student.getName()); 
	            courseName = students[i].getCourseNames();
				for(int j=0; j < courseName.length; j++) {
					System.out.println(students[i].getCourseNames()[j]);
				}
	        }  
		}
	}

}
