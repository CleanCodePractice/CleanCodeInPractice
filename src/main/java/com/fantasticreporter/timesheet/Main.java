package com.fantasticreporter.timesheet;

import java.text.ParseException;
import java.util.Map;

public class Main {

  public static void main(String[] args) throws ParseException {
    var absenceReportGenerator = new AbsenceReportGenerator();
    var employeesAbsenceReport= absenceReportGenerator.getAbsenceReport();

    System.out.println("Company absence report: " + employeesAbsenceReport.size());
    System.out.println("People information is: ");

    for(Map.Entry<EmployeeImpl, Integer> employeeReport : employeesAbsenceReport.entrySet()) {
      var employeeName = employeeReport.getKey().getEmployeeName();
      var employeePhoneNumber = employeeReport.getKey().getEmployeePhoneNumberAsString();
      var numberOfAbsentDays = employeeReport.getValue();
      var employeeDateOfBirth = employeeReport.getKey().getEmployeeDateOfBirth();

      System.out.println( employeeName + " - " + employeePhoneNumber + " - " + numberOfAbsentDays
          + " - "+ employeeDateOfBirth);

      var message = TimesheetMessager.getMessageToEmployeeBasedOnAbsence(numberOfAbsentDays);
      System.out.println(message);
    }
  }
}
