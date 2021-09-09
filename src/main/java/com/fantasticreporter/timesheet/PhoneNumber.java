package com.fantasticreporter.timesheet;

public class PhoneNumber {

  private int phoneNumber;

  public String parsePhoneNumber(int phoneNumber){
    this.phoneNumber = phoneNumber;
    return Integer.toString(this.phoneNumber);
  }

}
