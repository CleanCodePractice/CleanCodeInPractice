package com.fantasticreporter.timesheet;

import java.util.HashMap;
import java.util.Map;

public class AbsenceReportGenerator {

  public Map<EmployeeImpl, Integer> getAbsenceReport(){
    Map<EmployeeImpl, Integer> absenceReport = new HashMap<>();
    Timesheet timesheet = new Timesheet();
    var employeesTimesheet = timesheet.getEmployeesTimesheet();

    for(Map.Entry<EmployeeImpl, int[]> employeeTimesheet : employeesTimesheet.entrySet()){
      int absenceCounter = 0;
      final int TOTAL_WORKED_DAYS = employeeTimesheet.getValue().length;

      for(int i=0; i< TOTAL_WORKED_DAYS; i++){

        int ATTENDANCE_STATUS = employeeTimesheet.getValue()[i];
        final int ABSENT = 0;

        if(ATTENDANCE_STATUS == ABSENT){
          absenceCounter++;
        }

        var employee = employeeTimesheet.getKey();

        absenceReport.put(employee, absenceCounter);
      }
    }

    return absenceReport;
  }

}
