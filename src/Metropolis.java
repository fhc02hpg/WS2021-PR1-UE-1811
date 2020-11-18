public class Metropolis {

  public static boolean isMetropolis(boolean isCapital,
        int inhabitants, double taxPerPersonAndMonth) {

    //cond1 && cond2 && cond3 && ...
    //cond1 || cond2 || cond3 || ...

    //cond1 && cond2 || cond3 && cond 4
    //(cond1 && cond2) || (cond3 && cond 4)

    //cond1 && (cond2 || cond3)
    //(cond1 && cond2) || cond3

    // 3 + 4 * 5
    // 3 + 20 = 23
    // (3+4) * 5 = 35

    boolean condition1 = (isCapital == true) && inhabitants > 100_000;
    double totalTax = taxPerPersonAndMonth * 12 * inhabitants;
    boolean condition2 = inhabitants > 200_000 && totalTax >= 720_000_000;
    return condition1 || condition2;

  }

  public static void main(String[] args) {

    //positive examples
    System.out.println(
        isMetropolis(true,125_000,0.0)//true
    );
    System.out.println(
        isMetropolis(false,201_000,800.0)//true
    );

    //negative example
    System.out.println(
        isMetropolis(false,850,1500.0)//false
    );
    System.out.println(
        isMetropolis(false,500_000,10.0)//false
    );

  }

}
