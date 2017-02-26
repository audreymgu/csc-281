/**
 * Homework 1 for CSC-281.001 Spring 2017
 * Your codename: Shurdriira
 */

import java.math.*;
import java.lang.StringBuilder;

public class Homework1 {

  /**
   * The entry point for the program.
   * 
   * @param args Commandline input arugments.
   */
  public static void main(String[] args) {
    Homework1 hw1 = new Homework1();

    System.out.println("===Problem 1===");
    hw1.problem1();

    System.out.println("===Problem 2===");
    System.out.println(hw1.topInt(1.5));
    System.out.println(hw1.topInt(5.1));
    System.out.println(hw1.topInt(1.0));
    System.out.println(hw1.topInt(-4.2));

    System.out.println("===Problem 3===");
    hw1.draw4x4('-');
    hw1.draw4x4('4');

    System.out.println("===Problem 4===");
    System.out.println(hw1.citationName("Alastair", "Reynolds"));
    System.out.println(hw1.citationName("Grace", "Hopper"));

    System.out.println("===Problem 5===");
    System.out.println(String.valueOf(hw1.min3(1.0, 2.0, 3.0)));
    System.out.println(String.valueOf(hw1.min3(4.0, 3.0, 2.0)));
    System.out.println(String.valueOf(hw1.min3(0.5, 0.1, 0.5)));
    
    System.out.println("===Problem 6===");
    System.out.println(hw1.fibonacci(0));
    System.out.println(hw1.fibonacci(1));
    System.out.println(hw1.fibonacci(2));
    System.out.println(hw1.fibonacci(3));
    System.out.println(hw1.fibonacci(10));
    System.out.println(hw1.fibonacci(25));
    
    
    System.out.println("===Problem 7===");
    System.out.println(hw1.isPalindrome("racecar"));
    System.out.println(hw1.isPalindrome("cat"));
    System.out.println(hw1.isPalindrome("hannah"));
    System.out.println(hw1.isPalindrome("saippuakivikauppias"));
  }

  // PROBLEM 1

  public void problem1() {
   
    /**
    * The first component of problem1 creates a variable of type double, result1, and assigns to it
    * the double value derived from dividing 5.0 by 4.0. Because all values are correctly typed, the correct result, 
    * 1.25, is stored.
    */
   
    double result1 = 5.0 / 4.0;
    System.out.println(result1);
    if (result1 == 1.25) {
      System.out.println("Problem 1a: successfully completed!");
    } else {
      System.out.println("Problem 1a: not quite right.");
    }

    /**
    * The second component uses Java's standard math library to store the value of four squared as the double result2.
    * All syntax is correct as-is.
    */

    double result2 = Math.pow(4,2);
    if (result2 == 16) {
      System.out.println("Problem 1b: successfully completed!");
    } else {
      System.out.println("Problem 1b: not quite right.");
    }
    
    /**
    * The third and final component creates two new strings and references them as strA and strB.
    * It then checks for equality between the two. The error lies in the type of equality being checked,
    * being initially an "==" rather than ".equals()."
    */

    String strA = new String("foo");
    String strB = new String("foo");
    if (strA.equals(strB)) { //prior boolean did not test for equality of string values
      System.out.println("Problem 1c: successfully completed!");
    } else {
      System.out.println("Problem 1c: not quite right.");
    }
  }

  // PROBLEM 2   

  /**
  * This method takes one double and returns an integer that is rounded up from that double.
  * This applies also to negative values (i.e., that the negative double -4.2
  * would be rounded up to -4.0, and so on).
  *
  * @param initialValue The input.
  * @return finalValue The final integer value, rounded up.
  */

  public int topInt(double initialValue) {
    int finalValue;
    int castValue = (int)initialValue;
    double switchCheck = initialValue % castValue;
    if(switchCheck <= 0.0) {
      finalValue = castValue;
    } else {
      finalValue = (int)(initialValue+1);
    }
    return finalValue;
  }

  // PROBLEM 3
 
  /**
  * This method takes a single character uses it to draw a 4x4 character rectangle
  * with an internal 2x2 white space..
  *
  * @param buildingBlock The input character.
  */

  public void draw4x4(char buildingBlock) {
    char rowEdge[] = new char[] {buildingBlock, buildingBlock, buildingBlock, buildingBlock};
    char rowMiddle[] = new char[] {buildingBlock,' ', ' ', buildingBlock} ;
    String rowOutA = new String(rowEdge);
    String rowOutB = new String(rowMiddle);
    System.out.println(rowOutA);
    System.out.println(rowOutB);
    System.out.println(rowOutB);
    System.out.println(rowOutA);
    // ABBA!
  }

  // PROBLEM 4
 
  /**
  *
  */

  public String citationName(String firstName, String lastName) {
    String firstInitial = firstName.substring(0, 1);
    String formatName = lastName + ", " + firstInitial + ".";
    return formatName;
  }

  // PROBLEM 5

  /**
  *
  */

  /* As a clarification, the formatting of the "test" statements is such that
   * the min3 method should not, in fact, be explicitly responsible for the printing
   * of the the minimum value. It should actually return the value; the instructions
   * presented are misleading, and will lead to compilation errors.
   */

  public double min3(double value1, double value2, double value3) {
    double minValue; 
    if(value1 < value2) {
      minValue = value1;
    } else {
      minValue = value2;
    }
    if(value3 < minValue) {
      minValue = value3;
    }
    return minValue;
  }

  // PROBLEM 6
  
  /**
  *
  */

  public int fibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
 
  // PROBLEM 7

  /**
  *
  */

  public boolean isPalindrome(String forward) {
    StringBuilder theSwitch = new StringBuilder();
    System.out.println(forward.length());
   
    //1-2-Switch!
    for (int i = forward.length(); i > 0; i--) {
      theSwitch.append(forward.substring(i-1, i));
    }
    String backward = theSwitch.toString();
    System.out.println(backward);
    if (forward.equals(backward)) {
      return true;
    } else {
      return false;
    }
  }
}
