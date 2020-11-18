public class Repetition {

  //...weitere methoden

  public static void printIt() {
    ///...

    System.out.println(42 + " ist die Antwort auf Alles");

    //...
  }

  public static String buildAnswer(int number, String text) {
      String answer = number + " " + text + " -> ("+number+")";
      return answer;
  }

  public static void main(String[] args) {

    String a1 = buildAnswer(23, "dreiundzwanzig");
    System.out.println(a1);
    //System.out.println(buildAnswer(23, "dreiundzwanzig"));

    String a2 = buildAnswer(32, "was soll diese zahl?");
    System.out.println(a2);

    System.out.println(a1 + " | "+a2);

    printIt();

    System.out.println(a1);


    int number = 123439;
    char letter = 'z';
    boolean isRaining = false;
    float piNumber = 3.14f;
    double width = 12.34;
    long bigNumber = 12343948349534598L;

    System.out.println(bigNumber);
    System.out.println("first exercise");

    String text = "mein text";

    printIt();

    number++;
    number--;
    System.out.println("number = " + number);
    number = number + 10;
    number = number - 200;
    System.out.println("number = " + number);

    boolean result = bigNumber > number || number < 200000;




    System.out.println(result);

    printIt();

  }

  //...weitere methoden

}
