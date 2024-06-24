
import java.text.*;
import java.util.Date;

class Index {
  public static void main(String[] args) throws ParseException {

    // Creating Instance of SimpleDateFormat class to access properties and passing
    // argument(String patern of date we want)
    SimpleDateFormat ft = new SimpleDateFormat("dd-mm-yyyy");

    // formating date using ft(object(instance) of class SimpleDateFormat) method
    // format() and passing date to fomate it.
    String str = ft.format(new Date());

    System.out.println(str);

    // parsing a given String
    str = "02/18/1995";
    ft = new SimpleDateFormat("MM/dd/yyyy");
    Date date = ft.parse(str);

    // this will print the date as per parsed string
    System.out.println("Parsed Date : " + date);

  }
}
