package com.company.main;

import com.company.Admindept.AdminDeaprtment;
import com.company.HRdept.HumanResourceDepartment;
import com.company.Techdept.TechDepartmet;

public class Main{
	public static void main(String [] args) {
		HumanResourceDepartment HumanResourceDepartment = new HumanResourceDepartment();
		System.out.println(HumanResourceDepartment.getDepartmentName());
		System.out.println(HumanResourceDepartment.getTodaysWork());
		System.out.println(HumanResourceDepartment.getWorkDeadline());
		System.out.println(HumanResourceDepartment.doActivity());
		
		TechDepartmet techDepartment = new TechDepartmet();
		System.out.println(techDepartment.getDepartmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		
		AdminDeaprtment adminDepartment = new AdminDeaprtment();
		System.out.println(adminDepartment.getDepartmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		
		
	}
}
