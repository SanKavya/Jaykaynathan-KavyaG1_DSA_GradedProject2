package com.company.Admindept;

import com.company.Superdept.SuperDepartment ;

public class AdminDeaprtment extends SuperDepartment {
   public String getDepartmentName() {
	   return"Admin Department";
   }
   public String getTodaysWork() {
	   return "Complete your Document Submission";
   }
   
   public String getWorkDeadline() {
	   return"Complete by EOD";
   }
	
}
