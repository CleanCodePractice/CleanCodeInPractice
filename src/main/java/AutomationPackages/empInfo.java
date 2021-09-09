package AutomationPackages;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class empInfo implements IPerson {

  private String dsc_emp;
  private PhoneNumber phoneNumberString;
  private String n; // The number of the employee.
  private String ymddobemp;

  public empInfo(int phoneNumber, String name, String date){
    phoneNumberString = new PhoneNumber();
    n = this.phoneNumberString.phone_number(phoneNumber);
    this.dsc_emp = name;
    this.ymddobemp = date;
  }

  public String dsc_emp() {
    return dsc_emp;
  }

  public String numberOfEmployee() {
    return n;
  }

  public String ymddobemp() throws ParseException {

    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    Date date = simpleDateFormat.parse(ymddobemp);

    return simpleDateFormat.format(date);
  }
}
