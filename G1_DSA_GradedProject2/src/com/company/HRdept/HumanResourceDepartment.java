package com.company.HRdept;

import com.company.Superdept.SuperDepartment;

public class HumanResourceDepartment extends SuperDepartment {
	@Override
	public String getDepartmentName() {
		return "HR Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Fill today's Timesheet and mark your Attendence";
	}
	
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
		
	}

	public String doActivity() {
		return "Team Lunch";
	}
}
