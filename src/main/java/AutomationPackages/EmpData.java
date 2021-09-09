package AutomationPackages;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmpData {

  private Map<empInfo, int[]> data;

  public EmpData(){
    data = new HashMap<empInfo, int[]>();
    data.put(new empInfo(12345, "Marco", "2019-01-01"), new int[] {0, 2, 1, 1, 0});
    data.put(new empInfo(6843248, "David", "2019-05-01"), new int[] {1, 1, 1, 1, 0});
    data.put(new empInfo(2334, "Surya", "1990-05-01"), new int[] {1, 1, 1, 1, 0});
    data.put(new empInfo(2343, "Aleksandr", "1986-12-03"), new int[] {1, 1, 1, 1, 1});
  }

  public Map<empInfo, int[]> getData(){
    return data;
  }
}
