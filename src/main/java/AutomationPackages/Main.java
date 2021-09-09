package AutomationPackages;

import java.text.ParseException;
import java.util.Map;

public class Main {

  public static void main(String[] args) throws ParseException {
    employeesmanager themanager = new employeesmanager();

    System.out.println("Company absence report: " + themanager.getThem().size());
    System.out.println("People information is: ");

    for(Map.Entry<empInfo, Integer> entry : themanager.getThem().entrySet()) {
      System.out.println(entry.getKey().dsc_emp() + " - " + entry.getKey().numberOfEmployee() + " - " + entry.getValue() + " - "+ entry.getKey().ymddobemp());
      if(entry.getValue() == 0){
        System.out.println("Congratulations!");
      }else if(entry.getValue() == 1){
        System.out.println("Please provide justification.");
      }else{
        System.out.println("Please go to HR!");
      }
      System.out.println();
    }
  }
}
