package com.scg;
import java.io.*;
import java.util.Scanner;
public class SCGApplication {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Student s=new Student();
	System.out.println("Enter student id");
	int id =sc.nextInt();
	System.out.println("Enter student name");
	String name=sc.next();
	//System.out.println();
	System.out.println("Enter the 5 subject marks of student");
	int marks[]=new int[5];
	for(int i=0;i<marks.length;i++)
	{
	 marks[i]=sc.nextInt();
	}
	s.setId(id);
	s.setName(name);
	s.setMarks(marks);
	System.out.println("Grade card Of Student=======================");
	System.out.println("Student id : "+s.getId());
	System.out.println("Student name : "+s.getName());
	s.calculatingAvg();
	
	System.out.println("Grade : "+ s.findGrade());
	
}
}
