package com.greatlearning.model;

public class HrDepartment extends SuperDepartment{

	public String departmentName() {
		return "HR Department";
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Fill today's timesheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}
		
	public String doActivity() {
		return "team Lunch";
	}		
		
		
	
}
