package sort; 

public class Bubble {

  public static int assignCount = 0;

  public static int[] ascending(int[] intArray) {
    int n = intArray.length;
    int temp = 0;
  
    for(int i=0; i < n; i++){  
      for(int j=1; j < (n-i); j++){
        if(intArray[j-1] > intArray[j]){
          temp = intArray[j]; //ASSIGNMENT
          assignCount += 1;
          intArray[j] = intArray[j - 1]; //ASSIGNMENT
          assignCount += 1;
          intArray[j - 1] = temp; //ASSIGNMENT
          assignCount += 1;
        }  
      }
    }
  
    //Print statements were removed, replaced with return statement
    return intArray;
  }

  public static int[] descending(int[] intArray) {
    int n = intArray.length;
    int temp = 0;

    for(int i=0; i < n; i++){
      for(int j=1; j < (n-i); j++){
        if(intArray[j-1] < intArray[j]){
          temp = intArray[j-1]; //ASSIGNMENT
          assignCount += 1;
          intArray[j-1] = intArray[j]; //ASSIGNMENT
          assignCount += 1;
          intArray[j] = temp; //ASSIGNMENT
          assignCount += 1;
        } 
      }
    }

    //Print statements were removed, replaced with return statement
    return intArray;
  }
  
}

