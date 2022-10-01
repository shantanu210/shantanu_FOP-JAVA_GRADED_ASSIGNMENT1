package com.greatlearning.model;

import com.greatlearning.service.DepartmentService;

public class SuperDepartment implements DepartmentService{
	private String departmentName;
	
	public String departmentName() {
		
		return "Super Department";
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "No work as of now";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Nil";
	}

	@Override
	public String isTodayAHoliday() {
		// TODO Auto-generated method stub
		return "Today is not a holiday";
	}

}
