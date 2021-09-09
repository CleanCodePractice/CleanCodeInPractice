package com.fantasticreporter.timesheet;

import java.util.HashMap;
import java.util.Map;

public class Timesheet {

  private Map<EmployeeImpl, int[]> employeesTimesheet;

  public Timesheet(){
    employeesTimesheet = new HashMap<EmployeeImpl, int[]>();
    employeesTimesheet.put(new EmployeeImpl(12345, "Marco", "2019-01-01"), new int[] {0, 2, 1, 1, 0});
    employeesTimesheet.put(new EmployeeImpl(6843248, "David", "2019-05-01"), new int[] {1, 1, 1, 1, 0});
    employeesTimesheet.put(new EmployeeImpl(2334, "Surya", "1990-05-01"), new int[] {1, 1, 1, 1, 0});
    employeesTimesheet.put(new EmployeeImpl(2343, "Aleksandr", "1986-12-03"), new int[] {1, 1, 1, 1, 1});
  }

  public Map<EmployeeImpl, int[]> getEmployeesTimesheet(){
    return employeesTimesheet;
  }
}
