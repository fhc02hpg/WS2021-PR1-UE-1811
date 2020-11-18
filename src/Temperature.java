public class Temperature {

  public static double celsius2Fahrenheit(double celsius) {
    //ATTENTION! -> int division 9/5 = 1
    return 9/5.0 * celsius + 32;
  }

  public static double fahrenheit2Celsius(double fahrenheit) {
    return (fahrenheit - 32) * 5/9.0;
  }

  public static void main(String[] args) {

    double c1 = 40;

    double f1 = celsius2Fahrenheit(c1);
    System.out.println(c1 + " Grad Celsius sind "
        + f1 + " Grad Fahrenheit");

    double c2 = fahrenheit2Celsius(f1);
    System.out.println(f1 + " Grad Fahrenheit sind "
        + c2 + " Grad Celsius");

  }


}
