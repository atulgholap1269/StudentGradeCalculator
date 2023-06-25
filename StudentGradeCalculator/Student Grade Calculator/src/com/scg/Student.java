package com.scg;

import java.util.Scanner;

public class Student {
   Scanner sc =new Scanner(System.in);
   private int id;
   private String name;
   private int[]marks;
   private float average;
   private char grade;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int[] getMarks() {
	return marks;
}
public void setMarks(int[] marks) {
	this.marks = marks;
}
public float getAverage() {
	return average;
}
public void setAverage(float average) {
	this.average = average;
}
public char getGrade() {
	return grade;
}
public void setGrade(char grade) {
	this.grade = grade;
}
 void calculatingAvg()
{
	 int sum=0;
	for(int i=0;i<this.marks.length;i++)
	{
		sum+=this.marks[i];
		this.setAverage(sum/this.marks.length);
	}
}
char findGrade()
 {
	 boolean flag=true;
	 for(int i=0;i<this.marks.length;i++)
	 {
		 if(this.marks[i]<=50)
		 {
			 flag=false;
		 }
	 }
	 if(flag==true)
	 {
		 if(this.getAverage()>=80)
		 {
			  this.setGrade('O');
			 return this.getGrade();
		 }
		 else if(this.getAverage()>=50 && this.getAverage()<79)
		 {
			 this.setGrade('A');
			 return this.getGrade();
		 }
		 else
		 {
			 this.setGrade('F');
			 return this.getGrade();
		 }
	 }
	 else
	 {
		 this.setGrade('F');
		 return this.getGrade(); 
	 }
 }
}
