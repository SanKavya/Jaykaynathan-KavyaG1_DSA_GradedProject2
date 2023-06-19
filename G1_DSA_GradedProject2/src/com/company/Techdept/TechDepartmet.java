package com.company.Techdept;

import com.company.Superdept.SuperDepartment;

public class TechDepartmet extends SuperDepartment{
	public char[] getDepartmetName;

	@Override
	public String getDepartmentName() {
		return "Tech Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		return "Core Java";
	}
	

}
