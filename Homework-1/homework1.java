/**
 * Homework 1 for CSC-281.001 Spring 2017
 * 
 * Your codename: Shurdriira
 * 
 * This assignment consists of 7 problems. Problem 1 asks you to modify existing
 * code for three subproblems.The remaining six problems each require you to 
 * write a method that satisfies the requirements stated in their descriptions.
 * 
 * You are required to create a javadoc style comment for each method you
 * create. See the sample method named add3 for an example to follow. 
 * 
 * Your homework will be graded in the following manner:
 * 70 points for correctness.
 * 		10 points per problem.
 * 		Does your input match the expected output exactly?
 * 30 points for following standards. Evaluation considerations for these points:
 *		Did you use vi to craft your code?
 *		Are camel case and Pascal case used correctly?
 * 		Did you follow the the submission instructions properly?
 */

import java.math.*; // math has been imported for you
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
    // Uncomment to print the results of calling your topInt method with the following input:
    System.out.println(hw1.topInt(1.5));
    System.out.println(hw1.topInt(5.1));
    System.out.println(hw1.topInt(1.0));
    System.out.println(hw1.topInt(-4.2));

    System.out.println("===Problem 3===");
    // Uncomment to print the results of calling your draw4x4 method with the following input:
    hw1.draw4x4('-');
    hw1.draw4x4('4');

    System.out.println("===Problem 4===");
    // Uncomment to print the results of calling your citationName method with the following input:
    System.out.println(hw1.citationName("Alastair", "Reynolds"));
    System.out.println(hw1.citationName("Grace", "Hopper"));

    System.out.println("===Problem 5===");
    // Uncomment to print the results of calling your min3 method with the following input:
    System.out.println(String.valueOf(hw1.min3(1.0, 2.0, 3.0)));
    System.out.println(String.valueOf(hw1.min3(4.0, 3.0, 2.0)));
    System.out.println(String.valueOf(hw1.min3(0.5, 0.1, 0.5)));
    
    System.out.println("===Problem 6===");
    // Uncomment to print the results of calling your fibonacci method with the following input:
    System.out.println(hw1.fibonacci(0));
    System.out.println(hw1.fibonacci(1));
    System.out.println(hw1.fibonacci(2));
    System.out.println(hw1.fibonacci(3));
    System.out.println(hw1.fibonacci(10));
    System.out.println(hw1.fibonacci(25));
    
    
    System.out.println("===Problem 7===");
    // Uncomment to print the results of calling your isPalindrome method with the following input:
    System.out.println(hw1.isPalindrome("racecar"));
    System.out.println(hw1.isPalindrome("cat"));
    System.out.println(hw1.isPalindrome("hannah"));
    System.out.println(hw1.isPalindrome("saippuakivikauppias"));
  }

  /**
   * (This is an example of a javadoc comment. All of your methods should have a similar comment.) 
   * This method adds three numbers together and returns
   * their sum.
   * 
   * @param x The first number to sum.
   * @param y The second number to sum.
   * @param z The third number to sum.
   * @return The sum of x, y, and z.
   */
  public double add3(double x, double y, double z) {
    return x + y + z;
  }

  /**
   * PROBLEM 1
   * Change the expressions in the variable assignments so the program prints "successfully
   * completed!". This may involve changing the arithmetic operators or the type of number that is
   * produced.
   */

  public void problem1() {
    /**
    *The first component of problem1 creates a variable of type double, result1, and assigns to it
    *the double value derived from dividing 5.0 by 4.0. Because all values are correctly typed, the correct result, 1.25, is stored.
    */
    double result1 = 5.0 / 4.0;
    System.out.println(result1);
    if (result1 == 1.25) {
      System.out.println("Problem 1a: successfully completed!");
    } else {
      System.out.println("Problem 1a: not quite right.");
    }

    /**
    *The second component uses Java's standard math library to store the value of four squared as the double result2.
    *All syntax is correct as-is.
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

  /*
   * PROBLEM 2
   *
   * When a double or float is cast into an integer via (int), the fractional part of the number
   * after that decimal place is thrown away (e.g. 3.3 becomes 3). An example: int x = (int)3.3;
   * 
   * 1) Write a method called "topInt" that takes a double as a parameter and returns an int that
   * is rounded up from the double instead of being rounded down.
   *
   * For example, 4.5 would become 5 (the lack of a decimal point after 5 is important). Take care
   * that your method does not round up numbers with no fractions (i.e. 5.0 should not be rounded
   * up to 6.0).
   *
   * Hint: use a method in the math package that we covered in class.
   * 
   * Your method will be ran with the following input: 1.5 5.1 1.0 -4.2
   */

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

  /*
   * PROBLEM 3
   * 
   * 1) Declare a method named "draw4x4" that prints a 4 by 4 box of a character. This character
   * should be defined by the first parameter of the method. This parameter should be of the char
   * data type. The output of this method is the printed box. This means there will be no return
   * statement in this method.
   *
   * Here is what the output of draw4x4('x') should look like: 
   * xxxx
   * x  x
   * x  x
   * xxxx
   *
   * Your method will be ran with the following input: '-' '4'
   */
  
  /**
  * This method takes a single character uses it to draw a 4x4 character rectangle
  * with an internal 2x2 white space..
  *
  *  @param buildingBlock The input character.
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
  /*
   * PROBLEM 4
   * 
   * 1) Write a method named "citationName" that takes two String parameters: a first name and a
   * last name. It should return a String that contains the last name concatenated with a comma, a
   * space, the first letter of the first name, and a period.
   *
   * This example: citationName("Jack", "Beatty") should return: "Beatty, J."
   *
   * Your method will be ran with the following input: "Alastair" "Reynolds", "Grace" "Hopper"
   */
  public String citationName(String firstName, String lastName) {
    String firstInitial = firstName.substring(0, 1);
    String formatName = lastName + ", " + firstInitial + ".";
    return formatName;
  }
  /*
   * PROBLEM 5
   * 
   * 1) Write a method named "min3" that takes 3 doubles as parameters and returns the lowest
   * value of the three.
   *
   * Print what your min3 method returns for the following triples of doubles as input: 1.0 2.0
   * 3.0, 4.0 3.0 2.0, 0.5 0.1 0.5
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
  /*
   * PROBLEM 6
   * 1) Write a method named fibonacci that calculates
   * Fibonacci numbers: http://en.wikipedia.org/wiki/Fibonacci_number
   *
   * Your fibonacci method should have a single int as its only parameter. It should return
   * the fibonacci number as in int.
   *
   * Assume the seed values of F(0) = 1 and F(1) = 1.
   *
   * This method should use recursion which means the method should call itself. 
   *
   * Your method will be ran on following input: 0,1,2,3,10,25
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
 
  /* PROBLEM 7
   * A palindrome is where a word or sentence is spelled the same
   * forward as it is backward. For example, "pop" is a palindrome where "cat" is not. The sentence
   * "Was it a car or a cat I saw" is a palindrome when the spaces are extracted and it is converted
   * to all lowercase letters.
   *
   * 1) Write a method named "isPalindrome" that takes a single String parameter. It should return
   * the boolean value of true if the string is a palindrome or false if it is not.
   *
   * Your method is only expected to run correctly on input consisting only of lowercase strings.
   *
   * Your method will be ran on the following input:
   * "racecar"
   * "cat"
   * "hannah"
   * "saippuakivikauppias"
   * 
   * hint: build a string that is the reverse of the input
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
