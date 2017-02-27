import Shapes.*;
import Tools.*;

public class Collider {  
  // Main method
  public static void main(String[] args) {
    // List of shapes
    List<BasicShape> spawnedShapes = new ArrayList<>();

    // Get requested shapes from input file
    InputScanner getInput = new InputScanner();
    getInput.scan();
    /* System.out.println(getInput.inputList); */

    // Spawn all requested shapes
    int i = 0;
    while (i < getInput.inputList.size()) {
      if((element instanceof String) && (element = "circle")) {
        Double xSpec = (Double) getInput.inputList.get(i+1);
        Double ySpec = (Double) getInput.inputList.get(i+2);
        Double rSpec = (Double) getInput.inputList.get(i+3);
        Circle newCircle = new Circle(xSpec, ySpec, rSpec);
        spawnedShapes.add(newCircle);
        i += 4;
      }
      else if((element instanceof String) && (element = "square")) {
        Double xSpec = (Double) getInput.inputList.get(i+1);
        Double ySpec = (Double) getInput.inputList.get(i+2);
        Double lSpec = (Double) getInput.inputList.get(i+3);
        Square newSquare = new Square(xSpec, ySpec, lSpec);
        spawnedShapes.add(newSquare);
        i += 4;
      }
      else if((element instanceof String) && (element = "rectangle")) {
        Double xSpec = (Double) getInput.inputList.get(i+1);
        Double ySpec = (Double) getInput.inputList.get(i+2);
        Double lSpec = (Double) getInput.inputList.get(i+3);
        Double hSpec = (Double) getInput.inputList.get(i+4);
        Rectangle newRectangle = new Rectangle(xSpec, ySpec, lSpec, hSpec);
        spawnedShapes.add(newRectangle);
        i += 5;
      }
      else if(element instanceof Double) {
        i += 1;
      }
    }
    System.out.println(spawnedShapes);
	  
    // Recursive collision check of shape pairs
 }
}
