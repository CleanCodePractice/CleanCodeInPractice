package AutomationPackages;

import java.util.HashMap;
import java.util.Map;

public class employeesmanager {

  int z;

  public Map<empInfo, Integer> getThem(){
    Map<empInfo, Integer> managerslist = new HashMap<>();

    EmpData data = new EmpData();

    for(Map.Entry<empInfo, int[]> therepresentationfothecollectionofwholedata : data.getData().entrySet()){
      z =0;
      for(int theindexofcurrentemployee=0; theindexofcurrentemployee< therepresentationfothecollectionofwholedata.getValue().length; theindexofcurrentemployee++){
        if(therepresentationfothecollectionofwholedata.getValue()[theindexofcurrentemployee] == 0){
          z++;
        }
        managerslist.put(therepresentationfothecollectionofwholedata.getKey(), z);
      }
    }

    return managerslist;
  }

}
