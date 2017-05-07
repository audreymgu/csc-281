//Score: 100 -- great job!

import sort.*;
import java.util.Random;
import java.util.Arrays;

public class SortingTest {

  //Main method
  public static void main(String[] args) {

    //Create new instance of SortingTest
    SortingTest tester = new SortingTest();

    //Print test results
    System.out.println("");
    System.out.println("TEST RESULTS");
    System.out.println("");
    tester.testAllSorters();

  }

  private void testAllSorters() {

    //Performance tests

    //Bubble Sort
    System.out.println("--BUBBLE SORT--");

    System.out.println("Average assignments in 10 ascending runs, for each case:");
    System.out.println("length 10: " + performanceBubbleAscending(10));
    System.out.println("length 100: " + performanceBubbleAscending(100));
    System.out.println("length 1000: " + performanceBubbleAscending(1000));
    System.out.println("");

    System.out.println("Average assignments in 10 descending runs, for each case:");
    System.out.println("length 10: " + performanceBubbleDescending(10));
    System.out.println("length 100: " + performanceBubbleDescending(100));
    System.out.println("length 1000: " + performanceBubbleDescending(1000));
    System.out.println("");

    //Insertion Sort
    System.out.println("--INSERTION SORT--");

    System.out.println("Average assignments in 10 ascending runs, for each case:");
    System.out.println("length 10: " + performanceInsertionAscending(10));
    System.out.println("length 100: " + performanceInsertionAscending(100));
    System.out.println("length 1000: " + performanceInsertionAscending(1000));
    System.out.println("");

    System.out.println("Average assignments in 10 descending runs, for each case:");
    System.out.println("length 10: " + performanceInsertionDescending(10));
    System.out.println("length 100: " + performanceInsertionDescending(100));
    System.out.println("length 1000: " + performanceInsertionDescending(1000));
    System.out.println("");

    //Selection Sort
    System.out.println("--SELECTION SORT--");

    System.out.println("Average assignments in 10 ascending runs, for each case:");
    System.out.println("length 10: " + performanceSelectionAscending(10));
    System.out.println("length 100: " + performanceSelectionAscending(100));
    System.out.println("length 1000: " + performanceSelectionAscending(1000));
    System.out.println("");

    System.out.println("Average assignments in 10 descending runs, for each case:");
    System.out.println("length 10: " + performanceSelectionDescending(10));
    System.out.println("length 100: " + performanceSelectionDescending(100));
    System.out.println("length 1000: " + performanceSelectionDescending(1000));
    System.out.println("");

  }

  // arrayGenerator

  /**
   * This method generates an integer array of specified size,
   * containing randomly generated values ranging from 1 to the
   * total number of array places. Repeat values are possible.
   *
   * @param size The requested array size.
   */

  private int[] arrayGenerator(int size) {
    int[] builtArray = new int[size];
    Random randomNum = new Random();

    for(int i = 0; i < builtArray.length; i++) {
      builtArray[i] = randomNum.nextInt((size - 1) + 1) + 1;
    }

    return builtArray;
  }

  // Performance Tests
  // These test methods are identical outside of differing algorithm calls.

  private double performanceBubbleAscending (int size) {

    for(int i = 0; i < 10; i++) {
      int[] testArray = arrayGenerator(size);
      int[] sortedArray = Bubble.ascending(testArray);
    }

    double finalSum = (double)(Bubble.assignCount / 10.0);
    Bubble.assignCount = 0;
    return finalSum;
  }

  private double performanceBubbleDescending (int size) {

    for(int i = 0; i < 10; i++) {
      int[] testArray = arrayGenerator(size);
      int[] sortedArray = Bubble.descending(testArray);
    }

    double finalSum = (double)(Bubble.assignCount / 10.0);
    Bubble.assignCount = 0;
    return finalSum;
  }

  private double performanceInsertionAscending (int size) {

    for(int i = 0; i < 10; i++) {
      int[] testArray = arrayGenerator(size);
      int[] sortedArray = Insertion.ascending(testArray);
    }

    double finalSum = (double)(Insertion.assignCount / 10.0);
    Insertion.assignCount = 0;
    return finalSum;
  }

  private double performanceInsertionDescending (int size) {

    for(int i = 0; i < 10; i++) {
      int[] testArray = arrayGenerator(size);
      int[] sortedArray = Insertion.descending(testArray);
    }

    double finalSum = (double)(Insertion.assignCount / 10.0);
    Insertion.assignCount = 0;
    return finalSum;
  }

  private double performanceSelectionAscending (int size) {

    for(int i = 0; i < 10; i++) {
      int[] testArray = arrayGenerator(size);
      int[] sortedArray = Selection.ascending(testArray);
    }

    double finalSum = (double)(Selection.assignCount / 10.0);
    Selection.assignCount = 0;
    return finalSum;
  }

  private double performanceSelectionDescending (int size) {

    for(int i = 0; i < 10; i++) {
      int[] testArray = arrayGenerator(size);
      int[] sortedArray = Selection.descending(testArray);
    }

    double finalSum = (double)(Selection.assignCount / 10.0);
    Selection.assignCount = 0;
    return finalSum;
  }

}
