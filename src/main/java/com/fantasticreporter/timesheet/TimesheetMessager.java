package com.fantasticreporter.timesheet;

public class TimesheetMessager {

  static String messageToEmployee;

  public static String getMessageToEmployeeBasedOnAbsence(int absentDays) {

    if(absentDays == 0){
      setCongratulationMessage();
    }else if(absentDays == 1){
      setWarningMessage();
    }else{
      setNoticeMessage();
    }

    return messageToEmployee;
  }

  private static void setNoticeMessage() {
    messageToEmployee = "Please go to HR!";
  }

  private static void setWarningMessage() {
    messageToEmployee = "Please provide justification.";
  }

  private static void setCongratulationMessage(){
    messageToEmployee = "Congratulations!";
  }

}
