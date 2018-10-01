public class CtoFTester{

  public static double celsiusToFahrenheit(double c){
    return (c * 1.8 +32.0);
  }


  public static double fahrenheitToCelsius(double f){
    return ((f - 32.0) /1.8);
  }

public static void main(String[] args) {
  System.out.println(celsiusToFahrenheit(3.0));
  System.out.println(celsiusToFahrenheit(12.0));
  System.out.println(fahrenheitToCelsius(32.0));
  System.out.println(fahrenheitToCelsius(48.0));
}


}


/* -Create a java program with a class name of CtoFTester.java
-Create two functions, celsiusToFahrenheit and fahrenheitToCelsius
-BEFORE Writing the code, think about the following questions:
    -What should the functions have as parameter(s) ? What type should they be?
    -What should the functions return?
-Compile and run as you write this, using a main function to run and test your two functions.
 -Commit any time you make progress towards your goal!
*/
