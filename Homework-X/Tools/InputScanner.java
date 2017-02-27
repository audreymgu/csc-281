package Tools;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class InputScanner {
	public List<Object> inputList = new ArrayList<>();
	public void scan() {
		File inputFile = new File("input.txt");
		try {
			Scanner scannerInstance = new Scanner(inputFile);
			while (scannerInstance.hasNextLine()) {
				Object line = scannerInstance.nextLine();
				inputList.add(line);
			}
			scannerInstance.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}