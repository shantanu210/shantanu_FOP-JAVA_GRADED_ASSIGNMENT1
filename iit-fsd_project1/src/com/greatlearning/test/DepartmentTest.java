package com.greatlearning.test;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.SuperDepartment;
import com.greatlearning.model.TechDepartment;

import java.util.Scanner;

public class DepartmentTest {

	public static void main(String args[])
	{
		/*SuperDepartment sd = new SuperDepartment();
		System.out.println(sd.departmentName()+"\n"); 
		System.out.println(sd.getTodaysWork()+"\n"); 
		System.out.println(sd.getWorkDeadline()+"\n"); 
		System.out.println(sd.isTodayAHoliday()+"\n"); */
		
		AdminDepartment ad = new AdminDepartment();
		System.out.println("Welcome to "+ad.departmentName()+"\n"); 
		System.out.println(ad.getTodaysWork()+"\n"); 
		System.out.println(ad.getWorkDeadline()+"\n"); 
		System.out.println(ad.isTodayAHoliday()+"\n\n"); 
	
		 
		
		HrDepartment hd = new HrDepartment();
		System.out.println("Welcome to "+hd.departmentName()+"\n"); 
		System.out.println(hd.doActivity()+"\n"); 
		System.out.println(hd.getTodaysWork()+"\n"); 
		System.out.println(hd.getWorkDeadline()+"\n"); 
		System.out.println(hd.isTodayAHoliday()+"\n\n"); 
		
		
		
		TechDepartment td = new TechDepartment();
		System.out.println("Welcome to "+td.departmentName()+"\n"); 
		System.out.println(td.getTodaysWork()+"\n"); 
		System.out.println(td.getWorkDeadline()+"\n"); 
		System.out.println(td.getTechStackInformation()+"\n"); 
		System.out.println(td.isTodayAHoliday()+"\n");
		
		
	}
	
	
}
