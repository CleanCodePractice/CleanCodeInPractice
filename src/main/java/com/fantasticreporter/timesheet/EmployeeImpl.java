package com.fantasticreporter.timesheet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeImpl implements Person {

  private String employeeName;
  private PhoneNumber phoneNumber;
  private String employeePhoneNumber;
  private String employeeDateOfBirth;

  public EmployeeImpl(int employeePhoneNumber, String employeeName, String employeeDateOfBirth){
    this.phoneNumber = new PhoneNumber();
    this.employeePhoneNumber = this.phoneNumber.parsePhoneNumber(employeePhoneNumber);
    this.employeeName = employeeName;
    this.employeeDateOfBirth = employeeDateOfBirth;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public String getEmployeePhoneNumberAsString() {
    return employeePhoneNumber;
  }

  public String getEmployeeDateOfBirth() throws ParseException {
    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    Date date = simpleDateFormat.parse(employeeDateOfBirth);

    return simpleDateFormat.format(date);
  }
}
