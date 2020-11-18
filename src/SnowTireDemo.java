public class SnowTireDemo {

  public static boolean useSnowTires(int temperature,boolean snowRoad) {
    //Winterreifen falls:
    //condition1: bei Schneefahrbahn und Temperatur < 8 Grad
    //oder
    //condition2: bei Temperatur < 0

                        //true == true -> true
                        //false == true -> false
    boolean condition1 = (snowRoad == true) && (temperature < 8);
    boolean condition2 = temperature < 0;
    return condition1 || condition2;

    //short form doing the same as above
    //return snowRoad && (temperature < 8) || temperature < 0;
  }

  public static void main(String[] args) {

    //negative examples

    System.out.println(useSnowTires(9,true)); //false
    System.out.println(useSnowTires(7,false)); //false
    //positive examples
    System.out.println(useSnowTires(-10,false)); //true
    System.out.println(useSnowTires(-5,true)); //true

    int currentTemp = readTempSensor();
    boolean isSnowy = checkSlush();

    useSnowTires(currentTemp,isSnowy);

    currentTemp = 10;
    isSnowy = true;

    useSnowTires(currentTemp,isSnowy);

  }

  public static int readTempSensor() {
    return 9; //wechselnder Wert
  }

  public static boolean checkSlush() {
    return false;
  }


}
