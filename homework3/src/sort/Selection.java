package sort; 

public class Selection { 
	
	public static int assignCount = 0;
	
  public static int[] ascending(int a[]) {
    int n = a.length;
    
    for (int i = 0; i < n-1; i++) {
      int q = i;  
      
      for (int j = i+1; j < n; j++) {
        if (a[j] < a[q]) {
          q = j; 
        }
      }
      
	    int temp = a[i]; //ASSIGNMENT
	    assignCount += 1;
	    a[i] = a[q]; //ASSIGNMENT
	    assignCount += 1;
	    a[q] = temp; //ASSIGNMENT
	    assignCount += 1;
    }
    
    return a; 
  } 
  
  public static int[] descending(int a[]) {
	  int n = a.length;
		
		for (int i = 0; i < n-1; i++) {
		  int q = i;
		    
		  for (int j = i+1; j < n; j++) {
		    if (a[j] > a[q]) {
		      q = j; 
		    } 
		  }
		  
			int temp = a[i]; //ASSIGNMENT
			assignCount += 1;
			a[i] = a[q]; //ASSIGNMENT
			assignCount += 1;
			a[q] = temp;  //ASSIGNMENT
			assignCount += 1;
	 }
	 
	  return a; 
  } 
}

