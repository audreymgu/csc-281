package sort;

public class Insertion{
  
  public static int assignCount = 0;
  
  public static int[] ascending(int[] array){
    int i, j, newValue;
    
    for (i = 1; i < array.length; i++) {
      
      newValue = array[i]; //ASSIGNMENT
      assignCount += 1;
      j = i;  
      
      while (j > 0 && array[j - 1] > newValue) {   
        array[j] = array[j - 1]; //ASSIGNMENT
        assignCount += 1;
        j--;      
      }
      
      array[j] = newValue; //ASSIGNMENT
      assignCount += 1;
    }
     
    return array;
  }
  
  public static int[] descending(int[] array){
    int itemsSorted;
    int currentNum;
    int i;  

    for (itemsSorted = 1; itemsSorted < array.length; itemsSorted++) {
       
      currentNum = array[itemsSorted]; //ASSIGNMENT
      assignCount += 1;
      
      for(i = itemsSorted - 1; (i >= 0) && (array[i] < currentNum); i--) {       
        array[i + 1] = array[i]; //ASSIGNMENT
        assignCount += 1;      
      }
      
      array[i + 1] = currentNum; //ASSIGNMENT
      assignCount += 1;
    }
 
    return array;
  }
}
