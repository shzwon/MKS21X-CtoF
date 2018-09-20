import java.util.Scanner;

public boolean CtoFTester(int a, int b){
  System.out.println("enter 0 for C-to-F \n enter 1 for F-to-C");
  Scanner b = new Scanner (System.in);
  long a;
  if (b == 0);
    System.out.println (celsiusToFahrenheit(a));
  else
    System.out.println (fahrenheitToCelsius(a));
}

public int celsiusToFahrenheit(int tempC){
  long tempC = 0.0;
  return tempC = tempC * 1.8 + 32;
}

public int fahrenheitToCelsius(int tempF){
  long tempF = 0.0;
  return tempF = (tempF - 32) / 1.8
}


//-Create a java program with a class name of CtoFTester.java
//-Create two functions, celsiusToFahrenheit and fahrenheitToCelsius
//-BEFORE Writing the code, think about the following questions:
//    -What should the functions have as parameter(s) ? What type should they be?
//    -What should the functions return?
//-Compile and run as you write this, using a main function to run and test your two functions.
//-Commit any time you make progress towards your goal!
